package sem1;
import java.util.*;

/*Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n) */
public class dz1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("int n = ");
        int n = scanner.nextInt();
        scanner.close();
        int fact = 1;
        System.out.println("sum = " + (n*(n + 1))/2);
        while (n > 1){
            fact*=n;
            n--;
        }
        System.out.println("fact = " + fact);
    }
}
