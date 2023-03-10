package com.neuedu.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("student1")
public class Student extends User{
//    Integer id;
//    Integer userid;
    private Integer classId;
    private String email;
    private String sex;
}
