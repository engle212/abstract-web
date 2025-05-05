package app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collections;
import java.util.Map;

@Controller
public class AbstractController {
    @GetMapping("/")
    public String index(/*Model model*/) {
        //model.addAttribute("testString", "Index");
        return "index";
    }

    @GetMapping("/secured")
    public String secured(/*Model model*/) {
        //model.addAttribute("testString", "Index");
        return "secure page!";
    }

    /*@GetMapping("/user")
    public Map<String, Object> user(@AuthenticationPrincipal OAuth2User principal) {
        return Collections.singletonMap("name", principal.getAttribute("name"));
    }*/

}
