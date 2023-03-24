package services.impl;

import models.Customer;
import services.ICustomerService;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements ICustomerService {
    static List<Customer> customerList = new LinkedList<>();

    static {
        Customer customer1 = new Customer();
        Customer customer2 = new Customer();
        Customer customer3 = new Customer();
        Customer customer4 = new Customer();

        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        customerList.add(customer4);
    }

    public void manageCustomer() {
        Scanner scanner = new Scanner(System.in);
        int select = 0;

        do {
            System.out.println("-----Customer Management-----");
            System.out.println("1. Display list customers");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Return main menu");

            System.out.println("Please input a number!");
            select = Integer.parseInt(scanner.nextLine());

            if (select < 1 && select > 4) {
                System.out.println("Please input again!");
            } else {
                switch (select) {
                    case 1: //Display
                        findAll();
                        break;
                    case 2: //Add new
                        System.out.println("Please input full name: ");
                        String fullName = scanner.nextLine();
                        System.out.println("Input date of birth: ");
                        String dateOfBirth = scanner.nextLine();
                        System.out.println("Input gender: ");
                        boolean gender = Boolean.parseBoolean(scanner.nextLine());
                        System.out.println("Input ID card: ");
                        String idCard = scanner.nextLine();
                        System.out.println("Input phone number: ");
                        String phoneNumber = scanner.nextLine();
                        System.out.println("Input email: ");
                        String email = scanner.nextLine();
                        System.out.println("Input id: ");
                        String id = scanner.nextLine();
                        System.out.println("Input type of customer: ");
                        String typeOfCustomer = "";
                        int type = 0;
                        do {
                            System.out.println("---Type of Customer---");
                            System.out.println("1. Diamond");
                            System.out.println("2. Platinum");
                            System.out.println("3. Gold");
                            System.out.println("4. Silver");
                            System.out.println("5. Member");

                            type = Integer.parseInt(scanner.nextLine());
                            switch (type) {
                                case 1:
                                    typeOfCustomer = "Diamond";
                                    break;
                                case 2: 
                                    typeOfCustomer = "Platinum";
                                    break;
                                case 3:
                                    typeOfCustomer = "Gold";
                                    break;
                                case 4:
                                    typeOfCustomer = "Silver";
                                    break;
                                case 5:
                                    typeOfCustomer = "Member";
                                    break;
                            }
                        } while (type > 0 && type < 5);
                        System.out.println("Input address: ");
                        String address = scanner.nextLine();

                        Customer customerAdding = new Customer(fullName, dateOfBirth, gender, idCard, phoneNumber, email, id, typeOfCustomer, address);
                        addNew(customerAdding);
                        break;
                    case 3: //Edit
                        break;
                    case 4: //Return
                        break;
                }
            }
        }
        while (true);
    }

    @Override
    public void findAll() {
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

    public void addNew(Customer customer) {
        customerList.add(customer);
    }

    @Override
    public void updateInformation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input id of product needed to update: ");
//        int newId = Integer.parseInt(scanner.nextLine());

        String newIdCard = scanner.nextLine();
        for (int i = 0; i < customerList.size(); i++) {
            if (newIdCard.equals(customerList.get(i).getCustomerId())){
                System.out.println("Input new salary: ");
                String newEmail = scanner.nextLine();
//                System.out.println("Input new product's price: ");
//                long newPrice = Long.parseLong(scanner.nextLine());
                customerList.get(i).setEmail(newEmail);

                System.out.println(customerList.get(i));
            }
        }

    }

    @Override
    public void returnMainMenu() {

    }
}
