package com.swathi.FleetApp.models;

import java.util.HashSet;
import java.util.Set;
import jakarta.persistence.JoinColumn;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor 

public class User { 
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; 
	private String firstname;
	private String lastname;
	private String username;
	private String password; 
	 
//	@ManyToMany(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
//	@JoinTable(
//			name="user_role",
//			joinColumns = {@JoinColumn(name="user_id")},
//			inverseJoinColumns = {@JoinColumn(name="role_id")}
//	)
//	Set<Role> roles= new HashSet<>();

}
