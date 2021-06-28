package com.rbs.springbootcassandra.entity;

import java.util.Map;
import java.util.UUID;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table("employee")
public class Employee {

	@PrimaryKey
	private UUID id;

	@Column("LANG_EN")
	private Map<String, String> langEn;

	@Column("LANG_OD")
	private Map<String, String> langOd;

}
