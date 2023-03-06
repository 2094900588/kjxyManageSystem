package com.neuedu.entity;

import lombok.Data;

@Data
public class Teacher {
    private Integer id;
    private Integer department_id;
    private String number;
    private String name;
    private String password;
}
