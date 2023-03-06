package com.neuedu.comtroller;

import com.neuedu.comtroller.utils.R;
import com.neuedu.entity.Admin;
import com.neuedu.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private IAdminService adminService;

    @GetMapping("/list")
    public R getAll() {
        return new R(true, adminService.list());
    }

    @PostMapping
    public R save(@RequestBody Admin admin) throws IOException {
        boolean flag = adminService.save(admin);
        return new R(flag, flag ? "添加成功TvT" : "添加失败TnT");
    }

    @PutMapping
    public R update(@RequestBody Admin admin) {
        return new R(adminService.updateById(admin));
    }

    @DeleteMapping("{id}")
    public R delete(@PathVariable Integer id) {
        return new R(adminService.removeById(id));
    }

    @GetMapping("{id}")
    public R getById(@PathVariable Integer id) {
        return new R(true, adminService.getById(id));
    }
}
