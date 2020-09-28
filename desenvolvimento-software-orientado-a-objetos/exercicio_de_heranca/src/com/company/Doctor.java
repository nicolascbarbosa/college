package com.company;

import javax.swing.*;
import java.util.Date;

public class Doctor extends Employee {
    protected String specialty;

    public void Create(String name, String address, String job, Float salary, Float workedHours, Date hiringDate, String specialty) {
        super.Create(name, address, job, salary, workedHours, hiringDate);
        this.specialty = specialty;
    }

    @Override
    public void Delete() {
        super.Delete();
        this.specialty = null;
    }

    @Override
    public void Show() {
        var message = "Nome: " + this.name +
                "\nEndereço: " + this.address +
                "\nCargo: " + this.job +
                "\nSalário: " + this.salary +
                "\nHoras Trabalhadas: " + this.workedHours +
                "\nData Contratação: " + this.hiringDate +
                "\nEspecialidade: " + this.specialty;

        JOptionPane.showMessageDialog(
                null,
                message
        );
    }

    public void FillRecord() {
        var message = "Nome: " + this.name +
                "\nEspecialidade: " + this.specialty;

        JOptionPane.showMessageDialog(
                null,
                message
        );
    }

    public Double CalculateMultiplier(String specialty) {
        switch (specialty){
            case "dermatologia":
            case "pediatria":
                return 2.0;
            case "oftalmologia":
            case "ortopedia":
                return 3.0;
            case "cardiologia":
            case "neurologia":
                return 4.0;
            default:
                return 1.5;
        }
    }

    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        String name, address, job, specialty;
        Float salary, workedHours;
        Double multiplier;

        name = JOptionPane.showInputDialog("Informe o nome");
        address = JOptionPane.showInputDialog("Informe o endereço");
        job = JOptionPane.showInputDialog("Informe o cargo");
        salary = Float.parseFloat(JOptionPane.showInputDialog("Informe o salario"));
        workedHours = Float.parseFloat(JOptionPane.showInputDialog("Informe as horas trabalhadas"));
        specialty = JOptionPane.showInputDialog("Informe a especialidade");

        multiplier = doctor.CalculateMultiplier(specialty);

        doctor.Create(name, address, job, salary, workedHours, new Date("05/05/1997"), specialty);
        doctor.Show();
        doctor.FillRecord();
        doctor.CalculateSalary(multiplier);
        doctor.Delete();
        doctor.Show();
    }
}
