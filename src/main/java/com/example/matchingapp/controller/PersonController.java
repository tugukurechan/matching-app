package com.example.matchingapp.controller;

import com.example.matchingapp.domain.Person;
import com.example.matchingapp.service.PersonService;
import jakarta.servlet.ServletContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * ログイン後の処理をするコントローラクラス.
 *
 * @author tugukurechan
 */
@Controller
@RequestMapping("/matching")
public class PersonController {
    @Autowired
    private PersonService service;

    /**
     * homeが押されたらhomeに遷移
     *
     * @return home画面
     */
    @GetMapping("/home")
    public String toHome(){
        return "person/home";
    }

    /**
     * talkが押されたらtalkに遷移
     *
     * @return talk画面
     */
    @GetMapping("/talk")
    public String toTalk(){
        return "person/talk";
    }

    /**
     * my pageが押されたらmy pageに遷移
     *
     * @return my page画面
     */
    @GetMapping("/myPage")
    public String toMyPage(){
        return "person/my-page";
    }
}