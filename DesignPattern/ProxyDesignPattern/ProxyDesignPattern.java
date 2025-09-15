package DesignPattern.ProxyDesignPattern;

public class ProxyDesignPattern {
    public static void main(String[] args) throws Exception {
        EmployeeDao employeeDao = new EmployeeDaoProxy();
        EmployeeDo emp = new EmployeeDo();
        employeeDao.create("ADMIN", emp);
        employeeDao.get("CLIENT", 1);
        employeeDao.delete("ADMIN", 1);

    }
}
