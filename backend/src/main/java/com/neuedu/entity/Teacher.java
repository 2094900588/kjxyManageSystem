package com.neuedu.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("teacher1")
public class Teacher extends User{
//    private String id;
//    private Integer userid;
    private Integer departmentId;
}
