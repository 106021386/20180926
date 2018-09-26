import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a =scn.nextInt(),
            b =scn.nextInt(),
            c =scn.nextInt(),
            r =scn.nextInt();
        int f = r-(a*15+b*20+c*30);

        if (f<0){
            System.out.println("0");
        }
        else {
            System.out.println(f/50);
            f = f%50;
            System.out.println(f/5);
            System.out.println(f%5);




        }
    }
}
