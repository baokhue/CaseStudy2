package controllers;

import services.impl.CustomerServiceImpl;
import services.impl.EmployeeServiceImpl;
import services.impl.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        int select = 0;
        do {
            System.out.println("------Main Menu-----");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");

            System.out.println("Please input a number: ");
            select = Integer.parseInt(scanner.nextLine());

            switch (select){
                case 1: //Employee Management
                    EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
                    employeeService.manageEmployee();
                    break;
                case 2: //Customer Management
                    CustomerServiceImpl customerService = new CustomerServiceImpl();
                    customerService.manageCustomer();
                    break;
                case 3: //Facility Management
                    FacilityServiceImpl facilityService = new FacilityServiceImpl();
                    facilityService.returnMainMenu();
                    break;
                case 4: //Booking Management
                    System.out.println("-----Booking Management-----");
                    System.out.println("1. Add new booking");
                    System.out.println("2. Display list booking");
                    System.out.println("3. Create new contracts");
                    System.out.println("4. Display list contracts");
                    System.out.println("5. Edit contracts");
                    System.out.println("6. Return main menu");
                    break;
                case 5: //Promotion Management
                    System.out.println("-----Promotion Management-----");
                    System.out.println("1. Display list customers use service");
                    System.out.println("2. Display list customers get voucher");
                    System.out.println("3. Return main menu");
                    break;
                case 6: //Exit
                    System.exit(0);
            }
        }
        while (true);
    }

    public static void main(String[] args) {
        displayMainMenu();
    }

}
