import java.util.*;
public class Hashset {
    public static void main(String args[]) {
        Scanner scn=new Scanner(System.in);
        HashSet<Integer> set=new HashSet<>();
        int n=scn.nextInt(); //number of integers user wants to store
        for(int i=0;i<n;i++){
            int num=scn.nextInt();
            set.add(num);
        }
        Iterator<Integer> i=set.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
