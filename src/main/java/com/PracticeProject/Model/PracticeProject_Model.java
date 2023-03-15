package com.PracticeProject.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PracticeProject_Model {
	@Id
	private int Id;
	private String Name;
	private String Address;
	public PracticeProject_Model() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PracticeProject_Model(int id, String Name, String address) {
		super();
		Id = id;
		this.Name = Name;
		Address = address;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "PracticeProject_Model [Id=" + Id + ", Name=" + Name + ", Address=" + Address + "]";
	}
	
	


}
