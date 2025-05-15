

public class Reservation {

    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean isWeekends;
    private double reservationTotal;

    public Reservation(String roomType, double price, int numberOfNights) {
        this.roomType = roomType;
        this.price = price;
        this.numberOfNights = numberOfNights;
    }

    public String getRoomType() {
        return roomType;
    }

    public double getPrice() {
        double pricePerNight = 124;
        double wpricePerNight = 124;
        if (roomType.equalsIgnoreCase("king")){
            pricePerNight = 139;
        }
        if (isWeekends){
            pricePerNight += pricePerNight * 0.1;
        }
        return pricePerNight;
    }

    public double getNumberOfNights() {
        return numberOfNights;
    }

    public boolean isWeekends() {
        return isWeekends;
    }

    public double getReservationTotal() {
        return numberOfNights * getPrice();
    }
}
