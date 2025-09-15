package DesignPattern.ProxyDesignPattern;

public class EmployeeDaoImpl implements EmployeeDao{
    @Override
    public void create(String name, EmployeeDo emp) {
        System.out.println("Creating employee record for " + name);
    }

    @Override
    public void delete(String name, int employeeId) {
        System.out.println("Deleting employee record for " + name + " with ID " + employeeId);
        return ;
    }

    @Override
    public EmployeeDo get(String name, int employeeId) {
        System.out.println("Fetching employee record for " + name + " with ID " + employeeId);
        return new EmployeeDo();
    }
}
