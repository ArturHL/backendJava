package com.malu.antojitos_malu.DataBase.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "usuarios")
public class Usuario {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_usuarios")
  private Integer idUsuarios;

  private String nombre;

  private String correo;

  private String telefono;

  private String contrasena;

  // Relations

  @OneToMany(mappedBy = "usuarioImg")
  private List<ImagenesUsuario> imagenesUsuario;

  @OneToMany(mappedBy = "usuarioDireccion")
  private List<Direccion> direcciones;

  @OneToMany(mappedBy = "usuarioReserva")
  private List<Reserva> reservas;

  @OneToMany(mappedBy = "usuarioMetodoPago")
  private List<MetodoPago> metodosPago;

  @OneToMany(mappedBy = "usuarioOrden")
  private List<Orden> ordenes;

  // Getters
  public Integer getIdUsuarios() {
    return idUsuarios;
  }

  public String getNombre() {
    return nombre;
  }

  public String getCorreo() {
    return correo;
  }

  public String getTelefono() {
    return telefono;
  }

  public String getContrasena() {
    return contrasena;
  }

  // Setters
  public void setIdUsuarios(Integer idUsuarios) {
    this.idUsuarios = idUsuarios;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setCorreo(String correo) {
    this.correo = correo;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public void setContrasena(String contrasena) {
    this.contrasena = contrasena;
  }

}
