package com.example.matchingapp.service;

import com.example.matchingapp.domain.Person;
import com.example.matchingapp.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Person(利用者情報)を扱うServiceクラス.
 *
 * @author tugukurechan
 */
@Service
public class PersonService {
    @Autowired
    private PersonRepository repository;

    /**
     * id番目の利用者情報をloadする
     *
     * @param id　id
     * @return 利用者情報
     */
    public Person load(Integer id){
        return repository.load(id);
    }

    /**
     * 利用者情報全件表示.
     *
     * @return 全利用者情報
     */
    public List<Person> findAll(){
        return repository.findAll();
    }
}
