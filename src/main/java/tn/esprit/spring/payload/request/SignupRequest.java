package tn.esprit.spring.payload.request;

import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.validation.constraints.*;

public class SignupRequest {
  @NotBlank
  @Size(min = 3, max = 20)
  private String username;

  @NotBlank
  @Size(max = 50)
  @Email
  private String email;

  private Set<String> role;

  @NotBlank
  @Size(min = 6, max = 40)
  private String password;

  
  @NotBlank
  @Size(max = 50)
  private String address;

  @NotBlank
  @Size(max = 50)
  private String phone;


  private Date birth;


  private Date contractStart;

 
  private Date contractEnd;

  @NotBlank
  @Size(max = 50)
  private String occupation;

 @NotBlank
  @Size(max = 120)
  @Column
  private String salary;

  
  public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}

public Date getBirth() {
	return birth;
}

public void setBirth(Date birth) {
	this.birth = birth;
}

public Date getContractStart() {
	return contractStart;
}

public void setContractStart(Date contractStart) {
	this.contractStart = contractStart;
}

public Date getContractEnd() {
	return contractEnd;
}

public void setContractEnd(Date contractEnd) {
	this.contractEnd = contractEnd;
}

public String getOccupation() {
	return occupation;
}

public void setOccupation(String occupation) {
	this.occupation = occupation;
}

public String getSalary() {
	return salary;
}

public void setSalary(String salary) {
	this.salary = salary;
}

public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Set<String> getRole() {
    return this.role;
  }

  public void setRole(Set<String> role) {
    this.role = role;
  }
}