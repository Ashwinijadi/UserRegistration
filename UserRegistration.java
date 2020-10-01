package com.userRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Lastname");
       String name=sc.next();
       System.out.println(name);
       String pattern="^[A-Z]{1}[a-z]{2,}$" ;
       Pattern namePattern=Pattern.compile(pattern);
       Matcher m=namePattern.matcher(name);
       System.out.println("Match -"+m.matches());
}
}
