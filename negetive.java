import java.io.*;
import java.util.*;

public class negetive {

    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    List<Integer> list = new ArrayList<>();
    for(int i = 0; i < a; i++) {
            list.add(sc.nextInt());
        }
    int negetive = 0;
    for(int i = 0; i < list.size(); i++){
        int sum = 0;
        for(int j = i; j < list.size(); j++){
            sum += list.get(j);
            if(sum < 0){
                negetive ++;
            }
        }
    }
    System.out.println(negetive);
}
}