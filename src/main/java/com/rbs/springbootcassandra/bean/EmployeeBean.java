package com.rbs.springbootcassandra.bean;

import java.util.Map;
import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeBean {

	private UUID id;
	private Map<String, String> langEn;
	private Map<String, String> langOd;

}
