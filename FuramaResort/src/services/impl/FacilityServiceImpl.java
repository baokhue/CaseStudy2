package services.impl;

import models.*;
import services.IFacilityService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements IFacilityService {
    static Map<Facility, Integer> facilityList = new LinkedHashMap<>();
    static int villaTime;
    static Villa villa = new Villa();
    static int houseTime;
    static House house = new House();
    static int roomTime;
    static Room room = new Room();
    static {
        facilityList.put(villa, villaTime);
        facilityList.put(house, houseTime);
        facilityList.put(room, roomTime);
    }

    @Override
    public void findAll() {
        for (Facility facility : facilityList.keySet()) {
            System.out.println(facility);
            System.out.println(facilityList.get(facility));
        }
    }

    @Override
    public void addNew() {
        Scanner sc = new Scanner(System.in);
        int select;
        do {
            System.out.println("1. Add New Villa");
            System.out.println("2. Add New House");
            System.out.println("3. Add New Room");
            System.out.println("4. Back to menu!");
            select = Integer.parseInt(sc.nextLine());
            switch (select){
                case 1:
                    if (villaTime == 5){
                        System.out.println("Maintenance Warning!");
                        break;
                    } else {
                        Villa villa = new Villa();
                        facilityList.put(villa.addVilla(), ++villaTime);
                    }
                    break;
                case 2:
                    if (houseTime == 5){
                        System.out.println("Maintenance Warning!");
                        break;
                    } else {
                        House house = new House();
                        facilityList.put(house.addHouse(), ++houseTime);
                    }
                    break;
                case 3:
                    if (roomTime == 5){
                        System.out.println("Maintenance Warning!");
                        break;
                    } else {
                        Room room = new Room();
                        facilityList.put(room.addRoom(), ++roomTime);
                    }
                    break;
                case 4:
                    break;
            }
        }while (select < 4);
    }

    @Override
    public void displayMaintenance() {
        if (villaTime == 5){
            System.out.println("Villa Booking should be maintained!");
        }if (houseTime == 5){
            System.out.println("House Booking should be maintained!");
        }if (roomTime == 5){
            System.out.println("Room Booking should be maintained!");
        }
    }

    @Override
    public void returnMainMenu() {
        Scanner scanner = new Scanner(System.in);
        int select = 0;

        do {
            System.out.println("-----Facility Management-----");
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Display list facility maintenance");
            System.out.println("4. Return main menu");
            System.out.println("Please input a number: ");
            select = scanner.nextInt();

            if (select < 1 && select > 4) {
                System.out.println("Please input again!");
            } else {
                switch (select){
                    case 1: //Display list
                        findAll();
                        break;
                    case 2: //Add new
                        addNew();
                        break;
                    case 3: //Display maintenance
                        displayMaintenance();
                        break;
                    case 4: //Return
                        break;
                }
            }
        }
        while (true);
    }
}
