package com.neuedu.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.neuedu.dao.AdminMapper;
import com.neuedu.entity.Admin;
import com.neuedu.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements IAdminService {
    @Autowired
    private AdminMapper adminMapper;

    @Override
    public IPage<Admin> getPage2(int currentPage, int pageSize) {
        IPage page = new Page(currentPage, pageSize);
        adminMapper.selectPage(page, null);
        return null;
    }

    @Override
    public IPage<Admin> getPage2(int currentPage, int pageSize, Admin classText) {
        return null;
    }




}
