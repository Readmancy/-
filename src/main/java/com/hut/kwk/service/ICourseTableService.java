package com.hut.kwk.service;

import com.github.pagehelper.PageInfo;
import com.hut.kwk.constant.ServerResponse;
import com.hut.kwk.model.entity.CourseTable;

import java.util.List;


public interface ICourseTableService {
    ServerResponse<String> add(CourseTable courseTable);

    ServerResponse<String> del(Integer id);

    ServerResponse<String> update(CourseTable courseTable);

    ServerResponse<CourseTable> find(Integer id);

    ServerResponse<PageInfo<CourseTable>> findAll(Integer pageNum, Integer pageSize);

    ServerResponse<String> arr();

    ServerResponse<List<CourseTable>> findBy(String className, String teacherName,Integer week);

    ServerResponse<PageInfo<CourseTable>> findAllBy(Integer pageNum, Integer pageSize, Integer week, String courseName, String className, String teacherName, String roomName);

    ServerResponse<String> adjust(Integer courseTableId, Integer classroomId, Integer week, String day, Integer number, String classroomName);
}
