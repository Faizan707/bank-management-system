package org.example;

public class Person  {
    private String name;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNO() {
        return phoneNO;
    }

    public void setPhoneNO(String phoneNO) {
        this.phoneNO = phoneNO;
    }

    private String email;
    private String phoneNO;
    public Person(String name, String email, String phoneNO) {
        this.name = name;
        this.email = email;
        this.phoneNO = phoneNO;
    }

}
