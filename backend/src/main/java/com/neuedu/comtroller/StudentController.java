package com.neuedu.comtroller;

import com.neuedu.comtroller.utils.R;
import com.neuedu.entity.Student;
import com.neuedu.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/api/student")
@CrossOrigin
public class StudentController {
    @Autowired
    private IStudentService studentService;

    @GetMapping("/list")
    public R getAll() {
        return new R(true, studentService.list());
    }

    @PostMapping
    public R save(@RequestBody Student student) throws IOException {
        boolean flag = studentService.save(student);
        return new R(flag, flag ? "添加成功TvT" : "添加失败TnT");
    }

    @PutMapping
    public R update(@RequestBody Student student) {
        return new R(studentService.updateById(student));
    }

    @DeleteMapping("{id}")
    public R delete(@PathVariable Integer id) {
        return new R(studentService.removeById(id));
    }

    @GetMapping("{id}")
    public R getById(@PathVariable Integer id) {
        return new R(true, studentService.getById(id));
    }
}
