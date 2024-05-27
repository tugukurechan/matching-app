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


@Controller
@RequestMapping("/matching")
public class PersonController {
    @Autowired
    private ServletContext applcation;

    @Autowired
    private PersonService service;

    /**
     * ログイン画面を表示する.
     *
     * @return ログイン画面
     */
    @GetMapping("")
    public String login() {
        return "login";
    }
    
    /**
     * ログインが成功するとhome画面に移動する.
     *
     * @return ホーム画面
     */
    @PostMapping("/login")
    public String loginCheck(){
        return "home";
    }

    /**
     * 新規登録画面へ遷移する.
     *
     * @return 新規登録画面
     */
    @GetMapping("/toRegister")
    public String toRegister(){
        return "register";
    }

    @PostMapping("/register")
    public String register(){
        return "redirect:/matching";
    }
}