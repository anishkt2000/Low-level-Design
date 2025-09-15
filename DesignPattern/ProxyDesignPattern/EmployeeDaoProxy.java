package DesignPattern.ProxyDesignPattern;

public class EmployeeDaoProxy implements EmployeeDao{
    private EmployeeDaoImpl employeeDaoImpl;

    public EmployeeDaoProxy() {
        this.employeeDaoImpl = new EmployeeDaoImpl();
    }

    @Override
    public void create(String name, EmployeeDo emp) throws Exception {
        if(name.equals("ADMIN")){
            employeeDaoImpl.create(name,emp);
            return;
        }
        throw new Exception("Access Denied: Only ADMIN can create employee records");
    }

    @Override
    public void delete(String name, int employeeId) throws Exception{
        if(name.equals("ADMIN")){
            employeeDaoImpl.delete(name,employeeId);
            return;
        }
        throw  new Exception("Access Denied: Only ADMIN can delete employee records");
    }

    @Override
    public EmployeeDo get(String name, int employeeId) throws Exception {
        if(name.equals("CLIENT") || name.equals("GUEST")){
            return employeeDaoImpl.get(name,employeeId);
        }
        throw new Exception("Access Denied: Only CLIENT or GUEST can fetch employee records");
    }
}
