package app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AbstractController {
    @RequestMapping("/")
    public String home() {
        return "Hello world!";
    }
}
