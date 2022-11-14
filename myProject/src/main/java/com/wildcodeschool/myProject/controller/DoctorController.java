package com.wildcodeschool.myProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoctorController {
    @GetMapping("/doctor/1")
    @ResponseBody
    public String index1() {
        return "doctor 1";
    }
    @GetMapping("/doctor/10")
    @ResponseBody
    public String index10() {
        return "doctor 2";
    }
    @GetMapping("/doctor/13")
    @ResponseBody
    public String index13() {
        return "doctor 3";
    }

}
