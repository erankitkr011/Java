package oops;

public class Circle {
    public static void main(String[] args){
        ak ak1 = new ak();
        ak1.setValues(10.6f);
        ak1.getValues();
    }
}

class ak {
    private float radius;

    public void setValues(float num){
        radius = num;
    }

    public void getValues(){
        System.out.println("Radius value is " + radius);
    }

    public void AreaOfCircle(){

    }

}
