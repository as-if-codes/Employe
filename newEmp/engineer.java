public class engineer extends salariedEmployee {

    int overTime;

    public engineer(int empId, String fName, String lName, String email, int basic, int overTime, String designation) {
        super(empId, fName, lName, email, basic, designation);
        this.basic = basic;
        this.overTime = overTime;

    }

}
