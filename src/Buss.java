public class Buss  extends Cars{
    private double People_Capacity;

    public Buss(){
        super();
        this.People_Capacity = 0;
    }

    public Buss (String model, int date, float speed, float People_Capacity){
        super(model,date,speed);
        this.People_Capacity = People_Capacity;
    }

    @Override
    public void print_car() {
        super.print_car();
        System.out.print(" вместимость:" + this.People_Capacity);
    }
}
