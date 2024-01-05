package net.javaguides.springboot.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employees")



public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	
	@Column(name = "first_name")
    private String firstname;
	@Column(name = "last_name")
    private String lastname;
	@Column(name = "email_id")
    private String emailId;
	@Column(name = "date")
    private String date;
	@Column(name = "place")
    private String place;
    
    public Employee()
    {
    	
    }
    
	public Employee(String firstname, String lastname, String emailId,String date,String place) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.emailId = emailId;
		this.date = date;
		this.place = place;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
    
    
}
