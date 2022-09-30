import java.io.DataInput;
import java.io.IOException;
import java.math.BigInteger;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


       String num=input.next();
        System.out.println(digitCount(num));

    }
    //https://leetcode.com/problems/check-if-number-has-equal-digit-count-and-digit-value/
    public static boolean digitCount(String num) {
        int []ans=new int[10];
         for (char a:num.toCharArray()){
             ++ans[a-'0'];
         }
         for (int i=0;i<num.length();i++){
             if (ans[i]!=num.charAt(i)-'0')return false;
         }
        return  true;

    }
    //https://leetcode.com/problems/distribute-candies-to-people/
    public static int[] distributeCandies(int candies, int num_people) {
              int []arr=new int[num_people];
            for (int i=0;candies>0;candies-=i){
                arr[i%num_people]+=Math.min(candies,++i);
            }
            return arr;
    }
    //https://leetcode.com/problems/defanging-an-ip-address/
    public static String defangIPaddr(String address) {
        String res="";
        for (char c:address.toCharArray()){
            if (c=='.')res+="[.]";
            else res+=c;
        }
        return res;
    }
    //https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/
    public static int countCharacters(String[] words, String chars) {
           Map<Character,Integer>mapW=new HashMap<>();
           Map<Character,Integer>mapC=new HashMap<>();
           int ans=0,count=0;
           for (char c:chars.toCharArray())mapC.put(c,mapC.getOrDefault(c,0)+1);
           for (String s:words){
               mapW.clear();
               for (char c:s.toCharArray()){
                   mapW.put(c,mapW.getOrDefault(c,0)+1);
               }
               for (char ch:mapW.keySet()){
                   if (mapC.containsKey(ch)){
                       if (mapC.get(ch)>=mapW.get(ch)){
                           count+=mapW.get(ch);
                       }
                   }
               }
               if (count==s.length())ans+=count;
               count=0;
           }
           return ans;
    }
    //https://leetcode.com/problems/n-th-tribonacci-number/
    public static int tribonacci(int n) {
       int []ans=new int[n+3];
       ans[0]=0;
       ans[1]=1;
       ans[2]=1;
       for (int i=3;i<=n;i++){
           ans[i]=ans[i-1]+ans[i-2]+ans[i-3];
       }
       return ans[n];
    }
    //https://leetcode.com/problems/sort-the-people/
    public static String[] sortPeople(String[] names, int[] heights) {
           String []res=new String[names.length];
             Map<Integer,String>map=new HashMap<>();
             for (int i=0;i<names.length;i++)map.put(heights[i],names[i]);
        Map<Integer, String> treeMap = new TreeMap<Integer, String>(
                new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o2.compareTo(o1);
                    }

                });
        treeMap.putAll(map);
             int index=0;
             for (int i:treeMap.keySet()){
                 res[index]=map.get(i);
                 index++;
             }
             return res;
    }
    //https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/
    public static int countGoodSubstrings(String s) {
          int res=0;
          for (int i=0;i<s.length()-2;i++){
              Set<Character>set=new HashSet<>();
              String sub=s.substring(i,i+3);
             set.add(sub.charAt(0));
             set.add(sub.charAt(1));
             set.add(sub.charAt(2));
             if (set.size()==3)res++;
          }
          return  res;

    }
    //https://leetcode.com/problems/maximum-number-of-balloons/
    public static int maxNumberOfBalloons(String text) {
        int b=0,a=0,l=0,o=0,n=0,res=0;
        for (char s:text.toCharArray()){
            if (s=='a')a++;
            if (s=='b')b++;
            if (s=='l')l++;
            if (s=='o')o++;
            if (s=='n')n++;
        }
          while (a!=0&&b!=0&&l>1&&o>1&&n!=0){
              a-=1;b-=1;l-=2;o-=2;n-=1;
              res++;
          }
          return res;
    }
    // https://leetcode.com/problems/occurrences-after-bigram/
    public static String[] findOcurrences(String text, String first, String second) {

        String []ls=text.split(" ");
        List<String>res=new ArrayList<>();
        for (int i=0;i<ls.length-2;i++){
            if (ls[i].equals(first)&& ls[i+1].equals(second)){
                res.add(ls[i+2]);
            }
        }
        String []out=new String[res.size()];
        int i=0;
        for(String x:res){
            out[i]=x;
            i++;
        }
        return out;

    }
    //https://leetcode.com/problems/largest-odd-number-in-string/
    public static String largestOddNumber(String s) {
         String res="";
         int k=-1;
         for (int i=s.length()-1;i>=0;i--){
             if (s.charAt(i)%2!=0){
                 k=i;
                 break;
             }
         }
         return k==-1?"":s.substring(0,k+1);
    }

    //https://leetcode.com/problems/sum-of-even-numbers-after-queries/
    public static int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int []ls=new int[queries.length];
        int sum=0;
        for (int i:nums){
            sum+=i;
        }
        for (int i=0;i<queries.length;i++){
            int val=queries[i][0],index=queries[i][1];
            nums[index]=val+nums[index];
            if(nums[index]%2==0)sum-=nums[index];
            if (sum%2==0)nums[i]=sum;
        }
            return ls;
    }
    //https://leetcode.com/problems/sum-of-digits-of-string-after-convert/
    public static int getLucky(String s, int k) {
         String st="";
        for (char c:s.toCharArray())st+=c-'a'+1;
        int res=0;
        while (k>0){
            res=0;
            for (int i=0;i<st.length();i++){
                res+=st.charAt(i)-'0';
            }
            st=String.valueOf(res);
            --k;
        }
        return res;
    }
 // https://leetcode.com/problems/check-if-all-characters-have-equal-number-of-occurrences/
    public static boolean areOccurrencesEqual(String s) {
    Map<Character,Integer>map=new HashMap<>();
    Set<Integer>set=new HashSet<>();
    for (char c:s.toCharArray())map.put(c,map.getOrDefault(c,0)+1);
    for (int i:map.values())set.add(i);
    return set.size()==1?true:false;

    }
   // https://leetcode.com/problems/length-of-the-longest-alphabetical-continuous-substring/
    public static int longestContinuousSubstring(String s) {
        int count=1,max=1;
        for (int i=0;i<s.length()-1;i++){
            if ((s.charAt(i+1)-'a')-(s.charAt(i)-'a')==1){
                count++;
                max=Math.max(max,count);
            }else {
                count=1;
            }
        }
         return max;
    }
    //https://leetcode.com/problems/maximum-matching-of-players-with-trainers/
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int i=0,j=0,res=0;
        Arrays.sort(players);
        Arrays.sort(trainers);
        while(i<players.length&&j<trainers.length){
            if(players[i]<=trainers[j]){
                i++;
                res++;
            }
            j++;
        }
        return res;
    }
    //https://leetcode.com/problems/maximum-ascending-subarray-sum/
    public static int maxAscendingSum(int[] nums) {
     int sum=nums[0],max=Integer.MIN_VALUE;

     for (int i=1;i<nums.length;i++){
         if (nums[i]<=nums[i-1]){
             sum=nums[i];
         }
         else {
             sum+=nums[i];
             max=Math.max(sum,max);
         }
     }
        return max;
    }
    public static String makeFancyString(String s) {
       int count=1;
       char prev=s.charAt(0);
       StringBuilder res=new StringBuilder();
        res.append(prev);
        for (int i=1;i<s.length();i++){
            if (prev==s.charAt(i))count++;
            else {
                prev=s.charAt(i);
                count=1;
            }
            if (count<3)res.append(s.charAt(i));
        }

          return res.toString();
    }
    public static int minTimeToType(String word) {
          int i=0,index=0;
          for (char c:word.toCharArray()){
              int x1=Math.abs(index-(c-97));
              int x2=26-x1;
              i+=Math.min(x1,x2);
              i++;
              index=c-97;
          }
          return i;
    }
    public static int maxLengthBetweenEqualCharacters(String s) {
        int max=Integer.MIN_VALUE;
          for (int i=0;i<s.length()-1;i++){
              for (int j=i+1;j<s.length();j++){
                  if (s.charAt(i)==s.charAt(j)){
                      String o=s.substring(i,j);
                      max=Math.max(max,o.length()-1);
                  }
              }
          }
          return max==Integer.MIN_VALUE?-1:max;
    }
    public static int maxDepth(String s) {
         int count=0,max=Integer.MIN_VALUE;
         Stack<Character>stack=new Stack<>();
         for (char c:s.toCharArray()){
             if (c=='('){
                 count++;
                 max=Math.max(count,max);
             }else if(c==')'){
                 count--;
             }
         }
         return max;
    }
    public static int specialArray(int[] nums) {
        int res=0;
         Set<Integer>set=new HashSet<>();
         for (int i:nums)set.add(i);
         for (int i:nums)if (i>=set.size())res++;
         return res;
    }
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
         List<List<Integer>>list=new ArrayList<>();
         int min=Integer.MAX_VALUE;
         Arrays.sort(arr);
         for (int i=0;i<arr.length-1;i++){
              min=Math.min(arr[i+1]-arr[i],min);
         }
         for (int i=0;i<arr.length-1;i++){
             if (arr[i+1]-arr[i]==min){
                list.add(Arrays.asList(arr[i],arr[i+1]));
             }
         }
         return list;
    }
    public static int minimumCost(int[] cost) {
          int res=0,j=1;

          Arrays.sort(cost);
          res=cost[cost.length-1];
          for (int i=cost.length-2;i>=0;i--){
              if(j%2!=0)
              res+=cost[i];
              j++;
          }
          return res;
    }
    public static int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
       for (int i=0;i<nums.length;i++){
           if (nums[i]==original){
               original=nums[i]*2;
               i=0;
           }
       }
       return original;
    }

    public static int countElements(int[] nums) {
      int count=0;
      Arrays.sort(nums);
     Map<Integer,Integer>map=new HashMap<>();
     for (int i:nums)map.put(i,map.getOrDefault(i,0)+1);
     for (int i:map.keySet()){
         if (i!=nums[0]&&i!=nums[nums.length-1])count+=map.get(i);
     }
      return count;

    }
    public static String countChar(String s){
        String res="";
        Map<Character,Integer>map=new HashMap<>();
        for (char c:s.toCharArray())map.put(c,map.getOrDefault(c,0)+1);
        for (char c:map.keySet()){
           res+=String.valueOf(map.get(c))+c;
        }
        return res;
    }
    public static int minimumSum(int num) {
         List<Integer>ls=new ArrayList<>();
         while (num!=0){
             ls.add(num%10);
             num/=10;
         }
         Collections.sort(ls);
         String y=String.valueOf(ls.get(0))+String.valueOf(ls.get(2));
         String x=String.valueOf(ls.get(1))+String.valueOf(ls.get(3));
         return Integer.parseInt(x)+Integer.parseInt(y);
    }
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>res=new ArrayList<>();
        Map<Integer,Integer>map=new HashMap<>();
        for (int i:nums)map.put(i,map.getOrDefault(i,0)+1);
        for (int i:map.keySet()){
            if (map.get(i)>=k){
               res.add(i);
            }

        }
        nums=new int[res.size()];
        for (int i=0;i<res.size();i++)nums[i]=res.get(i);
        return nums;
    }

    public static int countSubstrings(String s) {
        int res=0;
        for (int i=0;i<s.length();i++){
            for (int j=i;j<s.length();j++){
                if (palin(s,i,j))res++;
            }
        }
        return res;
    }

    private static boolean palin(String s, int i, int j) {
        if (i>j)return true;
        if (s.charAt(i)!=s.charAt(j))return false;
        return palin(s,i+1,j-1);
    }

    public static boolean checkDistances(String s, int[] distance) {
        Map<Character,Integer>map=new HashMap<>();
        for (int i=0;i<s.length()-1;i++){
            for (int j=i+1;j<s.length();j++){
                if (s.charAt(i)==s.charAt(j))map.put(s.charAt(i),Math.abs(i-j)-1);
            }
        }
        Map<Character,Integer>map1=new HashMap<>();
        char a='a';
        for (int i=0;i<26;i++){
            map1.put(a,distance[i]);
            a++;
        }
        for (char c:map.keySet()){
            if (map1.containsKey(c)){
                if (map.get(c)!=map1.get(c))return false;
            }
        }

        return true;
    }
    public static String reverseVowels(String s) {
     int i=0,size=s.length()-1;
     char temp=' ';
     char []arr=s.toCharArray();
     while (i<size){
         if (!isVowel(s.charAt(i)))i++;
         else if (!isVowel(s.charAt(size)))size--;
         else {
             temp=arr[i];
             arr[i]=arr[size];
             arr[size]=temp;
             i++;
             size--;
         }
     }
     String ans=new String(arr);
     return ans;

    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer>list=new HashSet<>();
        Map<Integer,Integer>map=new HashMap<>();
        for (int i=0;i<nums1.length;i++){
            map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
        }
        for (int i=0;i<nums2.length;i++){
            if (map.containsKey(nums2[i])){
                list.add(nums2[i]);
            }
        }

        nums1=new int[list.size()];
        int i=0;
        for (int num:list){
           nums1[i]=num;
           i++;
        }
        return nums1;
    }
    public static int longestPalindrome(String s) {
       Map<Character,Integer>map=new HashMap<>();
       int res=0;
       for (char c:s.toCharArray()){
           map.put(c,map.getOrDefault(c,0)+1);
       }
       for (char ch:map.keySet()){
           if (map.get(ch)%2==0)res+=map.get(ch);
          if(map.get(ch)%2!=0){
              res+=map.get(ch)-1;
           }
       }

       return res==s.length()?res:res+1;

    }
    public static int balancedStringSplit(String s) {
        int c=0,ans=0;
        for(char ch:s.toCharArray()){
            if (ch=='L')c--;
            else c++;
            if (c==0)ans++;
        }
        return ans;

    }
    public static boolean exist(char[][] board, String word) {
        Map<Character,Integer>map=new HashMap<>();
        for (int i=0;i<board.length;i++){
            for (int j=0;j<board[i].length;j++){
               map.put(board[i][j],map.getOrDefault(board[i][j],0)+1);
            }
        }

        for (char c:word.toCharArray()){

            if (map.containsKey(c)){
                map.put(c,map.get(c)-1);
            }
            if (!map.containsKey(c))return false;

            if (map.get(c)<0)return false;
        }


        return true;
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>>ans=new ArrayList<>();
        Map<String,List<String>>map=new HashMap<>();
        for (String s:strs){
            char []ch=s.toCharArray();
            Arrays.sort(ch);
            String ss=new String(ch);
            if (!map.containsKey(ss)){
                map.put(ss,new ArrayList<>());
            }
            map.get(ss).add(s);
        }
          ans.addAll(map.values());
        return ans;
    }
    public int[] answerQueries(int[] nums, int[] queries) {
        int[] res = new int[queries.length];
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++)
            nums[i] += nums[i - 1];
           for (int j=0;j<queries.length;j++){
               int k=Arrays.binarySearch(nums,queries[j]);
               res[j]=Math.abs(k+1);
           }
        return res;
    }

    public static List<Integer> findTowNum(List<Integer>ls,int target){
        List<Integer>res=new ArrayList<>();

        Collections.sort(ls);
        int start=0,end=ls.size()-1;
        while (start<end){
            if (ls.get(start)+ls.get(end)==target){
                res.add(ls.get(start));
                res.add(ls.get(end));
                break;
            }else if(ls.get(start)+ls.get(end)>target){
                end--;
            }else if (ls.get(start)+ls.get(end)<target){
                start++;
            }
        }
        return res;
    }
    public static String intToRoman(int num) {
        String out="";
           List<String>ls=new ArrayList<>(Arrays.asList("M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"));
           List<Integer>ls1=new ArrayList<>(Arrays.asList(1000,900,500,400,100,90,50,40,10,9,5,4,1));
           int i=0;
           while (num>0){
               while (num>=ls1.get(i)){
                   out+=ls.get(i);
                   num-=ls1.get(i);
               }
               i++;
           }
           return out;
    }
    public static int smallestEqual(int[] nums) {
        int min=Integer.MAX_VALUE;
        for (int i=0;i<nums.length;i++){
            if (i==nums[i]){
                min=Math.min(min,i);
            }
        }
        return min==Integer.MAX_VALUE?-1:min;
    }
    public static boolean isSameAfterReversals(int num) {
        if (num==0)return true;
        int i=String.valueOf(num).length(),j=String.valueOf(convert(num)).length();
        return i==j;
    }
    public static int convert(int n){
        String ans="";
        while (n!=0){
            ans+=String.valueOf(n%10);
            n/=10;
        }
        return Integer.parseInt(ans);
    }

    public static  boolean isPalindrome(String s) {
        String ans="";
        for(char c:s.toLowerCase().toCharArray()){
            if (Character.isDigit(c)||Character.isLetter(c))
              ans+=c;
        }
        StringBuilder sb=new StringBuilder(ans);
        if (sb.reverse().toString().equals(ans)||ans.isEmpty())return true;
        return false;

    }
    public static int minMovesToSeat(int[] seats, int[] students) {
         Arrays.sort(seats);
         Arrays.sort(students);
         int ans=0;
         for (int i=0;i<seats.length;i++){
             ans+=Math.abs(seats[i]-students[i]);
         }
         return ans;

    }
    public static boolean isSorted(List <Integer>list){
        List<Integer>ls=new ArrayList<>();
        for (int i:list)ls.add(i);
        Collections.sort(list);
        if (Objects.equals(ls,list))return true;
        else return false;
    }
//    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
//       Set<Integer>ans=new HashSet<>();
//       Set<Integer>st1=new HashSet<>();
//       Set<Integer>st2=new HashSet<>();
//       for (int i:nums1)st1.add(i);
//       for (int i:nums2)st2.add(i);
//       for (int i:nums3){
//           if (st1.contains(i)||st2.contains(i))ans.add(i);
//       }
//
//        for (int i:nums2){
//            if (st1.contains(i))ans.add(i);
//        }
//
//       return ans.stream().toList();
//    }
    public static int findGCD(int[] nums) {
          int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
          for (int i:nums){
              min=Math.min(min,i);
              max=Math.max(max,i);
          }
          return GDC(min,max);
    }
    public  static int GDC(int num1,int num2){
        int gdc=0;
        for (int i=1;i<=num1&&i<=num2;i++){
            if (num1%i==0&&num2%i==0)
                gdc=i;
        }
        return gdc;
    }
    public static char findTheDifference(String s, String t) {
            Map<Character,Integer>map=new HashMap<>();
            for (char c:t.toCharArray()){
                map.put(c,map.getOrDefault(c,0)+1);
            }
            for (char x:s.toCharArray()){
                if (map.containsKey(x)){
                  map.put(x,map.get(x)-1);
                }
            }
            for (char ch:map.keySet()){
                if (map.get(ch)==1)return ch;
            }
           return 'H';
    }
    public static int xorOperation(int n, int start) {
     List<Integer>ls=new ArrayList<>();

     for (int i=0;i<n;i++){
         ls.add(i,start+(2*i));
     }
        int ans=ls.get(0);
     for (int i=1;i<ls.size();i++){
         ans=ls.get(i)^ans;
     }
     return ans;

    }
    public static boolean isIsomorphic(String s, String t) {
       if (s.length()!=t.length())return false;
        Map<Character,Character>map=new HashMap<>();
        for (int i=0;i<s.length();i++){
            if (!map.containsKey(s.charAt(i))){
                if(map.containsValue(t.charAt(i)))return false;
                map.put(s.charAt(i),t.charAt(i));
            }else {
                if (t.charAt(i)!=map.get(s.charAt(i)))return false;
            }

        }
       return true;
    }
    public static int countPrimeSetBits(int left, int right) {
            int ans=0;
            for (int i=left;i<=right;i++){
                if (isPrime(countOfOnes(i)))ans++;
            }
            return ans;
    }
    public static  int countOfOnes(int n){
        int res=0;
        while (n!=0){
            if ((n&1)==1)res++;

            n>>>=1;
            if (n==0)break;
        }
        return res;
    }
    public  static  boolean isPrime(int n){
        if (n==1)return false;
        for (int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0)return false;
        }
        return true;
    }
    public static String addBinary(String a, String b) {
         StringBuilder s=new StringBuilder();
         int lenA=a.length()-1,lenB=b.length()-1;
         int sum=0;
         while (lenA>=0||lenB>=0){
             if (lenA>=0)sum+=a.charAt(lenA)-'0';
             if (lenB>=0)sum+=b.charAt(lenB)-'0';
             s.append(sum%2);
             sum/=2;
             lenB--;
             lenA--;
         }
         if (sum!=0)s.append(sum);
        return s.reverse().toString();

    }
    public static int countVowelSubstrings(String word) {
         int out=0;
         for (int i=0;i<word.length();i++){
             Set<Character>st=new HashSet<>();
             for (int j=i;j<word.length();j++){
                 if (!isVowel(word.charAt(j)))break;
                 st.add(word.charAt(j));
                 if (st.size()==5)out++;
             }
         }
        return out;
    }
    public static boolean isVowel(char c){
        return c=='a'||c=='i'||c=='o'||c=='u'||c=='e'||c=='U'||c=='I'||c=='A'||c=='O'||c=='E';
    }
    public static int firstUniqChar(String s) {
              Map<Character,Integer>map=new HashMap<>();
              for (char c:s.toCharArray()){
                  map.put(c,map.getOrDefault(c,0)+1);
              }
              for (char c:map.keySet()){
                  if(map.get(c)==1){
                    return s.indexOf(c);
                  }
              }
            return -1;

    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>list=new ArrayList<>();
        if (numRows<=0)return list;

        for (int i=0;i<numRows;i++){
            List<Integer>ls=new ArrayList<>();
            for (int j=0;j<i+1;j++){
                if (j==0||j==i){
                    ls.add(1);
                }else {
                    ls.add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
                }
            }
            list.add(ls);
        }
        return list;
    }
    public int[][] matrixReshape(int[][] mat, int r, int c) {
       int [][]res=new int[r][c];
       if (mat[0].length*mat.length!=r*c)return mat;
       int x=0,y=0;
       for (int i=0;i<r;i++){
           for (int j=0;j<c;j++){
               if (y==mat[0].length){
                   x++;
                   y=0;
               }
               res[i][j]=mat[x][y];
               y++;
           }
       }
       return res;
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer>list=new ArrayList<>();
        Map<Integer,Integer>map=new HashMap<>();
        for (int i=0;i<nums1.length;i++){
            map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
        }
        for (int i=0;i<nums2.length;i++){
           if (map.containsKey(nums2[i])){
               if (map.get(nums2[i])!=0){
                   list.add(nums2[i]);
                   map.put(nums2[i],map.get(nums2[i])-1);
               }
           }
        }
        System.out.println(list);
        nums1=new int[list.size()];
        for (int i=0;i<list.size();i++){
            nums1[i]=list.get(i);
        }
        return nums1;
    }
    public static String firstPalindrome(String[] words) {
        StringBuilder s;
        for (String x:words){
            s=new StringBuilder(x);
            if (x.equals(s.reverse().toString())){
                return x;
            }
        }
        return "";
    }
    public static int countWords(String[] words1, String[] words2) {
       int out=0;
       Map<String,Integer>map=new HashMap<>();
       for (String x:words1){
           map.put(x,map.getOrDefault(x,0)+1);
       }
       for (String s:words2){
           if (map.get(s)!=null&&map.get(s)==1){
               map.put(s,0);
               out++;
           }else if (map.get(s)!=null&&map.get(s)==0){
               out--;
               map.remove(s);
           }
       }

        return out;
    }
    public static int timeRequiredToBuy(int[] tickets, int k) {
        int res=0;
        for(int i=0;;i++){
            if(i==tickets.length)i=0;
            if(tickets[k]==0)return res;
            if(tickets[i]==0)continue;
            else{
                --tickets[i];
                res++;
            }


        }
    }

    public static int findClosestNumber(int[] nums) {
         int out=0;
         List<Integer>p=new ArrayList<>();
         List<Integer>n=new ArrayList<>();
         Arrays.sort(nums);
         for (int c:nums){
             if (c>0)p.add(c);
             else n.add(c);
         }
         if (!n.isEmpty()&&!p.isEmpty()){
             if (p.get(0)-0>0-n.get(n.size()-1)){
                 out=n.get(n.size()-1);
             }else out=p.get(0);
         }else if(n.isEmpty()&&!p.isEmpty()){
             out=p.get(0);
         }else out=n.get(n.size()-1);
         return out;
    }
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> list=new ArrayList<>();

       Set<Integer>set1=new HashSet<>();
       for (int c:nums1){
           set1.add(c);
       }
       Set<Integer>set2=new HashSet<>();
       for (int c:nums2){
           set2.add(c);
       }
       List<Integer>l1=new ArrayList<>();
       for (int c:set1){
           if (!set2.contains(c))l1.add(c);
       }
       List<Integer>l2=new ArrayList<>();
       for (int c:set2){
           if (!set1.contains(c))l2.add(c);
       }
       list.add(l1);
       list.add(l2);

        return list;

    }


    public static int countHillValley(int[] nums) {
        int out=0;
        int last=nums[0];
        for (int i=1;i<nums.length-1;i++){
           if (nums[i]>last&&nums[i]>nums[i+1]||nums[i]<last&&nums[i]<nums[i+1]){
               out++;
               last=nums[i];
           }
        }

        return out;
    }
    public static List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer>list=new ArrayList<>();
        int x=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==key){
                for (int j=x;j<nums.length;j++){
                    if (Math.abs(i-j)<=k){
                        list.add(j);
                        x=j+1;
                    }
                }

            }
        }
        return list;
    }

    public static int countEven(int num) {
            int out=0;
             for (int i=1;i<=num;i++){
                 if (sumDigit(i)==true)out++;
             }
             return out;

    }
          public static boolean sumDigit(int n){
        int sum=0;
            while (n!=0){
                sum+=n%10;
                n/=10;
            }
            return sum%2==0?true:false;

          }
    public static int countPairs(int[] nums, int k) {
        int out=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    System.out.println(i+" * "+j+" = "+(i*j));
                    if((i*j)%2==0){
                        out++;
                    }
                }
            }
        }
        return out;
    }
    public static int countOperations(int num1, int num2) {
        int out=0;
        while (true) {
            if (num1 == 0 || num2 == 0) return out;
            if (num1 >= num2) {
                num1 -= num2;
                out++;
            }
            else if (num2 < num1) {
                num2 -= num1;
                out++;
            }
        }

    }

    public static int[] sortEvenOdd(int[] nums) {
        List<Integer>even=new ArrayList<>();
        List<Integer>odd=new ArrayList<>();
        for (int i=nums.length-1;i>=0;i--){
            if (i%2==0)even.add(nums[i]);
            else odd.add(nums[i]);
        }
        Collections.sort(even);
        Collections.sort(odd);
        int c=0,x=odd.size()-1;
        for (int i=0;i<nums.length;i++){
          if (i%2==0){
              nums[i]=even.get(c);
              c++;
          }
          if (i%2!=0){
              nums[i]=odd.get(x);
              x--;
          }
        }

         return nums;

    }
    public static int countAsterisks(String s) {
        int out=0,o=0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='|'&&o==0){
                o=1;
            }else if (s.charAt(i)=='*'&&o==0){
                out++;
            }else if (s.charAt(i)=='|'&&o==1){
                o=0;
            }
        }
        return out;

    }
    public static int fillCups(int[] amount) {
        int out=0;
         for (int i=0;;i++){
             Arrays.sort(amount);
             if (amount[2]==0)break;
             --amount[1];
             --amount[2];
             ++out;

         }
         return out;
    }
    public static boolean checkXMatrix(int[][] grid) {
        for (int i=0;i<grid.length;i++){
            for (int j=0;j<grid.length;j++){
                if (i==j||i+j==grid.length-1){
                    if (grid[i][j]==0)return false;
                }
               else if (grid[i][j]!=0)return false;
            }
        }
        return true;
    }
    public static boolean strongPasswordCheckerII(String password) {
        boolean cs=false,cC=false,cd=false,cp=false;
        if (password.length() >= 8) return false;
        for (int i = 0; i < password.length()-1; i++) {
            if (password.charAt(i) == password.charAt(i + 1)) return false;
        }
        for (int i=0;i<password.length();i++){
            if (password.charAt(i)>='a'&&password.charAt(i)<='z')cs=true;
            if (password.charAt(i)>='A'&&password.charAt(i)<='Z')cC=true;
            if (password.charAt(i)>='1'&&password.charAt(i)<='9')cd=true;
            if (password.charAt(i)=='!'||password.charAt(i)=='@'||password.charAt(i)=='#'
                    ||password.charAt(i)=='$'||password.charAt(i)=='%'||password.charAt(i)=='^'
                    ||password.charAt(i)=='&'||password.charAt(i)=='*'||password.charAt(i)=='('
                    ||password.charAt(i)==')'||password.charAt(i)=='-'||password.charAt(i)=='+'
            ){
                cp=true;
            }


        }
        return cp&&cC&&cd&&cs;
    }
    public static int rearrangeCharacters(String s, String target) {
        int res=s.length();
        char []arr1=new char[26];
        char []arr2=new char[26];
        for (char x:s.toCharArray()){
            ++arr1[x-'a'];
        }
        for (char x:target.toCharArray()){
            ++arr2[x-'a'];
        }
        for (char t:target.toCharArray()){
            res=Math.min(res,arr1[t-'a']/arr2[t-'a']);
        }

     return res;
    }


    public static List<String> removeAnagrams(String[] words) {
      List<String>list=new ArrayList<>();
      String out="";
       for (String s:words){
        char []ch=s.toCharArray();
        Arrays.sort(ch);
        String res=new String(ch);
        if (out.equals(res))continue;
        else list.add(s);
        out=res;
       }

      return list;

    }
    public static int percentageLetter(String s, char letter) {
       Map<Character,Integer>map=new HashMap<>();
       for (int i=0;i<s.length();i++){
           if (map.containsKey(s.charAt(i))){
               int n=map.get(s.charAt(i))+1;
               map.put(s.charAt(i),n);
           }else {
               map.put(s.charAt(i),1);
           }
       }
        try {
            return map.get(letter)*100/s.length();
        }catch (NullPointerException e){
            return 0;
        }


    }
    public static int countPrefixes(String[] words, String s) {
       int out=0;
       for (int i=0;i<words.length;i++){
           if (s.startsWith(words[i]))out++;
       }

      return out;
    }

    public static int arithmeticTriplets(int[] nums, int diff) {
        int out=0;
         for (int i=0;i<nums.length;i++){
             for (int j=i;j<nums.length;j++){
                 for (int k=j;k<nums.length;k++){
                     if (nums[j]-nums[i]==diff&&nums[k]-nums[j]==diff)out++;
                 }
             }
         }

        return out;

    }

    public static List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {

        List<List<Integer>>list=new ArrayList<>();
        Map<Integer,Integer>map=new HashMap<>();
        for (int i=0;i<items1.length;i++){
            if (map.containsKey(items1[i][0])){
                map.put(items1[i][0],map.get(items1[i][0])+items1[i][1]);
            }else {
                map.put(items1[i][0],items1[i][1]);
            }
        }
        for (int i=0;i<items2.length;i++){
            if (map.containsKey(items2[i][0])){
                map.put(items2[i][0],map.get(items2[i][0])+items2[i][1]);
            }else {
                map.put(items2[i][0],items2[i][1]);
            }
        }
        for (int c:map.keySet()){
            List<Integer>out=new ArrayList<>();
            out.add(c);
            out.add(map.get(c));
            list.add(out);
        }
        return list;
    }

    public static List<Integer> intersection(int[][] nums) {
      Map<Integer,Integer>map=new HashMap<>();
      List<Integer>list=new ArrayList<>();
      for (int i=0;i<nums.length;i++){
          for (int j=0;j<nums.length;j++){
              if (map.containsKey(nums[i][j])){
                  int n=map.get(nums[i][j])+1;
                  map.put(nums[i][j],n);
              }else {
                  map.put(nums[i][j],1);
              }
          }
      }
      for (int c:map.keySet()){
          if (map.get(c)==nums.length){
              list.add(c);
          }

      }
        return list;
    }

    public static int divisorSubstrings(int num, int k){
        String s=String.valueOf(num);
        int c=0;
        for (int i=0;i<s.length();i++){
            String g=s.substring(i,Math.min(i+k,s.length()));
            if (g.length()==k) {
                try {
                    if (num%Integer.parseInt(g)==0)c++;
                }catch (ArithmeticException e){
                    continue;
                }

            }
        }
        return c;
    }

    public static String digitSum(String s,int k){
       if (s.length()<=k)return s;
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<s.length();i+=k){
            String g=s.substring(i,Math.min(i+k,s.length()));
             sb.append(sum(g));
        }
        s=sb.toString();
        return digitSum(s,k);
    }

    public static  int sum(String x){
        int sum=0;
        for (char c:x.toCharArray()){
            sum+=Integer.parseInt(String.valueOf(c));
        }
        return sum;
    }


    public static  boolean isTrue(List<Integer> arr,List<Integer>arr1){
       for (int i=0;i<arr.size();i++){
           if (arr.get(i)!=arr1.get(i))return false;
       }
       return true;

    }

    public static String solvee(String s){
        String out=s;
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(c)=='A'){
                out=s.substring(c+1);
                c++;
            }else break;
        }

        return out;
    }
    public  static boolean power(int n){
        if (n==1)return true;
        if (n%4!=0)return false;
        return power(n/=4);
    }
    public static int  []  removeOccernce(int []arr,int value){
        int k=0;
        for (int i=0;i<arr.length;i++){
            if (arr[k]!=value){
                k++;
            }else {
                arr[k]=arr[i];
            }

        }
        return  arr;
    }
    public static  String reverse(String x){
        String out="";
        for (int j=x.length()-1;j>=0;j--){
            out+=x.charAt(j);
        }
        return out;
    }
     public  static boolean isSequence(String s,String t){
         int k=0;
         for (int i=0;i<t.length();i++){
             if (s.charAt(k)==t.charAt(i)){
                 k++;
             }
         }
         if(k==s.length()||s.length()==0)
         return true;
         else return false;
     }
    public static Map<Character,Integer> counter (Map<Character,Integer>map,String x){
        for (int i=0;i<x.length();i++){
            if(map.containsKey(x.charAt(i))){
                int n=map.get(x.charAt(i))+1;
                map.put(x.charAt(i),n);
            }else {
                map.put(x.charAt(i),1);

            }
        }
        return map;
      
    }
    public static  void setInput(int arr[]){
        for (int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
    }
    public static int binarySearch(int target,int []arr){
        int low=0,high=arr.length-1,mid=0;
        while (low<=high){
            mid=low+((high-low)/2);
            if (arr[mid]<target){
                low=mid+1;
            }
            if (arr[mid]>target){
                high=mid-1;
            }
            if (arr[mid]==target){
                return mid;
            }
        }
        return -1;
    }

    public static int interpolationSearch(int []arr,int target){
        int low=0,high=arr.length-1,mid=0;
        int x=0;
        while (low<=high){
            mid=low+(high-low)/(arr[high]-arr[low])*(target-arr[low]);
            if (arr[mid]<target){
                low=mid+1;
            }
            if (arr[mid]>target){
                high=mid-1;
            }
            if (arr[mid]==target){
                return mid;
            }
            x++;
        }
        System.out.println(x);
        return -1;
    }

}
//    class Person {
//        String name;
//        int age;
//        Gander gander;
//
//        public Person(String name, int age, Gander gander) {
//            this.name = name;
//            this.age = age;
//            this.gander = gander;
//        }
//
//        @Override
//        public String toString() {
//            return "Person{" +
//                    "name='" + name + '\'' +
//                    ", age=" + age +
//                    ", gander=" + gander +
//                    '}';
//        }
//
//        enum Gander {
//            FEMALE, MALE
//        }
//    }
//
//    class Book {
//        Book() {
//            int x = 10;
//            int z = 15;
//            System.out.println(z + x);
//        }
//
//        public void test(int x) {
//            x = 5;
//            System.out.println(5 + x);
//        }
//    }
//}