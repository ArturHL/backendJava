package com.malu.antojitos_malu.DataBase.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
  private String fechaExpiracion;

  private String cvv;

  // Relations

  @ManyToOne
  @JoinColumn(name = "id_usuario", insertable = false, updatable = false)
  private Usuario usuarioMetodoPago;

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
    return fechaExpiracion;
  }

  public void setFechaExpiracion(String fechaExpiracion) {
    this.fechaExpiracion = fechaExpiracion;
  }

  public String getCvv() {
    return cvv;
  }

  public void setCvv(String cvv) {
    this.cvv = cvv;
  }
}
