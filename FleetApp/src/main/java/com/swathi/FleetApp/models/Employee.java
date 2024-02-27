package com.swathi.FleetApp.models;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper=false) 
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Employee extends Person { 
	
	
	@ManyToOne
	@JoinColumn(name ="employeeid", insertable=false, updatable=false)
	private EmployeeType employeetype; 
	private Integer employeeid;
	private String photo;
	private String username; 
	
	@ManyToOne 
	@JoinColumn(name="jobtitleid", insertable=false, updatable=false)
	private JobTitle jobtitle;
	private Integer jobtitleid; 
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date hiredate;
	
	

}
