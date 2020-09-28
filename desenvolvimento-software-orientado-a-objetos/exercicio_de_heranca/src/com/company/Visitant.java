package com.company;

import javax.swing.*;
import java.util.Date;

public class Visitant extends Person {
    protected Date checkIn;
    protected String host;

    public Date getCheckIn() {
        return this.checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public String getHost() {
        return this.host;
    }

    public void setHost(String host) {
        this.host = host;
    }


    public void Create(String name, String address, Date checkIn, String host) {
        super.Create(name, address);
        this.checkIn = checkIn;
        this.host = host;
    }

    @Override
    public void Delete() {
        super.Delete();
        this.checkIn = null;
        this.host = null;
    }

    @Override
    public void Show() {
        var message = "Nome: " + this.name +
                "\nEndereço: " + this.address +
                "\nHora de Entrada: " + this.checkIn +
                "\nDoente: " + this.host;

        JOptionPane.showMessageDialog(
                null,
                message
        );
    }

    public void StayTime() {
        int diffInMinutes = (int)( (new Date().getTime() - this.checkIn.getTime())
                / (1000 * 60 * 60) );
        var message = "Tempo de permanencia em minutos: " + diffInMinutes;
        JOptionPane.showMessageDialog(null, message);
    }

    public static void main(String[] args) {
        Visitant visitant = new Visitant();
        String name, address, host;
        name = JOptionPane.showInputDialog("Informe o nome");
        address = JOptionPane.showInputDialog("Informe o endereço");
        host = JOptionPane.showInputDialog(("Informe o doente"));

        visitant.Create(name, address, new Date(), host);
        visitant.Show();
        visitant.StayTime();
        visitant.Delete();
        visitant.Show();
    }
}
