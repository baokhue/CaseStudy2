package models;

public class Booking {
    private String bookingId;
    private String arrivalDate;
    private String departureDate;
    private String customerId;
    private String nameOfFacility;
    private String typeOfFacility;

    public Booking() {
    }

    public Booking(String bookingId, String arrivalDate, String departureDate, String customerId, String nameOfFacility, String typeOfFacility) {
        this.bookingId = bookingId;
        this.arrivalDate = arrivalDate;
        this.departureDate = departureDate;
        this.customerId = customerId;
        this.nameOfFacility = nameOfFacility;
        this.typeOfFacility = typeOfFacility;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getNameOfFacility() {
        return nameOfFacility;
    }

    public void setNameOfFacility(String nameOfFacility) {
        this.nameOfFacility = nameOfFacility;
    }

    public String getTypeOfFacility() {
        return typeOfFacility;
    }

    public void setTypeOfFacility(String typeOfFacility) {
        this.typeOfFacility = typeOfFacility;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId='" + bookingId + '\'' +
                ", arrivalDate='" + arrivalDate + '\'' +
                ", departureDate='" + departureDate + '\'' +
                ", customerId='" + customerId + '\'' +
                ", nameOfFacility='" + nameOfFacility + '\'' +
                ", typeOfFacility='" + typeOfFacility + '\'' +
                '}';
    }
}
