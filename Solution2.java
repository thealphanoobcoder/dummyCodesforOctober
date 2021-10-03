import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Solution2 
{
    
    
    public static String removeSpl(String inputss)   
    {  
        String str=inputss;   
        str = str.replaceAll("[^a-zA-Z0-9]","");  
        //System.out.println(str);
        return(str);
    }

    public static void main(String[] args) 
    {    
        Scanner sc=new Scanner(System.in);
        String inp="",w="",ans="";
        inp=sc.nextLine()+" ";
        //input taken;
        int fuck=0;
        for(int i=0;i<inp.length();i++)
        {
            char q=inp.charAt(i);
            int aa=(int)q;
            //akta char tullam :3
            
            if(q!=' ')
            {
                           
                w=w+q;
           
            }
            else
            {
                if(!w.contains(" "))
                {
                    if(!w.isEmpty())                     
                        ans=ans+removeSpl(w).trim()+" ";
                }
                
                w="";                
            }
        }        
        ans = ans.substring(0, 1).toUpperCase() + ans.substring(1);    
        System.out.println(ans.trim()+".");
      }
    
           
}
        
    
