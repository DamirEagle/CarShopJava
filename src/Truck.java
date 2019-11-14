public class Truck  extends Cars{
    private double Load_Capacity;

    public Truck(){
        super();
        this.Load_Capacity = 0;
    }

    public Truck (String model, int date, float speed, float Load_Capacity){
        super(model,date,speed);
        this.Load_Capacity = Load_Capacity;
    }

    @Override
    public void print_car() {
        super.print_car();
        System.out.print(" грузопродъемность:" + this.Load_Capacity);
    }
}
