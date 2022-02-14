package com.example.demo.Controllers;

import com.example.demo.Services.IsItFriday;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.DayOfWeek;
import java.time.LocalDate;

@RestController
public class IndexController {

    @GetMapping("/hello")
    public String helloworld() {
        return "Well Hello There";
    }

    @GetMapping("/echo")
    public String echoAString(@RequestParam String str) {
        return "the output is " + str;
    }

    @GetMapping("/IsItFriday")
    public String getIsItFridayClass() {
        IsItFriday isItFridayClass = new IsItFriday();
        return isItFridayClass.isItFriday();
    }
}
