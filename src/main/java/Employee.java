public class Employee
{
    private int employeeId;
    private String name;
    private double hoursWorked;
    private double payRate;

    public Employee(int id, String name, double hoursWorked, double payRate)
    {
        this.payRate = payRate;
        this.employeeId = id;
        this.name = name;
        this.hoursWorked = hoursWorked;
    }
    public int getEmployeeId()
    {
        return employeeId;
    }

    public String getName()
    {
        return name;
    }

    public double getHoursWorked()
    {
        return hoursWorked;
    }

    public double getPayRate()
    {
        return payRate;
    }

    public double getGrossPay(double hrsWorked, double payRate)
    {
        return hrsWorked * payRate;
    }
}


