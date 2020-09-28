package com.company;

import javax.swing.*;
import java.util.Date;

public class Nurse extends Employee {
    protected String turn;

    public void Create(String name, String address, String job, Float salary, Float workedHours, Date hiringDate, String turn) {
        super.Create(name, address, job, salary, workedHours, hiringDate);
        this.turn = turn;
    }

    @Override
    public void Delete() {
        super.Delete();
        this.turn = null;
    }

    @Override
    public void Show() {
        var message = "Nome: " + this.name +
                "\nEndereço: " + this.address +
                "\nCargo: " + this.job +
                "\nSalário: " + this.salary +
                "\nHoras Trabalhadas: " + this.workedHours +
                "\nData Contratação: " + this.hiringDate +
                "\nTurno: " + this.turn;

        JOptionPane.showMessageDialog(
                null,
                message
        );
    }

    public void PutSerum() {
        var message = "Nome: " + this.name +
                "\nTurno: " + this.turn;

        JOptionPane.showMessageDialog(
                null,
                message
        );
    }

    public static void main(String[] args) {
        Nurse nurse = new Nurse();
        String name, address, job, turn;
        Float salary, workedHours;
        Double multiplier;

        name = JOptionPane.showInputDialog("Informe o nome");
        address = JOptionPane.showInputDialog("Informe o endereço");
        job = JOptionPane.showInputDialog("Informe o cargo");
        salary = Float.parseFloat(JOptionPane.showInputDialog("Informe o salario"));
        workedHours = Float.parseFloat(JOptionPane.showInputDialog("Informe as horas trabalhadas"));
        turn = JOptionPane.showInputDialog("Informe o turno");

        if(turn == "noturno") {
            multiplier = 2.0;
        } else {
            multiplier = 1.0;
        }

        nurse.Create(name, address, job, salary, workedHours, new Date("05/05/1997"), turn);
        nurse.Show();
        nurse.PutSerum();
        nurse.CalculateSalary(multiplier);
        nurse.Delete();
        nurse.Show();
    }
}
