import java.util.Scanner;

public class Mypratice3 {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enetr marks of subject 1");
        int a= sc.nextInt();
        System.out.println("enetr marks of subject 2");
        int b = sc.nextInt();
        System.out.println("enetr marks of subject 3");
        int c = sc.nextInt();
        float percentage =(float) (a+b+c)/3;
        System.out.println(percentage);
    }
}
