package com.rbs.springbootcassandra.repo;

import java.util.UUID;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.rbs.springbootcassandra.entity.Employee;

@Repository
public interface IEmployeeRepository extends CassandraRepository<Employee, UUID> {

}
