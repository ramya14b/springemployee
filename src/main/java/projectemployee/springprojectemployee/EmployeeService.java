package projectemployee.springprojectemployee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import antlr.collections.List;


@Service 
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeerepository;
	
	
 	
 	//get list of all Employee
	public List getAllEmployee()
	{
	List emp  = (List)employeerepository.findAll();
	return emp;
	
	}
	
	//get employee by id
	public Object getEmployee(int id)
	{
		return employeerepository.findById(id);
	}
	
	//add employee
	public void addEmployee(EmployeeModule emp)
	{
		employeerepository.save(emp);
		
	}
	
	//update employee
	public void updateEmployee(EmployeeModule emp,int id)
	{
		if(id==emp.getEmployeeId())
		{	employeerepository.save(emp);
			}
	}
	
	//delete all employee
	public void deleteAllEmployee()
	{
		employeerepository.deleteAll();
	}
	
	//delete employee by id 
	public void deleteEmployeeById(int id)
	{
		employeerepository.deleteById(id);
	}
	
	//patch/update employee
	public Object patchEmployeeById(EmployeeModule emp,int id)
	{
		if(id==emp.getEmployeeId()) {
			employeerepository.save(emp);
		}
		return id;
	}
	
}

	

