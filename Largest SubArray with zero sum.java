import java.util.*;
public class Main
  {
    public static void main(String[] args)
    {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int [] arr = new int [n];
      for(int i=0; i<n;i++)
        {
          arr[i] = scn.nextInt();
        }
      System.out.println(solution(arr));
    }
    public static int solution(int [] arr)
    {
      HashMap<Integer,Integer> map = new HashMap<>();
      int mlen =0;
      int sum=0;
      int i=-1;
      map.put(sum,i);
      while(i<arr.length-1)
        {
          i++;
          sum +=arr[i];
          if(map.containsKey(sum)==false)
          {
            map.put(sum,i);
          
          }
          else
          {
            int len = i-map.get(sum);
            if(len>mlen)
            {
              mlen = len;
            }
          
          }
        }
        return mlen;
      
    }
   
  }
