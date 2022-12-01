

public class Main {
    public static void main(String[] args) {
        engineer a = new engineer(188, "Ramesh", "Tribbiani", "ramesh@gmail.com", 40000, 800);
        a.displaySalary();
        manager b = new manager(979, "Suresh", "Bing", "suresh@gmail.com", 120000, 53000, 30000, 25000);
        b.displaySalary();
        supervisor c = new supervisor(216, "Ganesh", "Gellar", "ganesh@gmail.com", 70000, 30000, 20000);
        c.displaySalary();
        wagedEmployee d = new wagedEmployee(319, "Jignesh", "Green", "jignesh@gmail.com", 1200, 25, 550);

    }
}

 class emp1 {
    int empId;
    String fName, lName, email;

    emp1(int empId, String fName, String lName, String email) {
        this.empId = empId;
        this.fName = fName;
        this.lName = lName;
        this.email = email;

        System.out.println("Employe ID        :\t" + empId);
        System.out.println("Employe firstname :\t" + fName);
        System.out.println("Employe lastname  :\t" + lName);
        System.out.println("Email address     :\t" + email);
    }
}

 class salariedEmployee extends emp1 {

    float hra, da, Salary;
    int basic;

    salariedEmployee(int empId, String fName, String lName, String email, int basic) {

        super(empId, fName, lName, email);
        this.basic = basic;

    }

    public void displaySalary() {

        float hra, da, Salary;
        hra = 0.4F * basic;
        da = 0.7F * basic;
        Salary = basic + hra + da;
        System.out.println("Salary            :\t" + Salary);
        System.out.println("***************************************");

    }
}

class engineer extends salariedEmployee {

    int overTime;

    public engineer(int empId, String fName, String lName, String email, int basic, int hra) {
        super(empId, fName, lName, email, basic);
        this.hra = hra;
        this.basic = basic;

    }

}

 class wagedEmployee extends emp1 {

    int dailyWageRate;
    int noOfDays;
    int overTime;
    int salary;

    public wagedEmployee(int empId, String fName, String lName, String email, int dailyWageRate, int noOfDays,
            int overTime) {
        super(empId, fName, lName, email);
        this.dailyWageRate = dailyWageRate;
        this.noOfDays = noOfDays;
        this.overTime = overTime;
        salary = noOfDays * dailyWageRate + overTime;
        System.out.println("Salary            :\t" + salary);
        System.out.println("***************************************");

    }
}

class supervisor extends salariedEmployee {
    int dAllowance, meetingAllowance;

    public supervisor(int empId, String fName, String lName, String email, int basic, int dAllowance,
            int meetingAllowance) {
        super(empId, fName, lName, email, basic);
        this.dAllowance = dAllowance;
        this.meetingAllowance = meetingAllowance;

    }
}

class manager extends salariedEmployee {

    int dAllowance, meetingAllowance, travelAllowance;

     manager(int empId, String fName, String lName, String email, int basic, int dAllowance, int meetingAllowance,
            int travelAllowance) {
        super(empId, fName, lName, email, basic);
        this.dAllowance = dAllowance;
        this.meetingAllowance = meetingAllowance;
        this.travelAllowance = travelAllowance;

    }

}

