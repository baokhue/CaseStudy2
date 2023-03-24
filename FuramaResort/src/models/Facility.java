package models;

import java.util.Scanner;

public abstract class Facility {
    private String typeOfFacility;
    private double usableSquare;
    private long rent;
    private int numberOfPeople;
    private int term;

    public Facility() {
    }

    public Facility(String typeOfFacility, double usableSquare, long rent, int numberOfPeople, int term) {
        this.typeOfFacility = typeOfFacility;
        this.usableSquare = usableSquare;
        this.rent = rent;
        this.numberOfPeople = numberOfPeople;
        this.term = term;
    }

    public String getTypeOfFacility() {
        return typeOfFacility;
    }

    public void setTypeOfFacility(String typeOfFacility) {
        this.typeOfFacility = typeOfFacility;
    }

    public double getUsableSquare() {
        return usableSquare;
    }

    public void setUsableSquare(double usableSquare) {
        this.usableSquare = usableSquare;
    }

    public long getRent() {
        return rent;
    }

    public void setRent(long rent) {
        this.rent = rent;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "TypeOfFacility='" + typeOfFacility + '\'' +
                ", usableSquare=" + usableSquare +
                ", rent=" + rent +
                ", numberOfPeople=" + numberOfPeople +
                ", term=" + term +
                '}';
    }
}
