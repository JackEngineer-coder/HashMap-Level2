import java.util.*;
public class Main{
  public static void main(String[] args)
  {
    Scanner scn = new Scanner(System.in);
  
        String s1 = scn.next();
        String s2 = scn.next();
        
      
  
  }
  public static int solution(String s1,String s2)
  {
    String ans ="";
    HashMap<Character, Integer> map2 = new HashMap<>();
    for(int i=0; i<s1.length();i++)
      {
        char ch = s1.charAt(i);
        map2.put(ch, getOrDefault(ch,0)+1);
        
        
      }
    
      int match =0;
      int desired_match = s2.length();
      HashMap<Character, Integer> map1 = new HashMap<>();
      int i=-1;
      int j = -1;
      while(true)
        {
          boolean f1 =false;
          boolean f2 =false;
          while(i<s1.length()-1 &&  match<desired_match)
            {
              i++;
              char ch = s1.charAt(i);
              map1.put(ch,getOrDefault(ch,0)+1);
              if(map1.getOrDefault(ch,0) <= map2.getOrDefault(ch,0))
              {
                match++;
              }
              f1=truel
            }
          while(j<i && match==desired_match)
            {
              String pans = s1.substring(j+1,i+1);
              if(ans.length()==0 && pans.length()<ans.length())
              {
                ans = pans;
              }
            
          j++;
          char ch = s1.charAt(j);
          if(map1.getOrDefault(ch,0)==1)
          {
            map1.remove(ch);
          }
          else
          {
            map1.put(ch,map.get(ch)-1);
          }
          if(map1.getOrDefault(ch,0)< map2.getOrDefault(ch,0))
          {
            mct--;
          }
        }
          f2=true;
        }
    if(f1==false;f2==false)
    {
      break;
    }
    
  }
}
