package com.example.matchingapp.repository;

import com.example.matchingapp.domain.Administrator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Administratorクラスを操作するリポジトリクラス.
 *
 * @author tugukurechan
 */
@Repository
public class AdministratorRepository {
    @Autowired
    NamedParameterJdbcTemplate template;

    private static final RowMapper<Administrator> ADMINISTRATOR_ROW_MAPPER
            = new BeanPropertyRowMapper<>(Administrator.class);

    /**
     * 主キー検索.
     *
     * @param id 主キー
     * @return 管理者情報
     */
    public Administrator load(Integer id){
        String sql = "SELECT id,name,mail_address,password,birth_day,gender FROM administrators WHERE id = :id;";
        SqlParameterSource param = new MapSqlParameterSource().addValue("id",id);
        return template.queryForObject(sql,param,ADMINISTRATOR_ROW_MAPPER);
    }

    /**
     * 管理者情報を挿入する.
     *
     * @param administrator 管理者情報
     */
    public void insert(Administrator administrator){
        String sql = "INSERT INTO administrators(name,mail_address,password,birth_day,gender)" +
                " VALUES(:name,:mailAddress,:password,:birth_day,:gender)";
        SqlParameterSource param = new BeanPropertySqlParameterSource(administrator);
        template.update(sql,param);
    }

    /**
     * メールアドレスとパスワードから管理者情報を検索する.
     *
     * @param mailAddress メールアドレス
     * @param password パスワード
     * @return 管理者情報。なかったらnull
     */
    public Administrator findByMailAddressAndPassword(String mailAddress,String password){
        String sql = "SELECT id,name,mail_address,password,birth_day,gender FROM administrators " +
                "WHERE mail_address = :mailAddress and password = :password;";
        SqlParameterSource param = new MapSqlParameterSource().addValue("mailAddress",mailAddress)
                .addValue("password",password);
        List<Administrator> administratorList = template.query(sql,param,ADMINISTRATOR_ROW_MAPPER);
        if(administratorList.isEmpty()){
            return null;
        }
        return administratorList.get(0);
    }
}
