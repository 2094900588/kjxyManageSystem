package com.neuedu.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.neuedu.entity.Teacher;

public interface ITeacherService extends IService<Teacher> {
    IPage<Teacher> getPage4(int currentPage, int pageSize);

    IPage<Teacher> getPage4(int currentPage, int pageSize, Teacher classText);
}
