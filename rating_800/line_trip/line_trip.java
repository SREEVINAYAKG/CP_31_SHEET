import java.util.*;
public class line_trip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            List<Integer> ls= new ArrayList<>();
            ls.add(0);
            for (int i = 0; i < n; i++) {
                ls.add(sc.nextInt());
            }
            ls.add(x);
            int si = ls.size();
            int maxDist = Integer.MIN_VALUE;
            for(int i=1;i<si;i++){
                if(i==si-1){
                    maxDist = Math.max(maxDist, 2*Math.abs(ls.get(i)-ls.get(i-1)));
                }else{
                    maxDist  = Math.max(maxDist,Math.abs(ls.get(i)-ls.get(i-1)));
                }
            }
            System.out.println(maxDist);
        }
    }
}