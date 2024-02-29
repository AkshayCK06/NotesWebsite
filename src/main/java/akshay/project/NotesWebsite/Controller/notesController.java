package akshay.project.NotesWebsite.Controller;

import akshay.project.NotesWebsite.model.modeluser;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class notesController {

    @RequestMapping("/registerUser")
    public String registerUser(@ModelAttribute modeluser){
        modeluser modelUser = new modeluser();
        modeluser.addAttribute(modeluser);
        return "register.html";
    }

    @RequestMapping("/registerUser")
    public String registerUser(@ModelAttribute modeluser){
        modeluser modelUser = new modeluser();
        modeluser.addAttribute(modeluser);
        return "register.html";
    }



}
