package com.example.matchingapp.service;

import com.example.matchingapp.domain.Administrator;
import com.example.matchingapp.repository.AdministratorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdministratorService {
    @Autowired
    private AdministratorRepository repository;

    /**
     * 管理者情報を登録する.
     *
     * @param administrator 挿入する管理者情報
     */
    public void insert(Administrator administrator){
        repository.insert(administrator);
    }

    /**
     * メールアドレスとパスワードから該当者を表示する.
     *
     * @param mailAddress メールアドレス
     * @param password パスワード
     * @return 管理者情報
     */
    public Administrator login(String mailAddress,String password){
        return repository.findByMailAddressAndPassword(mailAddress,password);
    }
}
