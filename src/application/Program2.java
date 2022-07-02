package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDAO;

public class Program2 {

	public static void main(String[] args) {

		DepartmentDAO departmentDao = DaoFactory.createDepartmentDao();

		// System.out.println("=== TEST 1: department delete ===");
		// departmentDao.deleteById(9);
		// System.out.println("Department deleted!");

		// System.out.println("=== TEST 2: department findById ===");
		// Department department = departmentDao.findById(4);
		// System.out.println(department);

		// System.out.println("=== TEST 3: department findAll ===");
		// List<Department> departamentos = departmentDao.findAll();
		// for(Department x : departamentos) {
		// System.out.println(x);
		// }
	}

}
