import java.util.*;

public class TopK {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        System.out.println(map);
        int[] res = new int[k];
        List<Integer> set = new ArrayList<>(map.values());
        Collections.sort(set);
        System.out.print(set);
        for(int i=0;i<k;i++){
            int x = set.get(i);
            res[i] = map.get(x);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,3};
        int k=2;
        TopK o = new TopK();
        int[] num = new int[k];
        num = o.topKFrequent(nums, k);
        for(int i : num){
            System.out.print(i+ " ,");
        }
    }
}
