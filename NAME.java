NAME:

package com.example.springapp.Controllers;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController


public class ApiController{
   @RequestMapping("/")
   public String getName(){
       return "Welcome IamNeo!";
   }
}