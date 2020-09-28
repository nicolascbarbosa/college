package com.company;

import javax.swing.*;
import java.util.Date;

public class Patient extends Person {
    protected String sickness;
    protected Integer bedroom;
    protected Boolean hasPlan;

    public void Create(String name, String address, String sickness, Integer bedroom, Boolean hasPlan) {
        super.Create(name, address);
        this.sickness = sickness;
        this.bedroom = bedroom;
        this.hasPlan = hasPlan;
    }

    @Override
    public void Delete() {
        super.Delete();
        this.sickness = null;
        this.bedroom = null;
        this.hasPlan = null;
    }

    @Override
    public void Show() {
        var message = "Nome: " + this.name +
                "\nEndereço: " + this.address +
                "\nDoença: " + this.sickness +
                "\nQuarto: " + this.bedroom +
                "\nPlano de saude: " + (this.hasPlan ? "Sim" : "Nao");

                JOptionPane.showMessageDialog(
                null,
                message
        );
    }

    public void hospitalizationTime() {
        Integer value = 400;
        if(this.hasPlan) {
            value = 400 / 10;
        }
        var message = "O valor da internaçao é: R$" + value;
        JOptionPane.showMessageDialog(
                null,
                message);

    }

    public static void main(String[] args) {
        Patient patient = new Patient();
        String name, address, sickness;
        Integer bedroom;
        Boolean hasPlan;

        name = JOptionPane.showInputDialog("Informe o nome");
        address = JOptionPane.showInputDialog("Informe o endereço");
        sickness = JOptionPane.showInputDialog(("Informe a doença"));
        bedroom = Integer.parseInt(JOptionPane.showInputDialog(("Informe o numero do quarto")));

        Integer planChoice = JOptionPane.showConfirmDialog(null, "Possui Plano de saude?");

        if(planChoice == JOptionPane.YES_OPTION) {
            hasPlan = true;
        } else {
            hasPlan = false;
        }

        patient.Create(name, address, sickness, bedroom, hasPlan);
        patient.Show();
        patient.hospitalizationTime();
        patient.Delete();
        patient.Show();
    }
}
