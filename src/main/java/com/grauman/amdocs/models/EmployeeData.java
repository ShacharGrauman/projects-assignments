package com.grauman.amdocs.models;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EmployeeData {
	private Integer id;
	private Integer number;
	private String firstName;
	private String lastName;
	private String email;
	private Integer managerId;
	private String managerName;
	private String department;
	private String workSite;
	private Integer workSiteId;
	private String country;
	private String phone;
	private Boolean loginStatus;
	private Boolean locked;
	private Boolean deactivated;
	private String password;
	private List<Role> roles;
	
	public EmployeeData(Integer id, Integer number, String firstName, String lastName, String email, String managerName,
			Integer managerId, String department, String workSite, Integer workSiteId, String country, String phone,
			Boolean loginStatus, Boolean locked, Boolean deactivated,String password) {
		this.id = id;
		this.number = number;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.managerName = managerName;
		this.managerId = managerId;
		this.department = department;
		this.workSite = workSite;
		this.workSiteId = workSiteId;
		this.country = country;
		this.phone = phone;
		this.loginStatus = loginStatus;
		this.locked = locked;
		this.deactivated = deactivated;
		this.password=password;
	}
	public EmployeeData(Integer id, String firstName) {
		this.id = id;
		this.firstName = firstName;
	}

	public EmployeeData(Integer id, Integer number, String firstName, String lastName, String email, String managerName,
			Integer managerId, String department, String workSite, Integer workSiteId, String country, String phone,
			Boolean loginStatus, Boolean locked, Boolean deactivated,String password,List<Role>roles) {
		this(id,number,firstName,lastName,email,managerName,managerId,department,workSite,workSiteId,country
				,phone,loginStatus,locked,deactivated,password);
		this.roles=roles;
	}

	public EmployeeData(Integer id, Integer number, String firstName, String lastName, String email, Integer managerId,
			String department, Integer workSiteId, String country, String phone, Boolean loginStatus, Boolean locked,
			Boolean deactivated,String password) {
		this.id = id;
		this.number = number;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.managerId = managerId;
		this.department = department;
		this.workSiteId = workSiteId;
		this.country = country;
		this.phone = phone;
		this.loginStatus = loginStatus;
		this.locked = locked;
		this.deactivated = deactivated;
		this.password=password;
	}
}
