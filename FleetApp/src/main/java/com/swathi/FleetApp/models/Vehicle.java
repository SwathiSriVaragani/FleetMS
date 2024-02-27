package com.swathi.FleetApp.models;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Vehicle {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	private String name;
	
	@ManyToOne
	@JoinColumn(name="vehicletypeid", insertable=false, updatable=false)
	private VehicleType vehicleType;
	private Integer vehicletypeid;	
	
	private String vehicleNumber;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date registrationdate;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date acquisitiondate;
	private String description;
	
	@ManyToOne
	@JoinColumn(name="vehiclemakeid", insertable=false, updatable=false)
	private VehicleMake vehiclemake;
	private Integer vehiclemakeid;
	
	private String power;
	private String fuelcapacity;
	@ManyToOne
	@JoinColumn(name="vehiclestatusid", insertable=false, updatable=false)
	private VehicleStatus vehiclestatus;
	private Integer vehiclestatusid;	
	
	private String netweight;

	@ManyToOne
	@JoinColumn(name="employeeid", insertable=false, updatable=false)
	private Employee incharge;
	private Integer employeeid;
	
	@ManyToOne
	@JoinColumn(name="vehiclemodelid", insertable=false, updatable=false)
	private VehicleModel vehiclemodel;	
	private Integer vehiclemodelid;

	@ManyToOne
	@JoinColumn(name="locationid", insertable=false, updatable=false)	
	private Location currentlocation;
	private Integer locationid;
	
	private String remarks;	
	
	

}
