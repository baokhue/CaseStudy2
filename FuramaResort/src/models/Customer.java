package models;

public class Customer extends Person{
    private String customerId;
    private String typeOfCustomer;
    private String address;

    public Customer() {
    }

    public Customer(String fullName, String dateOfBirth, boolean gender, String idCard, String phoneNumber, String email, String customerId, String typeOfCustomer, String address) {
        super(fullName, dateOfBirth, gender, idCard, phoneNumber, email);
        this.customerId = customerId;
        this.typeOfCustomer = typeOfCustomer;
        this.address = address;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public void setTypeOfCustomer(String typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                super.toString() +
                "customerId='" + customerId + '\'' +
                ", typeOfCustomer='" + typeOfCustomer + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
