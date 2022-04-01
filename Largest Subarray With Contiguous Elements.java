import java.util.*;
public class Main{
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
    int ans =0;
    
    for(int i=0;i<arr.length-1;i++)
      {
        int max=arr[i];
        int min = arr[i];
        HashSet<Integer> check_duplicate = new HashSet<>();
        check_duplicate.add(arr[i]);
        
        for(int j=i+1; j<arr.length;j++)
          {
            if(check_duplicate.contains(arr[j]))
            {
              break;
            }
            
            check_duplicate.add(arr[j]);
            max = Math.max(max, arr[j]);
            min = Math.min(min, arr[j]);
            if(max-min == j-i)
            {
              int len = j-i+1;
              if(len>ans)
              {
                ans = len;
              }
            }
            
            }
      }
      return ans;
  }
}
