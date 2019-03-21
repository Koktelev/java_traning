package ru.stqa.pft.addressbook.model;

public class ContactData {
    private final String name;
    private final String middle_name;
    private final String telephon;
    private final String email;
    private String group;

    public ContactData(String name, String middle_name, String telephon, String email, String group) {
        this.name = name;
        this.middle_name = middle_name;
        this.telephon = telephon;
        this.email = email;
        this.group = group;
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

    public String getGroup() {
        return group;
    }
}
