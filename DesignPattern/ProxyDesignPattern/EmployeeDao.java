package DesignPattern.ProxyDesignPattern;

public interface EmployeeDao {
    public void create(String name, EmployeeDo emp) throws Exception;
    public void delete(String name, int employeeId) throws Exception;
    public EmployeeDo get(String name,int employeeId)throws Exception;
}
