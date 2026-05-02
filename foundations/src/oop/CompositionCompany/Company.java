package CompositionCompany;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private List<Department> departments;
    private double totalRevenue;

    public Company(String name, double totalRevenue) {
        this.name = name;
        this.totalRevenue = totalRevenue;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void showCompanyOverview() {
        System.out.println("========================================");
        System.out.println("    EMPRESA: " + name);
        System.out.println("========================================");
        System.out.println("Ingresos totales: $" + totalRevenue);
        System.out.println("Departamentos: " + departments.size());

        double totalBudget = 0;
        int totalProjects = 0;
        for (Department d : departments) {
            totalBudget += d.getBudget();
            System.out.println("  - " + d.getName());
        }
        System.out.println("\nPresupuesto total departamentos: $" + totalBudget);
    }

    public String getName() { return name; }
}