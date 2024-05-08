public class Rectangle {

    private int length;
    private int width;


    public Rectangle(int length, int width){

        this.length = length;
        this.width = width;




    }

    public int areaCalc(){

        if (length >=0 && width>=0){
            int area = length*width;
            //System.out.println("The rectangle has an area of " + area);
            return area;
        }

        return 0;


    }

    public boolean isSquare(){
        if(length == width){
            return true;
        }
        return false;
    }



}
