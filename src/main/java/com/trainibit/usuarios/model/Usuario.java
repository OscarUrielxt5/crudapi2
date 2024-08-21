package com.trainibit.usuarios.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "num_empleado")
    private String numEmpleado;

    @Column(name = "fecha_nacimiento")
    private Date fechaNacimiento;

    @Column(name = "fecha_ultimmo_acceso")
    private Date fechaUltimoAccesso;

    @Column(name = "puesto")
    private String puesto;

    @Column(name = "ind_activo")
    private Boolean indActivo;

    @Column(name = "nomUsuario", nullable = false)
    private String nomUsuario;

    @Column(name = "password")
    private String password;

    @Column(name = "uuid")
    private UUID uuid;


    public Usuario(String nombre, String numEmpleado, Date fechaNacimiento, Date fechaUltimoAccesso, String puesto, Boolean indActivo, String nomUsuario, String password, UUID uuid) {
        this.nombre = nombre;
        this.numEmpleado = numEmpleado;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaUltimoAccesso = fechaUltimoAccesso;
        this.puesto = puesto;
        this.indActivo = indActivo;
        this.nomUsuario = nomUsuario;
        this.password = password;
        this.uuid = uuid;
    }

    public Usuario() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
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

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

}
