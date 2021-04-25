package com.my.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="std")
public class Student {
	@Id
	@Column(name="id")
	private Integer sid;
	@Column(name="name")
	private String sname;
	@Column(name="fee")
	private Double sfee;

}
