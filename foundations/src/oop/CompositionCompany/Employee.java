package CompositionCompany;

import java.util.List;

public class Employee {
    private String name;
    private int id;
    private Role role;
    private List<Task> assignedTasks;

    public Employee(String name, int id, Role role) {
        this.name = name;
        this.id = id;
        this.role = role;
    }

    public void assignTask(Task task) {
        assignedTasks.add(task);
    }

    public void showInfo() {
        System.out.println("Empleado: " + name + " (ID: " + id + ")");
        System.out.println("  Rol: " + role.getTitle());
        System.out.println("  Salario: $" + role.getSalary());
        role.showPermissions();
    }

    public String getName() { return name; }
    public Role getRole() { return role; }
}