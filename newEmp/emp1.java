public class emp1 {
    int empId;
    String fName, lName, email, designation;

    emp1(int empId, String fName, String lName, String email, String designation) {
        this.empId = empId;
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.designation = designation;

        System.out.println("Employe ID        :\t" + empId);
        System.out.println("Employe firstname :\t" + fName);
        System.out.println("Employe lastname  :\t" + lName);
        System.out.println("Email address     :\t" + email);
        System.out.println("Employe Type      :\t" + designation);
    }
}