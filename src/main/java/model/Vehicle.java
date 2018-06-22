package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vehicle")
public class Vehicle {
	@Id
	@GeneratedValue
	@Column(name = "vehicle_id")
	private Long id;

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Vehicle{");
		sb.append("name='").append(name).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
