abstract class Shape{
    abstract public double perimeter();
    abstract public double area();
}
class Cricle extends Shape{
    public double radius;
    @Override
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    @Override
    public double area(){
        return Math.PI*radius*radius;
    }

}
class Rectangle extends Shape{
    public double length;
    public double breath;

    @Override
    public double perimeter() {
        return 2*(length+breath);
    }
    @Override
    public  double area(){
        return length*breath;
    }
}
class Iregular extends Shape{
    public double perimeter(){
        return 9.78643;
    }
    public double area(){
        return 687.89;
    }
}

public class Mypratice7_abstract {
    public static void main(String[] args) {
        Cricle c = new Cricle();
        c.radius=15;
        Shape s=c;
        System.out.println(new StringBuilder().append(s.perimeter()).append("  ").append(s.area()).toString());
        Rectangle r = new Rectangle();
        r.breath=10;
        r.length=15;
        System.out.println(r.area());
        System.out.println(r.perimeter());
        Shape i = new Iregular();
        System.out.println(i.perimeter());
    }
}
