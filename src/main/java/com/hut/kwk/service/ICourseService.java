package com.hut.kwk.service;

import com.github.pagehelper.PageInfo;
import com.hut.kwk.constant.ServerResponse;
import com.hut.kwk.model.entity.Course;
import com.hut.kwk.model.entity.NewCourse;

public interface ICourseService {
    ServerResponse<String> add(String courseName, Integer courseTime, Integer sord, Integer xuefen, Integer totalxueshi, Integer lilunxueshi, Integer shijianxueshi, Integer diyixuenian1, Integer diyixuenian2, Integer dierxuenian3, Integer dierxuenian4);

    ServerResponse<String> del(Integer id);

    ServerResponse<String> update(Integer id, String courseName, Integer courseTime, Integer sord, Integer xuefen, Integer totalxueshi, Integer lilunxueshi, Integer shijianxueshi, Integer diyixuenian1, Integer diyixuenian2, Integer dierxuenian3, Integer dierxuenian4);

    ServerResponse<Course> find(Integer id);

    ServerResponse<PageInfo<NewCourse>> findAll(Integer pageNum, Integer pageSize);

    ServerResponse<PageInfo<Course>> findAllByName(Integer pageNum, Integer pageSize, String courseName);
}
