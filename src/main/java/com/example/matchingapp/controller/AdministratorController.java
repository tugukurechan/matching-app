package com.example.matchingapp.controller;

import com.example.matchingapp.domain.Administrator;
import com.example.matchingapp.form.LoginForm;
import com.example.matchingapp.form.RegisterForm;
import com.example.matchingapp.service.AdministratorService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Controller
@RequestMapping("/")
public class AdministratorController {
    @Autowired
    private AdministratorService service;

    @Autowired
    private HttpSession session;

    /**
     * 管理者情報登録画面に遷移する.
     *
     * @param form フォーム
     * @return 管理者情報登録画面
     */
    @GetMapping("/toInsert")
    public String toInsert(RegisterForm form,Model model){
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        model.addAttribute("initialDate",currentDate.format(formatter));
        return "administrator/register";
    }

    /**
     * 登録画面からのリクエストを受け取る.
     *
     * @param form フォーム
     * @param redirectAttributes リダイレクトスコープ
     * @return 管理者情報登録画面
     */
    @PostMapping("/insert")
    public String insert(@Validated RegisterForm form,BindingResult result ,RedirectAttributes redirectAttributes,Model model) {
        if(result.hasErrors()){
            return toInsert(form,model);
        }
        Administrator administrator = new Administrator();
        BeanUtils.copyProperties(form, administrator);
        service.insert(administrator);
        redirectAttributes.addFlashAttribute("administrator", administrator);
        return "redirect:/";
    }

    @GetMapping("/")
    public String toLogin(LoginForm form){
        return "administrator/login";
    }

    /**
     * ログインできるか判定、失敗ならログイン画面へ.
     *
     * @param form フォーム
     * @param model リクエストスコープ
     * @return 成功したらホーム画面へ
     */
    @GetMapping("/login")
    public String login(LoginForm form, Model model){
        Administrator administrator = service.login(form.getMailAddress(), form.getMailAddress());
        if(administrator == null){
            model.addAttribute("error_message","メールアドレスまたはパスワードが異なります");
            return "administrator/login";
        }
        session.setAttribute("administratorName",administrator.getName());
        return "redirect:/person/showHome";
        //ログイン処理が終わり、ホームに遷移
    }

    @GetMapping("/logout")
    public String logout(LoginForm form){
        session.invalidate();
        return "redirect:/";
    }
}
