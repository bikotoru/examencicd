package org.example.prueba2testing.Model;
import jakarta.persistence.*;

@Entity
@Table(name = "agenda")
public class Agenda {

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public Dueño getDueño() {
        return dueño;
    }

    public void setDueño(Dueño dueño) {
        this.dueño = dueño;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public Agenda() {
    }

    public Agenda(Mascota mascota, Dueño dueño, String hora, String fecha) {
        this.mascota = mascota;
        this.dueño = dueño;
        this.hora = hora;
        this.fecha = fecha;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "idMascota", referencedColumnName = "idMascota")
    private Mascota mascota;

    @ManyToOne
    @JoinColumn(name = "rutDueño", referencedColumnName = "rut")
    private Dueño dueño;

    private String nombreMascota;
    private String hora;
    private String fecha;


}
