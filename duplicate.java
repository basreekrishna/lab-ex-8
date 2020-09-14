/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;
import java.util.*;

/**
 *
 * @author sksba
 */
public class duplicate 
        
{
    scanner sc=new scanner(system.in);
    string str,word=null;
    char ch;
    int count=0;
    ArrayList<string>arr=newArrayList<>();
    system.out.println("Enter string:");
    str=sc.nextLine();
    for(int i=0;i<str.length();i++)
    
    {
        ch=str.charAt(i);
        if(ch!='')
        {
            word=word+ch;
        }
    
        else
        {
                arr.add(word);
                }
    }
    for(int i=0;i<arr.size();i++)
    
    {
        for(int i=0;i<arr,size();i++)
        {
            if(arr.getClass(i).equals(arr.getClass(j)))
                count++;
        }
    }
        
    system.out.println("No of duplicate words="+count);

}



    

        
    

