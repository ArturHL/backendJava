package com.malu.antojitos_malu.DataBase.Entities;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name = "metodos_pago")
public class MetodoPago {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_metodo_pago")
  private Integer idMetodoPago;

  @Column(name = "id_usuario")
  private Integer idUsuario;

  private String tipo;

  private String numero;

  @Column(name = "fecha_expiracion")
  private LocalDate fechaExpiracion;

  private String cvv;

  // Relations

  @ManyToOne
  @JoinColumn(name = "id_usuario", insertable = false, updatable = false)
  private Usuario usuarioMetodoPago;

  @OneToMany(mappedBy = "metodoPagoOrden")
  private List<Orden> metodoPagoOrdenes;

  // Getters and Setters

  public Integer getIdMetodoPago() {
    return idMetodoPago;
  }

  public void setIdMetodoPago(Integer idMetodoPago) {
    this.idMetodoPago = idMetodoPago;
  }

  public Integer getIdUsuario() {
    return idUsuario;
  }

  public void setIdUsuario(Integer idUsuario) {
    this.idUsuario = idUsuario;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public String getFechaExpiracion() {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    String fechaExpiracionString = fechaExpiracion.format(formatter);
    return fechaExpiracionString;
  }

  public void setFechaExpiracion(String fechaExpiracionString) {
    System.out.println(fechaExpiracionString);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM");
    try {
      YearMonth fechaExpiracion = YearMonth.parse(fechaExpiracionString, formatter);
      LocalDate fechaExpiracionDate = fechaExpiracion.atDay(1);
      this.fechaExpiracion = fechaExpiracionDate;
    } catch (Exception e) {
      System.out.println(fechaExpiracionString);
    }
  }

  public String getCvv() {
    return cvv;
  }

  public void setCvv(String cvv) {
    this.cvv = cvv;
  }
}
