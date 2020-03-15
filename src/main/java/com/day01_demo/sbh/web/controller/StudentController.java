package com.day01_demo.sbh.web.controller;

import com.day01_demo.sbh.bean.student;
import com.day01_demo.sbh.util.Message;
import com.day01_demo.sbh.util.MessageUtil;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/student")
@RestController
@Api(value = "学生控制器")
public class StudentController {
    @PostMapping("/add")
    @ApiOperation("添加学生")
    public Message add(){
        return MessageUtil.success("添加学生成功");
    }

    @GetMapping("/delete")
    @ApiOperation("删除学生")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "学号",dataType ="int" ,required = true,paramType = "query") ,
            @ApiImplicitParam(name = "name", value = "姓名",dataType = "string",paramType = "query")
    }
    )
    public Message delete(int id,String name){
        return MessageUtil.success("删除学生成功");
    }

    @GetMapping("/select")
    @ApiOperation("查看学生信息")
    public void select(student s){
        System.out.println(s);
    }
}
