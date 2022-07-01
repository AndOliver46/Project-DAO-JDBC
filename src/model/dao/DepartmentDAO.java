package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDAO {
	void insert(Department obj);
	void update(Department onj);
	void deleteById(Integer id);
	Department findById(Integer id);
	List<Department> findAll();
}
