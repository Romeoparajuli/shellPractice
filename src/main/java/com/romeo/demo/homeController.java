package com.romeo.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class homeController {

    @RequestMapping("/") // Corrected: Added the @ symbol
    
    public String home() {
        return "home";
    }
}
