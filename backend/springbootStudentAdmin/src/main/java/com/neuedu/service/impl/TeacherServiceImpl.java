package com.neuedu.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.neuedu.dao.TeacherMapper;
import com.neuedu.entity.Teacher;
import com.neuedu.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper, Teacher> implements ITeacherService {
    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public IPage<Teacher> getPage4(int currentPage, int pageSize) {
        IPage page = new Page(currentPage, pageSize);
        teacherMapper.selectPage(page, null);
        return null;
    }

    @Override
    public IPage<Teacher> getPage4(int currentPage, int pageSize, Teacher classText) {
        return null;
    }
}
