package com.rbs.springbootcassandra.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.datastax.oss.driver.api.core.uuid.Uuids;
import com.rbs.springbootcassandra.bean.EmployeeBean;
import com.rbs.springbootcassandra.entity.Employee;
import com.rbs.springbootcassandra.repo.IEmployeeRepository;
import com.rbs.springbootcassandra.service.IEmployeeService;

@Service
@Transactional
public class EmployeeServicImpl implements IEmployeeService {

	@Autowired
	IEmployeeRepository employeeRepository;

	@Override
	public List<EmployeeBean> findAll(String lang) {

		EmployeeBean employeeBean = null;
		List<EmployeeBean> beans = new ArrayList<>();

		try {
			List<Employee> entities = employeeRepository.findAll();

			for (Employee employee : entities) {
				employeeBean = new EmployeeBean();
				employeeBean.setId(employee.getId());

				if (null == lang || "en".equals(lang)) {
					employeeBean.setLangEn(employee.getLangEn());
				}
				if (null == lang || "od".equals(lang)) {
					employeeBean.setLangOd(employee.getLangOd());
				}

				beans.add(employeeBean);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return beans;
	}

	@Override
	public boolean create(EmployeeBean bean) {

		Employee employee = new Employee();

		try {
			employee.setId(Uuids.timeBased());
			employee.setLangEn(bean.getLangEn());
			employee.setLangOd(bean.getLangOd());

			employeeRepository.save(employee);

			return true;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

}
