package HotelOperations;

import java.math.BigDecimal;

public class Room {

    int numberOfBeds;
    double price;
    boolean occupied;
    boolean dirty;
    boolean available;

    public Room(int numberOfBeds, double price) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
       }

        public int getNumberOfBeds() {
            return numberOfBeds;
        }

        public double getPrice() {
            return price;
        }

        public boolean isOccupied(){
        return occupied;
        }

        public boolean isDirty(){
        return dirty;
        }

        public boolean isAvailable(){
        if (!isOccupied() && !isDirty()){
            return true;
        }
        return false;
        }

        public void checkIn(){
        this.dirty = true;
        this.occupied = true;
        }

        public void checkOut(){
        cleanRoom();
        this.occupied = false;
    }

    public void cleanRoom(){
        this.dirty = false;
    }


}

