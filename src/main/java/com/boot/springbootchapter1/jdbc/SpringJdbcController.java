package com.boot.springbootchapter1.jdbc;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class SpringJdbcController {

    private JdbcTemplate jdbcTemplate;

    public SpringJdbcController(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @GetMapping
    public List<User> queryUser(){
        String sql = "select * from t_user";
        return jdbcTemplate.query(sql,new Object[]{},new BeanPropertyRowMapper<>(User.class));
    }

    @GetMapping("/{id}")
    public User getuser(@PathVariable Long id){
        String sql = "select * from t_user where id = ?";
        return jdbcTemplate.queryForObject(sql,new Object[]{id},new BeanPropertyRowMapper<>(User.class));
    }

    @PostMapping
    public int addUser(@RequestBody User user){
        String sql = "insert into t_user(usename,password) values (?,?)";
        return jdbcTemplate.update(sql,user.getUsename(),user.getPassword());
    }
}
