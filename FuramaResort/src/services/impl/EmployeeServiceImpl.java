package services.impl;

import models.Employee;
import services.IEmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements IEmployeeService {
    static List<Employee> employeeList = new ArrayList<Employee>();

    static {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();

        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
    }


    public void manageEmployee(){
        Scanner scanner = new Scanner(System.in);
        int select = 0;

        do {
            System.out.println("-----Employee Management-----");
            System.out.println("1. Display list employees");
            System.out.println("2. Add new employee");
            System.out.println("3. Edit employee");
            System.out.println("4. Return main menu");
            System.out.println("Please input a number: ");
            select = Integer.parseInt(scanner.nextLine());

            if (select < 1 && select > 4) {
                System.out.println("Please input again!");
            } else {
                switch (select){
                    case 1: //Display list
                        findAll();
                        break;
                    case 2: //Add new
                        System.out.println("Input new full name: ");
                        String newFullName = scanner.nextLine();
                        System.out.println("Input new date of birth: ");
                        String newDateOfBirth = scanner.nextLine();
                        System.out.println("Input gender: ");
                        boolean newGender = Boolean.parseBoolean(scanner.nextLine());
                        System.out.println("Input ID card: ");
                        String newIdCard = scanner.nextLine();
                        System.out.println("Input phone number: ");
                        String newPhoneNumber = scanner.nextLine();
                        System.out.println("Input email: ");
                        String newEmail = scanner.nextLine();
                        System.out.println("Input Employee's ID: ");
                        String newId = scanner.nextLine();
                        System.out.println("Input education: ");
                        String education = "";
                        int level;
                        do {
                            System.out.println("---Education---");
                            System.out.println("1. Intermediate");
                            System.out.println("2. College");
                            System.out.println("3. University");
                            System.out.println("4. After Graduated");

                            System.out.println("Please in put a level: ");
                            level = Integer.parseInt(scanner.nextLine());
                            switch (level){
                                case 1:
                                    education = "Intermediate";
                                    break;
                                case 2:
                                    education = "College";
                                    break;
                                case 3:
                                    education = "University";
                                    break;
                                case 4:
                                    education = "After Graduated";
                                    break;
                            }
                            break;
                        }
                        while (level < 5);

                        System.out.println("Input position: ");
                        String newPosition = "";
                        int position = 0;
                        do {
                            System.out.println("---Position---");
                            System.out.println("1. Receptionist");
                            System.out.println("2. Waiter");
                            System.out.println("3. Technician");
                            System.out.println("4. Supervisor");
                            System.out.println("5. Manager");
                            System.out.println("6. Director");

                            System.out.println("Please input a number: ");
                            position = Integer.parseInt(scanner.nextLine());

                            switch (position){
                                case 1:
                                    newPosition = "Receptionist";
                                    break;
                                case 2:
                                    newPosition = "Waiter";
                                    break;
                                case 3:
                                    newPosition = "Technician";
                                    break;
                                case 4:
                                    newPosition = "Supervisor";
                                    break;
                                case 5:
                                    newPosition = "Manager";
                                    break;
                                case 6:
                                    newPosition = "Director";
                                    break;
                            }
                            break;
                        }
                        while (position > 0 && position < 7);
                        System.out.println("Input salary: ");
                        long newSalary = Long.parseLong(scanner.nextLine());

                        Employee employeeAdd = new Employee(newFullName, newDateOfBirth, newGender, newIdCard, newPhoneNumber, newEmail, newId, education, newPosition, newSalary);

                        addNew(employeeAdd);
                        break;
                    case 3: //Edit
                        update();
                        break;
                    case 4: //Return
                        break;
                }
                break;
            }
        }
        while (true);
    }

    @Override
    public void findAll() {
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    @Override
    public void addNew(Employee employee) {
        employeeList.add(employee);
    }

    @Override
    public void update() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input id of product needed to update: ");
//        int newId = Integer.parseInt(scanner.nextLine());

        String newIdCard = scanner.nextLine();
        for (int i = 0; i < employeeList.size(); i++) {
            if (newIdCard.equals(employeeList.get(i).getEmployeeId())){
                System.out.println("Input new salary: ");
                long newSalary = Long.parseLong(scanner.nextLine());
//                System.out.println("Input new product's price: ");
//                long newPrice = Long.parseLong(scanner.nextLine());
                employeeList.get(i).setSalary(newSalary);

                System.out.println(employeeList.get(i));
            }
        }

    }

    @Override
    public void returnMainMenu() {

    }
}
