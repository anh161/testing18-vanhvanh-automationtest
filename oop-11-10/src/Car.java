public class Car extends Vehicle {
   private int seat;
    private String fuleType;

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public String getFuleType() {
        return fuleType;
    }

    public void setFuleType(String fuleType) {
        this.fuleType = fuleType;
    }

    public Car(){
        super(); // Kees thuwfa hamf khowir tajo khoong tham soos cura class cha
    }

    public Car(String id,
               String name,
               String model,
               String color,
               int seat,
               String fuleType){
        super(id, name, model, color); // kees thuwfa hamf khowr tajo cos tham so cura class cha
        this.seat = seat;
        this.fuleType = fuleType;
    }

    public void display(){
        super.display();
        System.out.println("Seat: " + seat);
        System.out.println("Fule Type: " + fuleType);
    }

}
