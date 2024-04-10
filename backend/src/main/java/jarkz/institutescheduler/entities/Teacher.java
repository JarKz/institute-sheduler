package jarkz.institutescheduler.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Teacher {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  public String firstName;
  public String lastName;
  public String patronymic;

  public Faculty faculty;
  public int phoneNumber;
  public String department;

  public static class Builder {
    private Teacher data;

    public Builder setFirstName(String firstName) {
      data.firstName = firstName;
      return this;
    }

    public Builder setLastName(String lastName) {
      data.lastName = lastName;
      return this;
    }

    public Builder setPatronymic(String patronymic) {
      data.patronymic = patronymic;
      return this;
    }

    public Builder setFaculty(Faculty faculty) {
      data.faculty = faculty;
      return this;
    }

    public Builder setPhoneNumber(int phoneNumber) {
      data.phoneNumber = phoneNumber;
      return this;
    }

    public Builder setDepartment(String department) {
      data.department = department;
      return this;
    }

    public Teacher build() {
      return data;
    }
  }

  private Teacher() {}
}
