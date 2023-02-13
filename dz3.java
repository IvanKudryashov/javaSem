package sem1;
import java.util.*;
/*Реализовать простой калькулятор */
public class dz3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("введите операцию ");
        char m = scanner.next().charAt(0);
        System.out.printf("int a = ");
        int a = scanner.nextInt();
        System.out.printf("int b = ");
        int b = scanner.nextInt();
        switch(m) {
            case '+': 
            System.out.println(a + b);
            break;
            case '-': 
            System.out.println(a - b);
            break;
            case '*': 
            System.out.println(a * b);
            break;
            case '/': 
            System.out.println(a / b);
            break;
        }
        scanner.close();
    }
}
