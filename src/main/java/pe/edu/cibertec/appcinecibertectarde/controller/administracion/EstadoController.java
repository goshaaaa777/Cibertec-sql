package pe.edu.cibertec.appcinecibertectarde.controller.administracion;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.edu.cibertec.appcinecibertectarde.service.EstadoServices;

@Controller
@AllArgsConstructor
@RequestMapping("/administracion/estado")
public class EstadoController {

    private EstadoServices estadoService;
    @GetMapping("/frmestado")
    public String frmestado(Model model){
        model.addAttribute("listaestados",
                estadoService.listarEstados());
        return "administracion/frmestado";
    }
}
