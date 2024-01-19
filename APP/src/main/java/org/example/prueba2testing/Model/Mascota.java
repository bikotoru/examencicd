package org.example.prueba2testing.Model;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "mascotas")
public class Mascota {

    public Long getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(Long idMascota) {
        this.idMascota = idMascota;
    }

    public String getRutDueño() {
        return rutDueño;
    }

    public void setRutDueño(String rutDueño) {
        this.rutDueño = rutDueño;
    }

    public String getTipoMascota() {
        return tipoMascota;
    }

    public void setTipoMascota(String tipoMascota) {
        this.tipoMascota = tipoMascota;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public Mascota() {
    }

    public Mascota(String rutDueño, String tipoMascota, int edad, String nombreMascota) {
        this.rutDueño = rutDueño;
        this.tipoMascota = tipoMascota;
        this.edad = edad;
        this.nombreMascota = nombreMascota;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMascota;

    private String rutDueño;
    private String tipoMascota;
    private int edad;
    private String nombreMascota;

    @OneToMany(mappedBy = "mascota")
    private List<Agenda> agendas;

}
