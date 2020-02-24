package com.fushengshi.controller;

import com.fushengshi.bean.Employee;
import com.fushengshi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * @author 伏胜世 on 2020/2/21
 */
@Controller
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/getemps")
    public String emps(Map<String, Object> map){
        List<Employee> emps = employeeService.getEmps();
        map.put("command", emps);
        return "list";
    }



}