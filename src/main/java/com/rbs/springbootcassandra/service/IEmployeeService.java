package com.rbs.springbootcassandra.service;

import java.util.List;

import com.rbs.springbootcassandra.bean.EmployeeBean;

public interface IEmployeeService {

	List<EmployeeBean> findAll(String lang);

	boolean create(EmployeeBean bean);

}
