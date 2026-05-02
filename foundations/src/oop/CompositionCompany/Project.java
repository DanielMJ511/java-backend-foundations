package CompositionCompany;

import java.util.ArrayList;
import java.util.List;

public class Project {
    private String name;
    private String description;
    private Employee manager;
    private List<Employee> teamMembers;
    private double budget;

    public Project(String name, String description, Employee manager, double budget) {
        this.name = name;
        this.description = description;
        this.manager = manager;
        this.budget = budget;
        this.teamMembers = new ArrayList<>();
    }

    public void addTeamMember(Employee employee) {
        teamMembers.add(employee);
    }

    public void showProjectDetails() {
        System.out.println("\n=== PROYECTO: " + name + " ===");
        System.out.println("Descripcion: " + description);
        System.out.println("Presupuesto: $" + budget);
        System.out.println("Gerente: " + manager.getName() + " - " + manager.getRole().getTitle());
        System.out.println("Equipo (" + teamMembers.size() + " miembros):");
        for (Employee e : teamMembers) {
            System.out.println("  - " + e.getName() + " | " + e.getRole().getTitle());
        }
    }

    public String getName() { return name; }
    public double getBudget() { return budget; }
}