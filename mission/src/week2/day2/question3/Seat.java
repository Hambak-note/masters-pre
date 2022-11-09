package week2.day2.question3;

public class Seat {

    private int typeNumber;
    private int seatNumber;
    private String booker;
    private boolean isBooked;

    public Seat(int typeNumber, int seatNumber) {
        this.typeNumber = typeNumber;
        this.seatNumber = seatNumber;
        booker = new String("__");
    }

    public boolean getIsBooked() {
        return isBooked;
    }

    public void setIsBooked(boolean state) {
        isBooked = state;
    }

    public String getBooker() {
        return booker;
    }

    public void setBookerName(String name) {
        this.booker = name;
    }
}


