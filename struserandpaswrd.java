/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;
import java.util.Scanner;
/**
 *
 * @author sksba
 */
public class struserandpaswrd 
        
{
    public static void main(string[]args)
            
    {
        scanner sc=new scanner(system.in);
        string username.password,str="null";
        system.out.println("Enter username:");
        username=sc.next();
        system.out.println("Enter password:");
        password=sc.next();
        if(username.equals(password))
        str=username+password;
        system.out.println("username:"+username);
        system.out.println("password:"+password);
        system.out.println("concatenated string:"+str);
    }
    
}

    

