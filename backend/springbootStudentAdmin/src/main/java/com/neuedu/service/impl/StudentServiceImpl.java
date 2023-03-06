package com.neuedu.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.neuedu.dao.StudentMapper;
import com.neuedu.entity.Student;
import com.neuedu.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public IPage<Student> getPage3(int currentPage, int pageSize) {
        IPage page = new Page(currentPage, pageSize);
        studentMapper.selectPage(page, null);
        return null;
    }

    @Override
    public IPage<Student> getPage3(int currentPage, int pageSize, Student classText) {
        return null;
    }
}
