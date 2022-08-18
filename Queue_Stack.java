import java.util.*;
public class Queue_Stack {

    public static void main(String args[]) {
        Scanner scn=new Scanner(System.in);
        Queue<Integer> q=new ArrayDeque<>();
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<6;i++){
            q.add(scn.nextInt());
        }

        //print elements in queue and their sum
        int sum=0;
        System.out.println("elements in queue are: "+q);
        for(int ele:q){
            sum+=ele;
        }
        System.out.println("sum is:"+sum);

        //remove 2 elements and print them and add them to stack
        System.out.print("Removed elements are: ");
        for(int it=0;it<2;it++){
            int num=q.remove();
            s.push(num);
            System.out.print(num+" ");
        }
        System.out.println();

        //print removed elements using stack
        System.out.println("elements in stack are:"+s);

        //copy remaining elements to stack
        for(int ele:q){
            s.add(ele);
        }

        //print existing elements of queue
        System.out.println("remaining elements in queue are: "+q);
        //printing all elements from stack
        System.out.println("elements in stack are: "+s);
    }
}
