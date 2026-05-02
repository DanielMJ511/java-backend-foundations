package CompositionCompany;

import java.util.ArrayList;
import java.util.List;

public class Role {
    private String title;
    private double salary;
    private List<Permission> permissions;

    public Role(String title, double salary) {
        this.title = title;
        this.salary = salary;
        this.permissions = new ArrayList<>();
    }

    public void addPermission(Permission permission) {
        permissions.add(permission);
    }

    public String getTitle() { return title; }
    public double getSalary() { return salary; }
    public List<Permission> getPermissions() { return permissions; }

    public void showPermissions() {
        System.out.println("  Permisos para " + title + ":");
        for (Permission p : permissions) {
            System.out.println("    - " + p);
        }
    }
}