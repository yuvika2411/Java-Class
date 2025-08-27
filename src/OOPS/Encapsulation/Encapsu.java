package OOPS.Encapsulation;
//binding of the data and actions together in one class

class Employee{
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public double setSalary(double salary) {
        if(salary>0) {
            this.salary = salary;
            System.out.println(salary);
        }
        else{
            System.out.println("Invalid Amount");
        }
        return salary;
    }

    private String name;
}

public class Encapsu {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello");
        Employee emp= new Employee();
//        Field Salary= Employee.class.getDeclaredField("salary");
//        Salary.setAccessible(true);
//        System.out.println(Salary.get(emp));
        double aa= emp.setSalary(20000);
        System.out.println(aa);
    }
}
