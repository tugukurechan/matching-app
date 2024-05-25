package com.example.matchingapp.repository;

import com.example.matchingapp.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
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


    /**
     * insert&update文.
     *
     * @param person 挿入するpersonデータ
     * @return 使用したpersonデータ
     */
    public Person save(Person person){
        SqlParameterSource param = new BeanPropertySqlParameterSource(person);

        if(person.getId() == null){
            //friends(ID)というテーブルを作って、この人の友達管理テーブルを作成
            String createSql = "CREATE TABLE friends"+person.getId()+
                    "(id serial NOT NULL,friend_code Integer NOT NULL);";

            //personsテーブルに追加
            String insertSql = "INSERT INTO persons(id,name,image,gender,birth_day,mail_address," +
                    "password,comment,blood_type) VALUES(:name,:image,:gender,:birthDay,:mailAddress," +
                    ":password,:comment,:bloodType);";

            //create table
            template.update(createSql,param);

            //insert
            template.update(insertSql,param);
        }else{
            String updateSql = "UPDATE persons SET name = :name,image = :image," +
                    "gender = :gender,birth_day = :birthDay,mail_address = :mailAddress," +
                    "password = :password,comment = :comment,blood_type = :bloodType" +
                    " WHERE id = :id;";
            template.update(updateSql,param);
        }
        return person;
    }

    /**
     * idから情報を削除する.
     *
     * @param id id
     */
    public void deleteById(Integer id){
        String deleteSql = "DELETE FROM persons WHERE id = :id;";
        SqlParameterSource param = new MapSqlParameterSource().addValue("id",id);
        template.update(deleteSql,param);
    }
}
