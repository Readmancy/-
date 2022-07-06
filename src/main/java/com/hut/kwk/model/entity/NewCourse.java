package com.hut.kwk.model.entity;


public class NewCourse{

    private Integer diyixuenian1;
    private Integer diyixuenian2;
    private Integer dierxuenian3;
    private Integer dierxuenian4;
    private Integer disanxuenian5;
    private Integer disanxuenian6;
    private Integer disixuenian7;
    private Integer disixuenian8;
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.course_name
     *
     * @mbg.generated
     */
    private String courseName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.course_time
     *
     * @mbg.generated
     */
    private Integer courseTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Integer getCourseTime() {
        return courseTime;
    }

    public void setCourseTime(Integer courseTime) {
        this.courseTime = courseTime;
    }

    public Integer getStatu() {
        return statu;
    }

    public void setStatu(Integer statu) {
        this.statu = statu;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.statu
     *
     * @mbg.generated
     */
    private Integer statu;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.mark
     *
     * @mbg.generated
     */
    private String mark;

    public NewCourse(Integer diyixuenian1, Integer diyixuenian2, Integer dierxuenian3, Integer dierxuenian4, Integer disanxuenian5, Integer disanxuenian6, Integer disixuenian7, Integer disixuenian8, Integer id, String courseName, Integer courseTime, Integer statu, String mark, Integer xuefen, Integer totalxueshi, Integer lilunxueshi, Integer shijianxueshi) {
        this.diyixuenian1 = diyixuenian1;
        this.diyixuenian2 = diyixuenian2;
        this.dierxuenian3 = dierxuenian3;
        this.dierxuenian4 = dierxuenian4;
        this.disanxuenian5 = disanxuenian5;
        this.disanxuenian6 = disanxuenian6;
        this.disixuenian7 = disixuenian7;
        this.disixuenian8 = disixuenian8;
        this.id = id;
        this.courseName = courseName;
        this.courseTime = courseTime;
        this.statu = statu;
        this.mark = mark;
        this.xuefen = xuefen;
        this.totalxueshi = totalxueshi;
        this.lilunxueshi = lilunxueshi;
        this.shijianxueshi = shijianxueshi;
    }

    private Integer xuefen;

    private Integer totalxueshi;

    private Integer lilunxueshi;

    private Integer shijianxueshi;

    public Integer getXuefen() {
        return xuefen;
    }

    public void setXuefen(Integer xuefen) {
        this.xuefen = xuefen;
    }

    public Integer getTotalxueshi() {
        return totalxueshi;
    }

    public void setTotalxueshi(Integer totalxueshi) {
        this.totalxueshi = totalxueshi;
    }

    public Integer getLilunxueshi() {
        return lilunxueshi;
    }

    public void setLilunxueshi(Integer lilunxueshi) {
        this.lilunxueshi = lilunxueshi;
    }

    public Integer getShijianxueshi() {
        return shijianxueshi;
    }

    public void setShijianxueshi(Integer shijianxueshi) {
        this.shijianxueshi = shijianxueshi;
    }

    public NewCourse() {
    }

    public Integer getDiyixuenian1() {
        return diyixuenian1;
    }

    public void setDiyixuenian1(Integer diyixuenian1) {
        this.diyixuenian1 = diyixuenian1;
    }

    public Integer getDiyixuenian2() {
        return diyixuenian2;
    }

    public void setDiyixuenian2(Integer diyixuenian2) {
        this.diyixuenian2 = diyixuenian2;
    }

    public Integer getDierxuenian3() {
        return dierxuenian3;
    }

    public void setDierxuenian3(Integer dierxuenian3) {
        this.dierxuenian3 = dierxuenian3;
    }

    public Integer getDierxuenian4() {
        return dierxuenian4;
    }

    public void setDierxuenian4(Integer dierxuenian4) {
        this.dierxuenian4 = dierxuenian4;
    }

    public Integer getDisanxuenian5() {
        return disanxuenian5;
    }

    public void setDisanxuenian5(Integer disanxuenian5) {
        this.disanxuenian5 = disanxuenian5;
    }

    public Integer getDisanxuenian6() {
        return disanxuenian6;
    }

    public void setDisanxuenian6(Integer disanxuenian6) {
        this.disanxuenian6 = disanxuenian6;
    }

    public Integer getDisixuenian7() {
        return disixuenian7;
    }

    public void setDisixuenian7(Integer disixuenian7) {
        this.disixuenian7 = disixuenian7;
    }

    public Integer getDisixuenian8() {
        return disixuenian8;
    }

    public void setDisixuenian8(Integer disixuenian8) {
        this.disixuenian8 = disixuenian8;
    }


}
