package sie.verde.sie_spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sie.verde.modelo.Alumno;

@Controller
public class ControladorUsuario
{
    @GetMapping("/inicio")
    public String vistaInicio(Model modelo) {
        Alumno individuo = new Alumno();
        individuo.setIdAlumno(2323);
        individuo.setNombre("Juan");
        individuo.setApellido("Perez");
        individuo.setEdad(25);
        individuo.setTelefono("1234567890");
        individuo.setEmail("sdas");
        modelo.addAttribute("individuo", individuo);
        modelo.addAttribute("mensaje", "Hola Mundo");
        return "Index";
    }

    @RequestMapping(value = "/alumnos", method = RequestMethod.GET)
    public String vistaAlumnos(Model modelo) {
        Alumno individuo = new Alumno();
        individuo.setIdAlumno(2323);
        individuo.setNombre("Juan");
        individuo.setApellido("Perez");
        individuo.setEdad(25);
        individuo.setTelefono("1234567890");
        individuo.setEmail("sdas");
        modelo.addAttribute("individuo", individuo);
        modelo.addAttribute("mensaje", "Hola Mundo");
        return "Alumnos";
    }
    @GetMapping("/")
    public String vistaAlumnos() {
        return "Login";
    }
}
