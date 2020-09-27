package model.services;

import java.util.ArrayList;
import java.util.List;

import model.entities.Department;

public class DepartmentService {
	
	public List<Department> findAll(){
		List<Department> listDepartment = new ArrayList<>();
		listDepartment.add(new Department(1, "Books"));
		listDepartment.add(new Department(1, "Computers"));
		listDepartment.add(new Department(1, "Eletronics"));
		
		return listDepartment;
	}
}
