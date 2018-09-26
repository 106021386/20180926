import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int h =scn.nextInt();
        int t =scn.nextInt();
        if(t == 1){
            System.out.println((h-80)*0.7f );
        }
        else {
            System.out.println((h-70)*0.6f);
        }

    }



}
