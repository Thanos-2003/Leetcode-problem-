import java.util.Scanner;
public class Subsequence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] firstLine = sc.nextLine().toCharArray();
        char[] secondLine = sc.nextLine().toCharArray();
        int flag=0;
        for (int i = 0,j=0; i < firstLine.length; i++) {
            if(firstLine[i]==secondLine[j]){
                j++;
                flag++;
            }
        }
        if(flag == secondLine.length){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
