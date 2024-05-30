package com.example.matchingapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * ログイン後の処理をするコントローラクラス.
 *
 * @author takeru.chugun
 */
@Controller
@RequestMapping("/meet")
public class MeetController {

    /**
     * ホームページを表示する.
     *
     * @return ホームページ
     */
    @GetMapping("")
    public String homePage(){
        return "meet/meet";
    }

    /**
     * ログイン後に表示するホーム画面に遷移する
     *
     * @return ホーム画面
     */
    @GetMapping("/home")
    public String index() {
        return "person/home";
    }
}