package com.example.demo.Services;

import org.springframework.web.bind.annotation.GetMapping;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class IsItFriday {

    public String isItFriday() {
        LocalDate date = LocalDate.now();
        if (date.getDayOfWeek() == DayOfWeek.FRIDAY) {
            return "It is";
        } else {
            return "its not... sorry";
        }
    }
}
