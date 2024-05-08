import org.w3c.dom.css.Rect;

import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) {
        rectangleDemo();
        computerDemo();
        shoppingTrolleyDemo();
    }

    public static void rectangleDemo(){
        System.out.println("----------");
        System.out.println("Running rectangle tasks...");

        // 1. Create a new rectangle object
       Rectangle rectangle = new Rectangle(4,5);


        // 2. Calculate the rectangle's area and store it in a variable
        int area = rectangle.areaCalc();
       System.out.println("The rectangle has an area of " + area);

        // 3. Check if your rectangle is actually a square
       boolean isRectangle = rectangle.isSquare();
        System.out.println("Object is a square: " + isRectangle);
    }

    public static void computerDemo(){
        System.out.println("----------");
        System.out.println("Running computer tasks...");

        // 1. Create a new computer object
        Computer computer = new Computer(5);

        // 2. Use a getter to find out how much storage the computer has
       int currentStorage = computer.getStorage();
       System.out.println("Computer has " + currentStorage + "GB storage");

        // 3. Add more storage to the computer
         computer.addStorage(10);

        // We use the getter again to check that the amount of storage has been updated
       int newStorage = computer.getStorage();
       System.out.println("Computer now has " + newStorage + "GB storage");

        // 4. Use a setter to update the computer's printer property
        computer.updatePrinter("Canon");
        // Write a getter and use it below to check that the setter worked
      String currentPrinter = computer.getPrinter();
      System.out.println("Computer currently has a " + currentPrinter + " printer connected.");

        // 5. Write a method to print a message.
        // To test this works *without* a printer too you can comment out the code for question 4
       computer.printMessage("Hello World!");
    }

    public static void shoppingTrolleyDemo(){
        System.out.println("----------");
        System.out.println("Running shopping trolley tasks...");

        // 1. Create a new shopping trolley
        ArrayList<String> items = new ArrayList<>();

        ShoppingTrolley trolley = new ShoppingTrolley(items);

        // 2. Add an item to the trolley
//        <CALL YOUR METHOD HERE>;

        trolley.addItems("milk");
        trolley.addItems("eggs");
        trolley.addItems("bread");
        trolley.addItems("cheese");



        // 3. Count items in the trolley
        int itemCount = trolley.countItems();
        System.out.println("The trolley contains " + itemCount + " items.");

        // 4. Check if an item is in the trolley
        boolean itemInTrolley = trolley.itemInTrolley("cheese");
        System.out.println(itemInTrolley);
        System.out.println("Object is a square (true/false): " + itemInTrolley);
    }


}
