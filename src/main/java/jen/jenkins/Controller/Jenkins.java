package jen.jenkins.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jenkins")
public class Jenkins {

    @GetMapping
    public String hello() {
        return "Jenkins";
    }

}
