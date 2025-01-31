package gym.murasaki.MurasakiGym.Student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class StudentController {

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Essa e a minha primeira messagem nessa rota";
    }


}
