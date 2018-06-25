package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "vehicle")
public class Vehicle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "vehicle_id")
	private Long id;

	private String name;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	public Vehicle() {
	}

	public Vehicle(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Vehicle{");
		sb.append("name='").append(name).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
