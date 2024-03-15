package com.malu.antojitos_malu.DataBase.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

import java.util.List;

@Entity
@Table(name = "ordenes")
public class Orden {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_orden")
  private Integer idOrden;

  @Column(name = "id_usuario")
  private Integer idUsuario;

  private String fecha;

  private String total;

  private String estatus;

  // Relations

  @ManyToOne
  @JoinColumn(name = "id_usuario", insertable = false, updatable = false)
  private Usuario usuarioOrden;

  @OneToMany(mappedBy = "ordenProducto")
  private List<ProductosOrden> productosOrden;

  // Getters and Setters

  public Integer getIdOrden() {
    return idOrden;
  }

  public void setIdOrden(Integer idOrden) {
    this.idOrden = idOrden;
  }

  public String getFecha() {
    return fecha;
  }

  public void setFecha(String fecha) {
    this.fecha = fecha;
  }

  public String getTotal() {
    return total;
  }

  public void setTotal(String total) {
    this.total = total;
  }

  public String getEstatus() {
    return estatus;
  }

  public void setEstatus(String estatus) {
    this.estatus = estatus;
  }

  public Integer getIdUsuario() {
    return idUsuario;
  }

  public void setIdUsuario(Integer idUsuario) {
    this.idUsuario = idUsuario;
  }
  
}
