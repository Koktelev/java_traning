package ru.stqa.pft.addressbook.model;

public class ContactData {
    private final String name;
    private final String middle_name;
    private final String telephon;
    private final String email;

    public ContactData(String name, String middle_name, String telephon, String email) {
        this.name = name;
        this.middle_name = middle_name;
        this.telephon = telephon;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public String getTelephon() {
        return telephon;
    }

    public String getEmail() {
        return email;
    }
}
