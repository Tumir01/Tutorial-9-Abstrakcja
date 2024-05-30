package zad3;

public class Employee extends Person{
    private final int hireDate;
    private final String companyName;
    private final double salary;

    public Employee(String firstName, String lastName,int birthdayYear, int hireDate, String companyName, double salary){
        super(firstName, lastName, birthdayYear);
        this.companyName = companyName;
        this.hireDate = hireDate;
        this.salary = salary;
    }

    public int getJobSeniority(){
        return 2024-hireDate;
    }

    public double getSalary(){
        return salary;
    }

    public String getCompanyName() {
        return companyName;
    }
}
