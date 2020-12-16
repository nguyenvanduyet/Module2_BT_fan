import org.omg.CORBA.INTERNAL;

public class Fan {
    static final int SLOW=1;
    static final int MEDIUM=2;
    static final int FAST=3;
    private int speed=SLOW;
    private int radius=5;
    private boolean on=false;
    private String color="Blue";

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){
        if (isOn()){
            return ("speed"+speed+"color"+color+"radius"+radius+"fan is on");
        }else {
            return ("color"+color+"radius"+radius+"fan is off");
        }

    }
}