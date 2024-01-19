package org.example.prueba2testing.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "duenos")
public class Dueño {

    @Id
    private String rut;

    public Dueño() {

    }

    public Dueño(String rut, String nombre, String apellido, String dirección, String correo, String teléfono) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dirección = dirección;
        this.correo = correo;
        this.teléfono = teléfono;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTeléfono() {
        return teléfono;
    }

    public void setTeléfono(String teléfono) {
        this.teléfono = teléfono;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    private String nombre;
    private String apellido;
    private String dirección;
    private String correo;
    private String teléfono;
    private String nombreMascota;

    @OneToMany(mappedBy = "dueño")
    private List<Agenda> agendas;

}
