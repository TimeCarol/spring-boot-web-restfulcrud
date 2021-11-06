package com.atguigu.springboot.mapper;

import com.atguigu.springboot.bean.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper {
    public abstract Employee getEmpById(Integer id);
    public abstract Integer insertEmp(Employee employee);
}
