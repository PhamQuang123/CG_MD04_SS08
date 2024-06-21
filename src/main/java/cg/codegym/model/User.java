package cg.codegym.model;

import javax.validation.constraints.*;

public class User {
    @NotBlank(message = "Khong duoc de tromg")
    @Size(min=5, max = 45)
    private String firstName;
    @NotBlank(message = "Khong duoc de tromg")
    @Size(min = 5,max = 45)
    private String lastName;
    @Pattern(regexp = "^(84|0[3|5|7|8|9])+([0-9]{8})$",message = "SDT khong dung dinh dang")
    private  String phoneNumber;
    @Min(value = 18, message = "tuoi phai 18 tro len")
    private int age;
    @Email(message = "email khong dung")
    @Pattern(regexp = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\\\.[A-Za-z0-9-]+)*(\\\\.[A-Za-z]{2,})$",
    message = "email khong dung dinh dang")
    private String email;

    public User() {
    }

    public User(String firstName, String lastName, String phoneNumber, int age, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
