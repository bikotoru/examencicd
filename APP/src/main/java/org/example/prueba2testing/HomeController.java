package org.example.prueba2testing;
import org.example.prueba2testing.Model.Agenda;
import org.example.prueba2testing.Model.Dueño;
import org.example.prueba2testing.Model.Mascota;
import org.example.prueba2testing.Servicios.AgendaService;
import org.example.prueba2testing.Servicios.DueñoService;
import org.example.prueba2testing.Servicios.MascotaService;
import org.example.prueba2testing.Servicios.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @Autowired
    UsuarioService authenticationService;

    @Autowired
    AgendaService agendaService;

    @Autowired
    DueñoService dueñoService;

    @Autowired
    MascotaService mascotaService;



    @GetMapping("/")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "login";
    }
    @GetMapping("/home")
    public String home(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        var agenda = agendaService.listarCitas();
        model.addAttribute("agenda", agenda);
        return "home";

    }
    @PostMapping("/login")
    public String handleLogin(
            @RequestParam String username,
            @RequestParam String password,
            Model model) {

        var persona = authenticationService.iniciarSesion(username, password);

        if (persona == null) {
            model.addAttribute("error", "Credenciales inválidas. Inténtelo nuevamente.");
            return "login";
        } else {
            var agenda = agendaService.listarCitas();
            model.addAttribute("agenda", agenda);
            return "home";
        }
    }
    @GetMapping("/crear-cita")
    public String mostrarFormularioCrearCita() {
        return "crear-cita"; // Devuelve el nombre de la vista (crear-cita.html)
    }
    @PostMapping("/guardar-cita")
    public String guardarCita(@RequestParam("nombreMascota") String nombreMascota,
                              @RequestParam("tipoMascota") String tipoMascota,
                              @RequestParam("edad") int edad,
                              @RequestParam("rutDueño") String rutDueño,
                              @RequestParam("nombreDueño") String nombreDueño,
                              @RequestParam("apellido") String apellido,
                              @RequestParam("direccion") String direccion,
                              @RequestParam("correo") String correo,
                              @RequestParam("telefono") String telefono,
                              @RequestParam("hora") String hora,
                              @RequestParam("fecha") String fecha,
                              Model model) {

        var dueño = new Dueño(rutDueño, nombreDueño, apellido, direccion, correo, telefono);

        dueño = dueñoService.guardarDueño(dueño);
        var mascota = new Mascota(rutDueño, tipoMascota, edad, nombreMascota);

        mascota = mascotaService.guardarMascota(mascota);
        var agenda = new Agenda(mascota, dueño, hora, fecha);

        agendaService.crearCita(agenda);
        return "redirect:/home";
    }
}
