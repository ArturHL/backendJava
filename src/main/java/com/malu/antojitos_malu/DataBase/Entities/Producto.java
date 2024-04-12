package com.malu.antojitos_malu.DataBase.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
@Table(name = "productos")
public class Producto {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_producto")
  private Integer idProducto;

  private String nombre;

  @Column(name = "id_categoria")
  private Integer idCategoria;

  private Boolean existencias;

  private Integer precio;

  // Relations

  @OneToMany(mappedBy = "productoImg")
  private List<ImagenesProducto> imagenesProducto;

  @ManyToOne
  @JoinColumn(name = "id_categoria", insertable = false, updatable = false)
  private Categoria categoria;

  @OneToMany(mappedBy = "productoOrden")
  private List<ProductosOrden> productosOrden;

  // Getters and Setters

  public Integer getIdProducto() {
    return idProducto;
  }

  public String getNombre() {
    return nombre;
  }

  public Integer getCategoria() {
    return idCategoria;
  }

  public Boolean getExistencias() {
    return existencias;
  }

  public Integer getPrecio() {
    return precio;
  }

  public void setIdProducto(Integer idProducto) {
    this.idProducto = idProducto;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setCategoria(Integer categoria) {
    this.idCategoria = categoria;
  }

  public void setExistencias(Boolean existencias) {
    this.existencias = existencias;
  }

  public void setPrecio(Integer precio) {
    this.precio = precio;
  }
}
