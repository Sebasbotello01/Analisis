import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero entero positivo");
        int x = sc.nextInt();
        if (x%2 ==0){
            System.out.println("No es primo");
        }else{
            System.out.println("Es primo");
        }
    }
}