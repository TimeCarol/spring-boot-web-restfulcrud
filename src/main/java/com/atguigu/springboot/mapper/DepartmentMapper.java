package com.atguigu.springboot.mapper;

import com.atguigu.springboot.bean.Department;
import org.apache.ibatis.annotations.*;

//指定这是一个操作数据库的mapper
@Mapper
public interface DepartmentMapper {
    @Select("SELECT * FROM department WHERE id = #{id}")
    public abstract Department getDeptById(Integer id);
    @Delete("DELETE FROM department WHERE id = #{id}")
    public abstract Integer deleteDeptById(Integer id);
    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("INSERT INTO department(departmentName) VALUES(#{departmentName})")
    public abstract Integer insertDept(Department department);
    @Update("UPDATE department SET departmentName = #{departmentName} WHERE id = #{id}")
    public abstract Integer updateDept(Department department);
}
