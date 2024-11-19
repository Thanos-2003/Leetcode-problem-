public class SubsetSum {
    static void displaySubset(int subSet[], int size){
        System.out.print("(");
        for( int i=0;i<size;i++){
            System.out.print(subSet[i]+",");
        }
        System.out.print(")");
        System.out.println("");
    }
    static void subSetSum(int set[],int[] subSet, int n, int subSize, int total, int nodeCount, int sum){
        if(total == sum){
            displaySubset(subSet,subSize );
            subSetSum(set, subSet,n,subSize-1, total-set[nodeCount], nodeCount+1,sum);
        }
        else{
            for (int i = nodeCount; i <n ; i++) {
                subSet[subSize]=set[i];
                subSetSum(set, subSet,n,subSize+1, total+set[i],i+1,sum);
            }
        }
    }
    static void findSubSet(int set[], int size, int sum){
        int[] subSet = new int[size];
        subSetSum(set, subSet, size, 0,0,0,sum);
    }
    public static void main(String []args){
        int[] weights = {10,7,5,18,12,20,15};
        int sum= 35;
        findSubSet(weights, weights.length, sum);
    }
}
