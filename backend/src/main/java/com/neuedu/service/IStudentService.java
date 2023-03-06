package com.neuedu.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.neuedu.entity.Student;

public interface IStudentService extends IService<Student> {
    IPage<Student> getPage3(int currentPage, int pageSize);

    IPage<Student> getPage3(int currentPage, int pageSize, Student classText);
}
