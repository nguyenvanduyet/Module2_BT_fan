public class Main {
    public static void main(String[] args) {
        Fan fan=new Fan();
        fan.setSpeed(Fan.MEDIUM);
        fan.setColor("blue");
        fan.setRadius(5);
        fan.setOn(false);
        System.out.println(fan.toString());


    }
}
