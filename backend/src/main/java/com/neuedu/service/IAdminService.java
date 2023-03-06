package com.neuedu.service;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.neuedu.entity.Admin;

public interface IAdminService extends IService<Admin> {
    IPage<Admin> getPage2(int currentPage, int pageSize);

    IPage<Admin> getPage2(int currentPage, int pageSize, Admin classText);
}
