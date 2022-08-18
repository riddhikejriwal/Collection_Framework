import java.util.*;
public class Stack_Queue {

    public static void main(String args[]) {
        Scanner scn=new Scanner(System.in);
        Queue<Integer> q=new ArrayDeque<>();
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<6;i++){
            s.push(scn.nextInt());
        }

        //print elements in stack and their sum
        int sum=0;
        System.out.println("elements in stack are: "+s);
        for(int ele:s){
            sum+=ele;
        }
        System.out.println("sum is:"+sum);

        //remove 2 elements and print them and add them to queue
        System.out.print("Removed elements are: ");
        for(int it=0;it<2;it++){
            int num=s.pop();
            q.add(num);
            System.out.print(num+" ");
        }
        System.out.println();

        //print removed elements using queue
        System.out.println("elements in queue are:"+q);

        //copy remaining elements to queue
        for(int ele:s){
            q.add(ele);
        }

        //print existing elements of stack
        System.out.println("remaining elements in stack are: "+s);
        //printing all elements from queue
        System.out.println("elements in queue are: "+q);
    }
}
