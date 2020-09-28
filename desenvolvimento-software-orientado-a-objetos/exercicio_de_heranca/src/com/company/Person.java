package com.company;

import javax.swing.*;

public class Person {
    protected String name, address;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.name = address;
    }

    public void Create(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void Delete() {
        this.name = null;
        this.address = null;
    }

    public void Show() {
        var message = "Nome: " + this.name +
                "\nEndereço: " + this.address;

        JOptionPane.showMessageDialog(
                null,
                message
        );
    }

    public static void main(String[] args) {
        Person person = new Person();
        String name, address;
        name = JOptionPane.showInputDialog("Informe o nome");
        address = JOptionPane.showInputDialog("Informe o endereço");

        person.Create(name, address);
        person.Show();
        person.Delete();
        person.Show();
    }

}
