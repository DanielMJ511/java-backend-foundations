package CompositionCompany;

public class CompanyDemo {
    public static void main(String[] args) {
        Permission readPerm = new Permission("READ", "Lectura de datos");
        Permission writePerm = new Permission("WRITE", "Escritura de datos");
        Permission deletePerm = new Permission("DELETE", "Eliminacion de datos");
        Permission adminPerm = new Permission("ADMIN", "Administracion total");

        Role developerRole = new Role("Desarrollador", 5000);
        developerRole.addPermission(readPerm);
        developerRole.addPermission(writePerm);

        Role managerRole = new Role("Gerente de Proyecto", 8000);
        managerRole.addPermission(readPerm);
        managerRole.addPermission(writePerm);
        managerRole.addPermission(deletePerm);

        Role directorRole = new Role("Director de Departamento", 12000);
        directorRole.addPermission(readPerm);
        directorRole.addPermission(writePerm);
        directorRole.addPermission(deletePerm);
        directorRole.addPermission(adminPerm);

        Employee emp1 = new Employee("Carlos", 101, developerRole);
        Employee emp2 = new Employee("Ana", 102, developerRole);
        Employee emp3 = new Employee("Luis", 103, managerRole);
        Employee emp4 = new Employee("Maria", 104, directorRole);

        Project project1 = new Project("Sistema de Inventario", "Nuevo sistema de gestion", emp3, 50000);
        project1.addTeamMember(emp1);
        project1.addTeamMember(emp2);

        Department itDept = new Department("Tecnologia", "Desarrollo de software", emp4, 100000);
        itDept.addProject(project1);

        Company company = new Company("TechCorp", 1000000);
        company.addDepartment(itDept);

        company.showCompanyOverview();

        emp3.showInfo();
        project1.showProjectDetails();
        itDept.showDepartmentInfo();
    }
}