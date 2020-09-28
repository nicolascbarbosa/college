package com.company;

import javax.swing.*;
import java.util.Date;

public class Employee extends Person {
    protected String job;
    protected Float salary, workedHours;
    protected Date hiringDate;

    public String getJob() {
        return this.job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Float getSalary() {
        return this.salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public Float getWorkedHours() {
        return this.workedHours;
    }

    public void setWorkedHours(Float workedHours) {
        this.workedHours = workedHours;
    }

    public Date getHiringDate() {
        return this.hiringDate;
    }

    public void setHiringDate(Date hiringDate) {
        this.hiringDate = hiringDate;
    }

    public void Create(String name, String address, String job, Float salary, Float workedHours, Date hiringDate) {
        super.Create(name, address);
        this.job = job;
        this.salary = salary;
        this.workedHours = workedHours;
        this.hiringDate = hiringDate;
    }

    @Override
    public void Delete() {
        super.Delete();
        this.job = null;
        this.salary = null;
        this.workedHours = null;
        this.hiringDate = null;
    }

    @Override
    public void Show() {
        var message = "Nome: " + this.name +
                "\nEndereço: " + this.address +
                "\nCargo: " + this.job +
                "\nSalário: " + this.salary +
                "\nHoras Trabalhadas: " + this.workedHours +
                "\nData Contratação: " + this.hiringDate;

        JOptionPane.showMessageDialog(
                null,
                message
        );
    }

    public void CalculateSalary(Double multiplier) {
        var message = "Salário: " + this.salary * multiplier;
        JOptionPane.showConfirmDialog(null, message);
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        String name, address, job;
        Float salary, workedHours;
        name = JOptionPane.showInputDialog("Informe o nome");
        address = JOptionPane.showInputDialog("Informe o endereço");
        job = JOptionPane.showInputDialog("Informe o cargo");
        salary = Float.parseFloat(JOptionPane.showInputDialog("Informe o salario"));
        workedHours = Float.parseFloat(JOptionPane.showInputDialog("Informe as horas trabalhadas"));

        employee.Create(name, address, job, salary, workedHours, new Date("05/05/1997"));
        employee.Show();
        employee.CalculateSalary(1.0); // default multiplier
        employee.Delete();
        employee.Show();
    }

}
