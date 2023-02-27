COLOUR GAME:

package com.example.springapp.Controllers;

import javax.annotation.Resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ApiController {
    @RequestMapping("/")
    public String getMyFav(){
        return "My favorite color is Black";
    }
}
