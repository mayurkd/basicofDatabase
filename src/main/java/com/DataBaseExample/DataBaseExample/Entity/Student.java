package com.DataBaseExample.DataBaseExample.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
//lombok is for bolierplate code
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
// this annotation is used for creating getter and setter method
@Data
//this is a part of lombok and it's use for creating argument constructor
@AllArgsConstructor
//this is a part of lombok and it's use for creating no-argument constructor
@NoArgsConstructor//this annotation is used create table 
@Table(name = "NewTableAutomatically")
public class Student {
	//this is used for creating key in table
	@Id
	//this annotation is used to generate increment 
	@GeneratedValue
	//this annotation is used for create column in table
	@Column
	private long id;
	@Column
	private String name;
	@Column
	private String address;
	@Column
	private String Validnumber;
}
