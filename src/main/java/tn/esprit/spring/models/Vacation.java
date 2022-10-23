package tn.esprit.spring.models;

import javax.persistence.*;

import org.hibernate.annotations.DynamicUpdate;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@DynamicUpdate
public class Vacation {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  @ManyToOne()
  private User user;
  @Column
  private String end;
  @Column
  private String start;



  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public User getUser() {
    return this.user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  
  public String getEnd() {
    return this.end;
  }

  public void setEnd(String end) {
    this.end = end;
  }

 
  public String getStart() {
    return this.start;
  }

  public void setStart(String start) {
    this.start = start;
  }

}
