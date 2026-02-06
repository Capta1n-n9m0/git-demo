import java.util.Scanner;

public class Sum{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int acc = 0;
        while(input.hasNextInt()){
            int num = input.nextInt();
            acc += num;
        }

        System.out.println(acc);
        input.close();
    }
}