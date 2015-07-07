package com.acme.data.petclinic.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import lombok.Data;


@Data
@MappedSuperclass
public class NamedEntity extends BaseEntity {

	@Column(name = "name")
	private String name;

	@Override
	public String toString() {
		return this.name;
	}

}
