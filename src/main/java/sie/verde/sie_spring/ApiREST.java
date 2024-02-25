package sie.verde.sie_spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RestController;
import sie.verde.modelo.Individuo;

@Controller
public class ApiREST
{
    @GetMapping("/")
    public String index(Model modelo) {
        Individuo individuo = new Individuo();
        individuo.setNombre("Juan");
        individuo.setApellido("Perez");
        individuo.setEdad("25");
        individuo.setTelefono("1234567890");
        individuo.setEmail("sdas");
        modelo.addAttribute("individuo", individuo);
        modelo.addAttribute("mensaje", "Hola Mundo");
        return "index";
    }
}
