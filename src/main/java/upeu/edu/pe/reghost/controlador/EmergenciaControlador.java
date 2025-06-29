package upeu.edu.pe.reghost.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import upeu.edu.pe.reghost.entidades.Emergencias;
import upeu.edu.pe.reghost.servicio.EmergenciaServicio;

import java.time.LocalDateTime;
import java.util.List;

@Controller
@RequestMapping("/emergencias")
public class EmergenciaControlador {

    @Autowired
    private EmergenciaServicio emergenciaServicio;

    @GetMapping("/")
    public String listarEmergencias(Model modelo) {
        List<Emergencias> listaEmergencias = emergenciaServicio.listAll();
        modelo.addAttribute("listaEmergencias", listaEmergencias);
        return "emergencias/lista_emergencias";
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioNuevo(Model modelo) {
        Emergencias emergencia = new Emergencias();
        emergencia.setFechaHora(LocalDateTime.now());
        modelo.addAttribute("emergencia", emergencia);
        return "emergencias/nueva_emergencia";
    }

    @PostMapping("/guardar")
    public String guardarEmergencia(@ModelAttribute("emergencia") Emergencias emergencia) {
        if (emergencia.getFechaHora() == null) {
            emergencia.setFechaHora(LocalDateTime.now());
        }
        emergenciaServicio.save(emergencia);
        return "redirect:/emergencias/";
    }

    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditar(@PathVariable("id") Long id, Model modelo) {
        Emergencias emergencia = emergenciaServicio.get(id);
        modelo.addAttribute("emergencia", emergencia);
        return "emergencias/editar_emergencia";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarEmergencia(@PathVariable("id") Long id) {
        emergenciaServicio.delete(id);
        return "redirect:/emergencias/";
    }
}