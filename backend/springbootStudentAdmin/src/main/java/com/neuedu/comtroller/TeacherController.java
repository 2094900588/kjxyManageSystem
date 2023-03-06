package com.neuedu.comtroller;

import com.neuedu.comtroller.utils.R;
import com.neuedu.entity.Teacher;
import com.neuedu.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    private ITeacherService teacherService;

    @GetMapping("/list")
    public R getAll() {
        return new R(true, teacherService.list());
    }

    @PostMapping
    public R save(@RequestBody Teacher teacher) {
        boolean flag = teacherService.save(teacher);
        return new R(flag, flag ? "添加成功TvT" : "添加失败TnT");
    }

    @PutMapping
    public R update(@RequestBody Teacher teacher) {
        return new R(teacherService.updateById(teacher));
    }

    @DeleteMapping("{id}")
    public R delete(@PathVariable Integer id) {
        return new R(teacherService.removeById(id));
    }

    @GetMapping("{id}")
    public R getById(@PathVariable Integer id) {
        return new R(true, teacherService.getById(id));
    }
}
