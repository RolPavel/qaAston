package lesson2_aqa;

public class Info {
    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];

        persArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Employee("Petrov Petr", "Manager", "petrov@mailbox.com", "892312313", 50000, 40);
        persArray[2] = new Employee("Sidorov Sidr", "Director", "sidorov@mailbox.com", "892312314", 70000, 50);
        persArray[3] = new Employee("Sergeev Sergey", "Developer", "sergeev@mailbox.com", "892312315", 40000, 28);
        persArray[4] = new Employee("Alexeev Alexey", "Analyst", "alexey@mailbox.com", "892312316", 45000, 36);

        for (Employee employee : persArray) {
            employee.printInfo();
            System.out.println();
        }

        Park.Attraction attraction1 = new Park.Attraction("Roller Coaster", "10:00 - 18:00", 20.0);
        Park.Attraction attraction2 = new Park.Attraction("Ferris Wheel", "09:00 - 17:00", 15.0);

        attraction1.printInfo();
        System.out.println();
        attraction2.printInfo();
    }
}
