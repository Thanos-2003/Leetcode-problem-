import java.util.Arrays;
import java.util.Scanner;

public class SumPairs {
    public static void main(String[] args){
        int c;
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int target = sc.nextInt();
        String[] string = str.split(",");
        int[] input= new int[string.length];
        for (int i = 0; i < string.length; i++) {
            input[i] = Integer.parseInt(string[i]);
        }
        for (int i = 0; i < input.length; i++) {
            for(int j=0; j < input.length;j++){
                if(input[i]!=input[j] && (input[i]+input[j])==target){
                    System.out.print("("+input[i]+","+input[j]+") ");
                }
            }
        }
    }
}
