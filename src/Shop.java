import com.sun.javafx.scene.traversal.SubSceneTraversalEngine;
import com.sun.xml.internal.bind.v2.model.core.NonElement;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Cars> list_cars;

    public Shop(){
        this.list_cars = new ArrayList<Cars>();
    }
    public void print_cars(){
        for (int i = 0; i<this.list_cars.size(); i++){
            this.list_cars.get(i).print_car();
            System.out.println();
        }
    }

    public void add (Cars car){
        this.list_cars.add(car);
    }

    public void ShortByYear()
    {
        //this.list_cars.reverse(Cars::compareTo);
        this.list_cars.sort(Cars::compareTo);
    }
}
