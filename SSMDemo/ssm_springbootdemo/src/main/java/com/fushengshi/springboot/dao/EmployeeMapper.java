package com.fushengshi.springboot.dao;


import com.fushengshi.springboot.bean.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface EmployeeMapper {

    public Employee getEmpById(Integer id);

    public List<Employee> getEmps();


}
