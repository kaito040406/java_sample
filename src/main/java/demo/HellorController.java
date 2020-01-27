package demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HellorController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String SayHello(Model model) {
        model.addAttribute("msg", "Hello World!!!");
        return "hello";
    }
}