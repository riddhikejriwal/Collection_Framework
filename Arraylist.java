import java.util.*;
public class Arraylist {
    public static void main(String args[]) {
        Scanner scn=new Scanner(System.in);
        ArrayList<Integer> al=new ArrayList<>();
        int n=scn.nextInt(); //number of integers user wants to store
        for(int i=0;i<n;i++){
            int num=scn.nextInt();
            al.add(num);
        }
        Iterator<Integer> i=al.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
