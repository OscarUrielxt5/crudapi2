package com.trainibit.usuarios.response;


import java.util.Date;
import java.util.UUID;


public class UsuarioResponse {


    private String nombre;

    private String numEmpleado;

    private Date fechaNacimiento;

    private Date fechaUltimoAccesso;

    private String puesto;

    private Boolean indActivo;

    private String nomUsuario;


    private UUID uuid;

    //Edad del trabajador

    private Integer edad;

    //nombre mayusculas

    private String nombreMayusculas;

    //puesto + nombre

    private String puestoNombre;

    public UsuarioResponse() {

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


    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getNombreMayusculas() {
        return nombreMayusculas;
    }

    public void setNombreMayusculas(String nombreMayusculas) {
        this.nombreMayusculas = nombreMayusculas;
    }

    public String getPuestoNombre() {
        return puestoNombre;
    }

    public void setPuestoNombre(String puestoNombre) {
        this.puestoNombre = puestoNombre;
    }
}
