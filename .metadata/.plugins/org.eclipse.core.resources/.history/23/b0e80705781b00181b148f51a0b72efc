package edu.iup.cosc310.company.bo;

import edu.iup.cosc310.util.ItemList;
import edu.iup.cosc310.util.LinkedItemList;

/**
 * A Company.  Maintains a list of departments and methods access
 * the company's departments.
 * 
 * @author Eric Olechovski
 */
public class Company {
	private ItemList<Department> departments = new LinkedItemList<Department>();
	

	/**
	 * Add a Department to the list of departments for this company.
	 * 
	 * @param department - the company to be added
	 */
	public void addDepartment(Department department) {
		departments.addItem(department);;
	}

	/**
	 * Find a department with a given department code
	 * 
	 * @param deptCode - the department code used to find a department
	 * @return the department with the given code.  Returns null if 
	 * a department by the given department code is not found.
	 */
	public Department findDepartment(String deptCode) {
		for (int i = 0; i < getNoDepartments(); i++) {
			Department department = departments.getItem(i);
			if (deptCode.equals(department.getDeptCode())) {
				return department;
			}
		}
		
		return null;
	}


	/**
	 * Returns the number of departments
	 * 
	 * @return number of departments
	 */
	public int getNoDepartments() {
		return departments.getNoItems();
	}
	
	/**
	 * Get the ith department in this company
	 * @param i - index identifying the department to be returned
	 * @return the ith department in this company
	 */
	public Department getItem(int i) {
		return departments.getItem(i);
	}

	
}
