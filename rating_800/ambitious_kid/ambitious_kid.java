import java.util.*;
public class ambitious_kid{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mini = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            mini = Math.min(mini, Math.abs(sc.nextInt()));
        }

        System.out.println(mini);
    }
}