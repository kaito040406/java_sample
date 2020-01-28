package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController{
    @Autowired
    private MemoRepository memoRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        return "index";
    }

    @GetMapping("/all")
    public @ResponseBody String getAllUsers(){
        String body = "";
        for (Memo memo : memoRepository.findAll()){
            body += memo.getTitle() + ": " + memo.getText() + "<br>";
        }
        return body;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addMemo(
            Model model, @ModelAttribute("outputForm") Form form
    ){
        model.addAttribute("title", form.getTitle());
        model.addAttribute("text", form.getText());

        Memo n = new Memo();
        n.setTitle(form.getTitle());
        n.setText(form.getText());
        memoRepository.save(n);

        return "saved";
    }
}