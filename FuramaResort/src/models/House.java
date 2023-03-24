package models;

import java.util.Scanner;

public class House extends Facility{
    private String houseStandard;
    private int numberOfFloor;

    public House() {
    }

    public House(String typeOfFacility, double usableSquare, long rent, int numberOfPeople, int term, String houseStandard, int numberOfFloor) {
        super(typeOfFacility, usableSquare, rent, numberOfPeople, term);
        this.houseStandard = houseStandard;
        this.numberOfFloor = numberOfFloor;
    }

    public String getHouseStandard() {
        return houseStandard;
    }

    public void setHouseStandard(String houseStandard) {
        this.houseStandard = houseStandard;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    public House addHouse() {
        Scanner sc = new Scanner(System.in);
        String typeOfFacility = "House";
        System.out.println("Input usable square: ");
        double usableSquare = Double.parseDouble(sc.nextLine());
        System.out.println("Input rent: ");
        long rent = Long.parseLong(sc.nextLine());
        System.out.println("Input number of people: ");
        int numberOfPeople = Integer.parseInt(sc.nextLine());
        System.out.println("Input term: ");
        int term = Integer.parseInt(sc.nextLine());
        System.out.println("Input house standard: ");
        String houseStandard = sc.nextLine();
        System.out.println("Input number of floor: ");
        int numberOfFloor = Integer.parseInt(sc.nextLine());

        House house = new House(typeOfFacility, usableSquare, rent, numberOfPeople, term, houseStandard, numberOfFloor);
        return house;
    }
    @Override
    public String toString() {
        return "House{" +
                super.toString() +
                "houseStandard='" + houseStandard + '\'' +
                ", numberOfFloor=" + numberOfFloor +
                '}';
    }
}
