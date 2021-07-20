class Car{
    public void start(){
        System.out.println("Car is started");
    }
    public void accerlate(){
        System.out.println("Car is accerlated");
    }
    public void changeGear(){
        System.out.println("Car changes gear");
    }
}
class LuxaryCar extends Car{
    @Override
    public void changeGear(){
        System.out.println("LuxaryCar changes its gear");
    }
    public void openRoof(){
        System.out.println("Roof of Luxarycar is opened");
    }
}
public class Mypratice6 {
    public static void main(String[] args) {
        Car c = new LuxaryCar();
        c.changeGear();
        c.accerlate();
        c.start();
    }
}
