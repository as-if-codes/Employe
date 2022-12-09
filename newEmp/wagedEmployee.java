public class wagedEmployee extends emp1 {

    int dailyWageRate;
    int noOfDays;
    int overTime;
    int salary;

    public wagedEmployee(int empId, String fName, String lName, String email, int dailyWageRate, int noOfDays,
            int overTime, String designation) {
        super(empId, fName, lName, email, designation);
        this.dailyWageRate = dailyWageRate;
        this.noOfDays = noOfDays;
        this.overTime = overTime;
        salary = noOfDays * dailyWageRate + overTime;
        System.out.println("Salary            :\t" + salary);
        System.out.println("***************************************");

    }
}