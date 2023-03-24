package models;

import java.util.Scanner;

public class Villa extends Facility{
    private String standard;
    private double poolArea;
    private int numberOfFloor;

    public Villa() {
    }

    public Villa(String typeOfFacility, double usableSquare, long rent, int numberOfPeople, int term, String standard, double poolArea, int numberOfFloor) {
        super(typeOfFacility, usableSquare, rent, numberOfPeople, term);
        this.standard = standard;
        this.poolArea = poolArea;
        this.numberOfFloor = numberOfFloor;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    public Villa addVilla() {
        Scanner sc = new Scanner(System.in);
        String typeOfFacility = "Villa";
        System.out.println("Input usable square: ");
        double usableSquare = Double.parseDouble(sc.nextLine());
        System.out.println("Input rent: ");
        long rent = Long.parseLong(sc.nextLine());
        System.out.println("Input number of people: ");
        int numberOfPeople = Integer.parseInt(sc.nextLine());
        System.out.println("Input term: ");
        int term = Integer.parseInt(sc.nextLine());
        System.out.println("Input standard: ");
        String standard = sc.nextLine();
        System.out.println("Input pool area: ");
        double poolArea = Double.parseDouble(sc.nextLine());
        System.out.println("Input number of floor: ");
        int numberOfFloor = Integer.parseInt(sc.nextLine());

        Villa villa = new Villa(typeOfFacility, usableSquare, rent, numberOfPeople, term, standard, poolArea, numberOfFloor);
        return villa;
    }
    @Override
    public String toString() {
        return "Villa{" +
                super.toString() +
                "standard='" + standard + '\'' +
                ", poolArea=" + poolArea +
                ", numberOfFloor=" + numberOfFloor +
                '}';
    }
}
