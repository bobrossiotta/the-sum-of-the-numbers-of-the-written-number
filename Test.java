import java.util.Scanner;
pimport java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String n1, n2;
        Scanner input = new Scanner(System.in);
            System.out.print("N1 :");
            n1 = input.nextLine();
            System.out.print("N2 : ");
            n2 = input.nextLine();
        int i=1;
        int ebob=1;
        int ekok=n1*n2;
    while (i <= n1){
         if (n1 % i == 0 && n2 % i == 0){
        ebob=i;
    }
    }
    int k = Math.max(n1,n2);
        System.out.println(i);
        while (true){
            if (k%n1==0 && k%n2==0){
                ekok=k;
                break;
            }
            k++;
        }
        System.out.println("ebob"+ebob);
        System.out.println("ekok"+ekok);
}}