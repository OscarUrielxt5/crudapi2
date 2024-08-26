package com.trainibit.usuarios.model;

import jakarta.persistence.*;


import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID uuid;

    private String nombre;
    private String numEmpleado;
    private Date fechaNacimiento;
    private Date fechaUltimoAccesso;
    private String puesto;
    private Boolean indActivo;
    private String nomUsuario;
    private String password;

    // Constructor vacío
    public Usuario() {
    }

    // Constructor completo con UUID
    public Usuario(UUID uuid, String nombre, String numEmpleado, Date fechaNacimiento, Date fechaUltimoAccesso, String puesto, Boolean indActivo, String nomUsuario, String password) {
        this.uuid = uuid;
        this.nombre = nombre;
        this.numEmpleado = numEmpleado;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaUltimoAccesso = fechaUltimoAccesso;
        this.puesto = puesto;
        this.indActivo = indActivo;
        this.nomUsuario = nomUsuario;
        this.password = password;
    }

    // Constructor sin UUID (por si quieres crear el UUID automáticamente)
    public Usuario(String nombre, String numEmpleado, Date fechaNacimiento, Date fechaUltimoAccesso, String puesto, Boolean indActivo, String nomUsuario, String password) {
        this.nombre = nombre;
        this.numEmpleado = numEmpleado;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaUltimoAccesso = fechaUltimoAccesso;
        this.puesto = puesto;
        this.indActivo = indActivo;
        this.nomUsuario = nomUsuario;
        this.password = password;
    }

    // Getters y Setters

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(String numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Date getFechaUltimoAccesso() {
        return fechaUltimoAccesso;
    }

    public void setFechaUltimoAccesso(Date fechaUltimoAccesso) {
        this.fechaUltimoAccesso = fechaUltimoAccesso;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public Boolean getIndActivo() {
        return indActivo;
    }

    public void setIndActivo(Boolean indActivo) {
        this.indActivo = indActivo;
    }

    public String getNomUsuario() {
        return nomUsuario;
    }

    public void setNomUsuario(String nomUsuario) {
        this.nomUsuario = nomUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
