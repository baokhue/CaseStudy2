package models;

import java.util.Scanner;

public class Room extends Facility{
    private String otherFreeFacility;

    public Room() {
    }

    public Room(String typeOfFacility, double usableSquare, long rent, int numberOfPeople, int term, String otherFreeFacility) {
        super(typeOfFacility, usableSquare, rent, numberOfPeople, term);
        this.otherFreeFacility = otherFreeFacility;
    }

    public String getOtherFreeFacility() {
        return otherFreeFacility;
    }

    public void setOtherFreeFacility(String otherFreeFacility) {
        this.otherFreeFacility = otherFreeFacility;
    }

    public Room addRoom() {
        Scanner sc = new Scanner(System.in);
        String typeOfFacility = "Room";
        System.out.println("Input usable square: ");
        double usableSquare = Double.parseDouble(sc.nextLine());
        System.out.println("Input rent: ");
        long rent = Long.parseLong(sc.nextLine());
        System.out.println("Input number of people: ");
        int numberOfPeople = Integer.parseInt(sc.nextLine());
        System.out.println("Input term: ");
        int term = Integer.parseInt(sc.nextLine());
        System.out.println("Input other free facility: ");
        String otherFreeFacility = sc.nextLine();

        Room room = new Room(typeOfFacility, usableSquare, rent, numberOfPeople, term, otherFreeFacility);
        return room;
    }
    @Override
    public String toString() {
        return "Room{" +
                super.toString() +
                "otherFreeFacility='" + otherFreeFacility + '\'' +
                '}';
    }
}
