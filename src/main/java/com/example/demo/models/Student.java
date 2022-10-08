package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;

@Entity
@NamedStoredProcedureQuery(name = "student.getAll", procedureName = "GET_STUDENT", parameters = {
		@StoredProcedureParameter(mode = ParameterMode.IN, name = "s_id", type = Integer.class),
		@StoredProcedureParameter(mode = ParameterMode.OUT, name = "id", type = Integer.class),
		@StoredProcedureParameter(mode = ParameterMode.OUT, name = "name", type = String.class) })
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer id;
	@Column(name = "name")
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [id=").append(id).append(", name=").append(name).append("]");
		return builder.toString();
	}

}
