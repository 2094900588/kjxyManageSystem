package com.neuedu.comtroller;

import com.neuedu.comtroller.utils.R;
import com.neuedu.entity.Admin;
import com.neuedu.entity.User;
import com.neuedu.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/api/admin")
@CrossOrigin
public class AdminController {
    @Autowired
    private IAdminService adminService;

    @GetMapping("/list")
    public R getAll() {
        return new R(true, adminService.list());
    }

    @PostMapping("/add")
    public R save(@RequestBody Admin admin) throws IOException {
        boolean flag = adminService.save(admin);
        return new R(flag, flag ? "添加成功TvT" : "添加失败TnT");
    }

    @PostMapping("/update")
    public R update(@RequestBody Admin admin) {
        return new R(adminService.updateById(admin));
    }

    @GetMapping("/del")
    public R delete(@RequestParam Integer id) {
        return new R(adminService.removeById(id));
    }

    @GetMapping("/getinfo")
    public R getById(@RequestParam Integer id) {
        return new R(true, adminService.getById(id));
    }
}
