package sie.verde.sie_spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sie.verde.modelo.Alumno;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ApiREST
{
    @GetMapping("/")
    public Map vistaInicio() {
        Map<String, Object> json = new HashMap<>();
        json.put("mensaje", "Hola Mundo");
        return json;
    }


}
