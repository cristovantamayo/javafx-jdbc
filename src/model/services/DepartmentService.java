package model.services;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class DepartmentService {
	
	private DepartmentDao dao = DaoFactory.createDepartmentDao();
	
	public List<Department> findAll() {
		return dao.findAll();
	}
	
	public void saveOrUpdate(Department dep) {
		if(dep.getId() == null) {
			dao.insert(dep);
		} else {
			dao.update(dep);
		}
	}
	
	public void remove(Department department) {
		dao.deleteById(department.getId());
	}
}
