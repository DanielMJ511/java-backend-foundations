package oop.InheritanceWorkers;

public class HourlyEmployee extends Employee{

    private final double hourlyPayRate;

    public HourlyEmployee(String name, String birthDate, long employeeId, String hireDate, double hourlyPayRate) {
        super(name, birthDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public double collectPay() {
        return 40 * hourlyPayRate;
    }

    public double getDoublePay() {
        return 2 * collectPay();
    }
}
