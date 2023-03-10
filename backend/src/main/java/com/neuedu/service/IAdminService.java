package com.neuedu.service;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.neuedu.comtroller.utils.R;
import com.neuedu.entity.Admin;
import com.neuedu.entity.User;

public interface IAdminService extends IService<Admin> {
    IPage<Admin> getPage2(int currentPage, int pageSize);

    IPage<Admin> getPage2(int currentPage, int pageSize, Admin classText);

}
