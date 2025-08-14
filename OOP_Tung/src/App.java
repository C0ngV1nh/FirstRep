import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Nhập n: ");
        int n = scanner.nextInt();

        int sum = 0;
       for(int i = 1 ; i <= n ; i++){
            sum+=i;
       }
        System.out.println("tổng các số từ 1 đến n: " + sum);

    }
}
