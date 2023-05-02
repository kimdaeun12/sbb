package com.example.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @GetMapping("/name")
    @ResponseBody
    public String name() {
        return "김다은";
    }

    @GetMapping("/age")
    @ResponseBody
    public int age() {
        return 25;
    }

    @GetMapping("/height")
    @ResponseBody
    public int height() {
        return 163;
    }
}
