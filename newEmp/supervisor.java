public class supervisor extends salariedEmployee {
    int dAllowance, meetingAllowance;

    public supervisor(int empId, String fName, String lName, String email,
            int basic,
            int meetingAllowance, String designation) {
        super(empId, fName, lName, email, basic, designation);
        this.meetingAllowance = meetingAllowance;
    }
}
