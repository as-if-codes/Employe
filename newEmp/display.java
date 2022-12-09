public class display {
        public static void main(String[] args) {
                engineer a = new engineer(188, "Ramesh",
                                "Tribbiani", "ramesh@gmail.com", 40000,
                                800, "Engineer");

                a.displaySalary();

                manager b = new manager(979, "Suresh",
                                "Bing", "suresh@gmail.com", 120000,
                                53000, "Manager");
                b.displaySalary();

                supervisor c = new supervisor(216, "Ganesh", "Gellar",
                                "ganesh@gmail.com", 70000, 30000,
                                "Supervisor");
                c.displaySalary();

                new wagedEmployee(319, "Jignesh",
                                "Green", "jignesh@gmail.com", 1200,
                                25, 550, "Waged Employee");

        }
}
