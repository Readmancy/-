package com.hut.kwk.model.mapper;

import com.hut.kwk.model.entity.Teaching;
import com.hut.kwk.model.entity.TeachingQuery;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
@Mapper
public interface TeachingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teaching
     *
     * @mbg.generated
     */
    long countByExample(TeachingQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teaching
     *
     * @mbg.generated
     */
    int deleteByExample(TeachingQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teaching
     *
     * @mbg.generated
     */
    @Delete({
        "delete from teaching",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teaching
     *
     * @mbg.generated
     */
    @Insert({
        "insert into teaching (class_id, teacher_id, ",
        "sem_id, class_name, ",
        "techer_name, sign, ",
        "statu, mark)",
        "values (#{classId,jdbcType=INTEGER}, #{teacherId,jdbcType=INTEGER}, ",
        "#{semId,jdbcType=INTEGER}, #{className,jdbcType=VARCHAR}, ",
        "#{techerName,jdbcType=VARCHAR}, #{sign,jdbcType=VARCHAR}, ",
        "#{statu,jdbcType=INTEGER}, #{mark,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(Teaching record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teaching
     *
     * @mbg.generated
     */
    int insertSelective(Teaching record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teaching
     *
     * @mbg.generated
     */
    List<Teaching> selectByExampleWithRowbounds(TeachingQuery example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teaching
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    Teaching selectOneByExample(TeachingQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teaching
     *
     * @mbg.generated
     */
    List<Teaching> selectByExample(TeachingQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teaching
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, class_id, teacher_id, sem_id, class_name, techer_name, sign, statu, mark",
        "from teaching",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("com.hut.kwk.model.mapper.TeachingMapper.BaseResultMap")
    Teaching selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teaching
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Teaching record, @Param("example") TeachingQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teaching
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Teaching record, @Param("example") TeachingQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teaching
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Teaching record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teaching
     *
     * @mbg.generated
     */
    @Update({
        "update teaching",
        "set class_id = #{classId,jdbcType=INTEGER},",
          "teacher_id = #{teacherId,jdbcType=INTEGER},",
          "sem_id = #{semId,jdbcType=INTEGER},",
          "class_name = #{className,jdbcType=VARCHAR},",
          "techer_name = #{techerName,jdbcType=VARCHAR},",
          "sign = #{sign,jdbcType=VARCHAR},",
          "statu = #{statu,jdbcType=INTEGER},",
          "mark = #{mark,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Teaching record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teaching
     *
     * @mbg.generated
     */
    int insertOrUpdate(Teaching record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teaching
     *
     * @mbg.generated
     */
    int insertOrUpdateSelective(Teaching record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teaching
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int batchInsert(@Param("list") List<Teaching> list);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teaching
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int batchInsertSelective(@Param("list") List<Teaching> list, @Param("selective") Teaching.Column ... selective);
}