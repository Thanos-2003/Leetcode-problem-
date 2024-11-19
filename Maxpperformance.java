public class Maxpperformance {
    public static int findS(int[] working){
        int len = 0;
       
        int n  = working.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1; j<n;j++){
                int t=0;
                int nt=0;
                for(int k =i;k<=j;k++){
                    if(working[k] > 8){
                        t++;
                    }
                    else{
                        nt++;
                    }
                }
                if(t>nt){
                    len = Math.max(len,(j-i)+1);
                }
            }
        }
        return len;
    }
    public static void main(String[] args) {
        int[] a = {9,9,6,0,9,6,6,9};
        int b = findS(a);
        System.out.print(b);
    }
}
