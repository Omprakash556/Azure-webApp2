package com.javainuse2.azure_webApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

    @GetMapping("/test")
    public String getMessage(){
        return "Finally application deploy on azure app service";
    }

}
