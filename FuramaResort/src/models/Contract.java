package models;

public class Contract {
    private String codeNumber;
    private String bookingId;
    private long deposit;
    private long total;
    private String customerId;

    public Contract() {
    }

    public Contract(String codeNumber, String bookingId, long deposit, long total, String customerId) {
        this.codeNumber = codeNumber;
        this.bookingId = bookingId;
        this.deposit = deposit;
        this.total = total;
        this.customerId = customerId;
    }

    public String getCodeNumber() {
        return codeNumber;
    }

    public void setCodeNumber(String codeNumber) {
        this.codeNumber = codeNumber;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public long getDeposit() {
        return deposit;
    }

    public void setDeposit(long deposit) {
        this.deposit = deposit;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "codeNumber='" + codeNumber + '\'' +
                ", bookingId='" + bookingId + '\'' +
                ", deposit=" + deposit +
                ", total=" + total +
                ", customerId='" + customerId + '\'' +
                '}';
    }
}
