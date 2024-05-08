public class Computer {

   private int storage;
    private String printerModel;

    public Computer(int storage) {
        this.storage = storage;
        this.printerModel = "Not connected";

    }

    public int getStorage() {
        return storage;
    }

    public int addStorage(int addedStorage) {
        storage = storage + addedStorage;
        return storage;
    }

    public void updatePrinter(String currentPrinter) {
        printerModel = currentPrinter;


    }

    public String getPrinter() {
        return printerModel;
    }

    public void printMessage(String message) {
        if (!printerModel.equals("Not connected")) {
            System.out.println(message);

        }


    }
}
