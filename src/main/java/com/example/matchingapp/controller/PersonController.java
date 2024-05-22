package com.example.matchingapp.controller;

import com.example.matchingapp.domain.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Controller
@RequestMapping("/person")
public class PersonController {
    @GetMapping("")
    public String index(Model model) {
        List<Person> personList = new ArrayList<>();

        //サンプルデータ
        personList.add(new Person("ちゅうぐん","otoko.png","男性",new Date(),"chugun@example.com","こんにちは！","A",null));
        personList.add(new Person("えいこ","onnna.png","女性",new Date(),"eiko@sample.com","中郡母です。","A",null));

        model.addAttribute("personList",personList);
        return "person";
    }
}