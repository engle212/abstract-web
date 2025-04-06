package app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AbstractController {
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("testString", "Index");
        return "index";
    }

}
