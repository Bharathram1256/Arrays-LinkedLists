import java.util.HashMap;

public class SingularElement {

    public static int countSingularSocks(int[] arrNum) {
      
        HashMap<Integer, Integer> sockCount = new HashMap<>();

        
        for (int sockId : arrNum) {
            sockCount.put(sockId, sockCount.getOrDefault(sockId, 0) + 1);
        }

        
        int singularCount = 0;
        for (int count : sockCount.values()) {
            singularCount += count % 2;
        }

        return singularCount;
    }

    public static void main(String[] args) {
        
        int[] arrNum = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        int singularCount = countSingularSocks(arrNum);
        System.out.println("Count of singular socks = " + singularCount);
    }
}