import java.util.*;
public class Main{
  public static void main(String[] args)
  {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int [] arr = new int [n];
    for(int i =0;i<n;i++)
      {
        arr[i] = scn.nextInt();
      }
    
      System.out.println(solution(arr));
    }
  public static int solution(int [] arr)
  {
    int count =0;
    int i=-1;
    int sum=0;
    HashMap<Integer, Integer> map = new HashMap<>();
    map.put(sum,i);
    while(i<arr.length-1)
      {
        i++;
        sum += arr[i];
        if(map.containsKey(sum))
        {
          count+= map.get(sum);
          map.put(sum, map.get(sum)+1);
        }
        else
        {
          map.put(sum,1);
        }
      }
    


    return count;
  }
}
