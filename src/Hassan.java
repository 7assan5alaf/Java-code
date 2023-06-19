import package2.Lol;

import java.math.BigInteger;
import java.util.*;

public class Hassan {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
//      String s=in.next(),y="",x="";
//      int c = 1;
//      for (int i=0;i<s.length()-1;i++){
//          if (s.charAt(i)==s.charAt(i+1)){
//              c++;
//          }else {
//              if (c>1)
//              {
//                  y+=s.charAt(i)+String.valueOf(c);
//                  c=1;
//              }
//              else
//                  y+=s.charAt(i);
//              x=s.substring(i+1,s.length());
//          }
//
//      }
//      if (s.length()==1){
//          System.out.println(s);
//      }
//     else if (c==s.length()){
//         System.out.println(s.charAt(0)+""+c);
//     }else if (x.length()>1){
//         System.out.println(y+""+x.charAt(0)+""+x.length());
//     }else {
//         System.out.println(y+""+x);
//     }

//        String x=in.next(),a="";
//        int count=0;
//        StringBuilder s;
//        for (int i=0;i<x.length();i++){
//            for (int j=i+1;j<x.length();j++){
//                a=x.substring(i,j+1);
//                if (a.length()>=2){
//                    s= new StringBuilder(a);
//                    s=s.reverse();
//                    if (s.toString().compareTo(a)==0)
//                        count++;
//                }
//            }
//        }
//        System.out.println(count);


        List<Integer> out = new ArrayList<>();
        int n = in.nextInt(); //number of pepole
        int m = in.nextInt(); //number of topic
        int x = 0, max = 0, teams = 0;
        String[] topics = new String[10006];
        for (int i = 0; i < n; i++) {
            topics[i] = in.next();
        }
        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {
                x = 0;
                for (int z = 0; z < topics[0].length(); z++) {
                    if (topics[i].charAt(z) - '0' > 0 || topics[j].charAt(z) - '0' > 0) {
                        x++;
                    }
                }
                if (x == max) {
                    teams++;
                } else if (x > max) {
                    max = x;
                    teams = 1;
                }
                out.add(x);
            }

        }
//        Collections.sort(out);
        for (int i : out) System.out.println(i);

        System.out.println(max + " " + teams);
//
//      for (int i=out.size()-1;i>=0;i--){
//          if (out.get(i)==out.get(i-1)){
//              max++;
//          }else break;
//      }
//        System.out.println(out.get(out.size()-1)+"\n"+(max+1));
    }

    public static int squares(int a, int b) {
        int res=0,check1=0;
        double check2=0;
        for (int i=a;i<=b;i++){
            check1=(int)Math.sqrt(i);
            check2=Math.sqrt(i);
            if (check2-check1==0)res++;
        }
return res;
    }


static  String appendAndDelete(String s,String t,int k){
        int c=0,sizeS=s.length(),sizeT=t.length();
        for (int i=0;i<Math.min(sizeS,sizeT);i++){
            if (s.charAt(i)==t.charAt(i)){
                c++;
            }else break;
        }
       if (sizeS+sizeT-2*c>k)return "No";
       else if ((sizeS+sizeT-2*c)%2==k%2)return "Yes";
       else if (sizeS+sizeT-k<0)return "Yes";
       else return "No";
}
    public static void extraLongFactorials(int n) {
        BigInteger b=new BigInteger(String.valueOf(n));
        System.out.println(solve(b,n));
        }


  static BigInteger solve(BigInteger b,int n){
        b=new BigInteger(String.valueOf(1));
        for (int i=1;i<=n;i++){
           b=b.multiply(new BigInteger(String.valueOf(i)));
        }
        return b;
  }

    static void climbingLeaderboard(int[] scores, int[] alice) {
        int n = scores.length;
        int m = alice.length;

        int res[] = new int[m];
        int[] rank = new int[n];

        rank[0] = 1;

        for (int i = 1; i < n; i++) {
            if (scores[i] == scores[i - 1]) {
                rank[i] = rank[i - 1];
            } else {
                rank[i] = rank[i - 1] + 1;
            }
        }

        for (int i = 0; i < m; i++) {
            int aliceScore = alice[i];
            if (aliceScore > scores[0]) {
                res[i] = 1;
            } else if (aliceScore < scores[n - 1]) {
                res[i] = rank[n - 1] + 1;
            } else {
                int index = Arrays.binarySearch(scores, aliceScore);
                res[i] = rank[index];

            }
        }
        for (int i:res
             ) {
            System.out.println(i);
        }

    }

    static void setIn(int []arr){
        for (int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
    }
}
