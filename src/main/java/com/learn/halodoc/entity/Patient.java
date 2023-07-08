package com.learn.halodoc.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer patientId;
	 
	private String name;
	
	private String contactDetails;
	
	private String address;
	
	private String pincode;
	
	
	/*

	public Patient() {
		
	}

	public Patient(Integer patientId, String name, String contactDetails, String address, String pincode) {
		super();
		this.patientId = patientId;
		this.name = name;
		this.contactDetails = contactDetails;
		this.address = address;
		this.pincode = pincode;
	}

	public Integer getPatientId() {
		return patientId;
	}

	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(String contactDetails) {
		this.contactDetails = contactDetails;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, contactDetails, name, patientId, pincode);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patient other = (Patient) obj;
		return Objects.equals(address, other.address) && Objects.equals(contactDetails, other.contactDetails)
				&& Objects.equals(name, other.name) && Objects.equals(patientId, other.patientId)
				&& Objects.equals(pincode, other.pincode);
	}

	
	
	*/
}
