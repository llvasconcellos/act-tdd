package exercise3;

import java.util.Date;

public class Account {

  private final String id;
  private String name;
  private String email;
  private Date lastModification;

  public Account(String id) {
    this(id, new Date());
  }

  public Account(String id, Date lastModifiedAt) {
    this.id = id;
    this.lastModification = lastModifiedAt;
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
    this.lastModification = new Date();
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
    this.lastModification = new Date();
  }

  public Date getLastModification() {
    return lastModification;
  }
}
