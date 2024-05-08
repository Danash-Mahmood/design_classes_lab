import java.lang.reflect.Array;
import java.util.ArrayList;

public class ShoppingTrolley {

    private ArrayList<String> trolleyItems;



    public ShoppingTrolley(ArrayList<String> trolleyItems){

        this.trolleyItems = trolleyItems;

    }

    public void addItems(String item){
        System.out.println(trolleyItems.add(item));
    }

    public int countItems(){
        return trolleyItems.size();
    }

    public boolean itemInTrolley(String item){
        for (int i=0;i<trolleyItems.size();i++){
            if (item.equals(trolleyItems.get(i) )){
                return true;
            }
            else{
                continue;

            }


        }
        return false;

    }


}

