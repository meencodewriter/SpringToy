package com.meencodewriter.toy.mainController;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class MainController {

    @GetMapping("/")
    public String getMainPage() {
        System.out.println("MainController.getMainPage");
        return "hello main";
    }
}
