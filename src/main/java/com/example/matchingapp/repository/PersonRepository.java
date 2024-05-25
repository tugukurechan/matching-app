package com.example.matchingapp.repository;

import com.example.matchingapp.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonRepository {
    @Autowired
    private NamedParameterJdbcTemplate template;

    private static final RowMapper<Person> PERSON_ROW_MAPPER
            = new BeanPropertyRowMapper<>(Person.class);

    /**
     * loadメソッド.
     *
     * @param id 利用者id
     * @return id番目の利用者情報
     */
    public Person load(Integer id){
        String sql = "SELECT id,name,image,gender,birth_day,mail_address,password,comment,blood_type,match_list" +
                " FROM persons WHERE id = :id;";
        SqlParameterSource param = new MapSqlParameterSource().addValue("id",id);
        return template.queryForObject(sql,param,PERSON_ROW_MAPPER);
    }

    /**
     * 利用者情報の全表示.
     * 
     * @return 利用者の全情報
     */
    public List<Person> findAll(){
        String sql = "SELECT id,name,image,gender,birth_day,mail_address,password,comment,blood_type,match_list" +
                " FROM persons ORDER BY id;";
        return template.query(sql,PERSON_ROW_MAPPER);
    }
}
