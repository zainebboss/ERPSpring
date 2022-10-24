package tn.esprit.spring.models;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Builder.Default;


@Entity
@Table(name = "users", 
    uniqueConstraints = { 
      @UniqueConstraint(columnNames = "username"),
      @UniqueConstraint(columnNames = "email") 
    })
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotBlank
  @Size(max = 20)
  private String username;

  @NotBlank
  @Size(max = 50)
  @Email
  private String email;
  
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

//  @NotBlank
  @Size(max = 120)
  private String password;
  
  @OneToMany(cascade = CascadeType.ALL)
  @JoinColumn(name = "user_id", insertable = false, updatable = false)
  @JsonIgnore
  private Set<Vacation> vacations;

  @OneToMany(cascade = CascadeType.ALL)
  @JoinColumn(name = "user_id", insertable = false, updatable = false)
  @JsonIgnore
  private Set<Absense> absenses;

  @ManyToMany(fetch = FetchType.LAZY)
  @JoinTable(  name = "user_roles", 
        joinColumns = @JoinColumn(name = "user_id"), 
        inverseJoinColumns = @JoinColumn(name = "role_id"))
  private Set<Role> roles = new HashSet<>();

  public User() {
  }

  public User(String username, String email, String password, String address, String phone, Date birth, Date contractStart, Date contractEnd, String occupation, String salary) {
    this.username = username;
    this.email = email;
    this.password = password;
    this.address = address;
    this.phone = phone;
    this.birth = birth;
    this.contractStart = contractStart;
    this.contractEnd = contractEnd;
    this.occupation = occupation;
    this.salary = salary;

  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
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

  public Set<Role> getRoles() {
    return roles;
  }

  public void setRoles(Set<Role> roles) {
    this.roles = roles;
  }
}