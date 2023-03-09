package com.neuedu.entity;

import lombok.Data;

@Data
public class Student {
    private Integer id;
    private Integer class_id;
    private String username;
    private String name;
    private String password;
    private String email;
    private String sex;
}
