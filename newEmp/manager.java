public class manager extends salariedEmployee {

    int meetingAllowance, travelAllowance;

    public manager(int empId, String fName, String lName, String email,
            int basic, int travelAllowance, String designation) {
        super(empId, fName, lName, email, basic, designation);
        this.travelAllowance = travelAllowance;

    }

    public void displaySalary() {

        float hra, da, Salary;
        hra = 0.4F * basic;
        da = 0.7F * basic;
        Salary = basic + hra + da;
        // System.out.println(basic + " " + hra + " " + da);
        System.out.println("Salary            :\t" + Salary);

        System.out.println("***************************************");

    }

}
