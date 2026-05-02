package CompositionCompany;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private String description;
    private Employee director;
    private List<Project> projects;
    private double budget;

    public Department(String name, String description, Employee director, double budget) {
        this.name = name;
        this.description = description;
        this.director = director;
        this.budget = budget;
        this.projects = new ArrayList<>();
    }

    public void addProject(Project project) {
        projects.add(project);
    }

    public void showDepartmentInfo() {
        System.out.println("\n=== DEPARTAMENTO: " + name + " ===");
        System.out.println("Descripcion: " + description);
        System.out.println("Director: " + director.getName());
        System.out.println("Presupuesto: $" + budget);
        System.out.println("Proyectos activos (" + projects.size() + "):");
        for (Project p : projects) {
            System.out.println("  - " + p.getName() + " (Budget: $" + p.getBudget() + ")");
        }
    }

    public String getName() { return name; }
    public double getBudget() { return budget; }
}