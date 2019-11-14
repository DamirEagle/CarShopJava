 public class Cars implements Comparable<Cars>{
    private String model;
    private int date;
    private float speed;

    public Cars(){
        this.model = "None";
        this.date = 0;
        this.speed = 0;
    }
    public Cars(String model, int date, float speed){
        this.model=model;
        this.date=date;
        this.speed = speed;
    }

    public void print_car(){
        System.out.print("Model: " + this.model + " " + this.date + ". Max speed: " + this.speed);
    }

    public int compareTo(Cars car){
        return car.date - this.date;
    }
}
