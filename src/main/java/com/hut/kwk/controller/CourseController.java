package com.hut.kwk.controller;

import com.github.pagehelper.PageInfo;
import com.hut.kwk.constant.ServerResponse;
import com.hut.kwk.model.entity.Course;
import com.hut.kwk.model.entity.NewCourse;
import com.hut.kwk.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/course/")
public class CourseController {
    @Autowired
    private ICourseService iCourseService;

    @RequestMapping("add")
    public ServerResponse<String> add(String courseName, Integer courseTime,Integer sord,
                                      Integer xuefen,
                                      Integer totalxueshi,
                                      Integer lilunxueshi,
                                      Integer shijianxueshi,
                                      Integer diyixuenian1,
                                      Integer diyixuenian2,
                                      Integer dierxuenian3,
                                      Integer dierxuenian4
                                      ) {
        System.out.println(sord);
        return iCourseService.add(courseName,courseTime,sord,xuefen,totalxueshi,lilunxueshi,shijianxueshi,diyixuenian1,diyixuenian2,dierxuenian3,dierxuenian4);
    }

    @RequestMapping("del")
    public ServerResponse<String> del(Integer id) {
        return iCourseService.del(id);
    }

    @RequestMapping("update")
    public ServerResponse<String> update(Integer id, String courseName, Integer courseTime,Integer sord,
                                         Integer xuefen,
                                         Integer totalxueshi,
                                         Integer lilunxueshi,
                                         Integer shijianxueshi,
                                         Integer diyixuenian1,
                                         Integer diyixuenian2,
                                         Integer dierxuenian3,
                                         Integer dierxuenian4
                                         ) {
        return iCourseService.update(id, courseName,courseTime,sord,xuefen,totalxueshi,lilunxueshi,shijianxueshi,diyixuenian1,diyixuenian2,dierxuenian3,dierxuenian4);
    }

    @RequestMapping("find")
    public ServerResponse<Course> find(Integer id) {
        return iCourseService.find(id);
    }

    @RequestMapping("findAll")
    public ServerResponse<PageInfo<NewCourse>> findAll(Integer pageNum, Integer pageSize) {
        return iCourseService.findAll(pageNum, pageSize);
    }
    @RequestMapping("findAllByName")
    public ServerResponse<PageInfo<Course>> findAllByName(Integer pageNum, Integer pageSize,String courseName) {
        return iCourseService.findAllByName(pageNum, pageSize,courseName);
    }
}
