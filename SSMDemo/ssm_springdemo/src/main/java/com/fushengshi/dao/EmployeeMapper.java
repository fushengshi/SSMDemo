package com.fushengshi.dao;

import com.fushengshi.bean.Employee;

import java.util.List;


public interface EmployeeMapper {

    public Employee getEmpById(Integer id);

    public List<Employee> getEmps();


}
