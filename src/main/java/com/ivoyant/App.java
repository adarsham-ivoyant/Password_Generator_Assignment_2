package com.ivoyant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;
import java.util.Scanner;
import java.lang.String;


public class App
{
    public int len;
    public App(int len) {
        this.len = len;
    }
    String all="";
    public String pw="";
    Random rn=new Random();

    public String generateAll(String argu1,String argu2,String argu3,String argu4){
        all=argu1+argu2+argu3+argu4;
        if(len>=4){
            int t= rn.nextInt(argu1.length());
            char randomChar = argu1.charAt(t);
            int t1= rn.nextInt(argu2.length());
            char randomChar1 = argu2.charAt(t1);
            int t2= rn.nextInt(argu3.length());
            char randomChar2 = argu3.charAt(t2);
            int t3= rn.nextInt(argu4.length());
            char randomChar3 = argu4.charAt(t3);
            pw=randomChar+randomChar1+String.valueOf(randomChar2)+randomChar3;
            len-=4;
            for(int i=0;i<len;i++) {
                int t4 = rn.nextInt(all.length());
                char randomChar5 = all.charAt(t4);
                pw += randomChar5;
            }
        }else{
            for (int i = 0; i < len; i++) {
                int t = rn.nextInt(all.length());
                char randomChar = all.charAt(t);
                pw += randomChar;
            }
        }
        return pw;

    }
    public String funcWtih3Para(String argu1,String argu2,String argu3){
        all=argu1+argu2+argu3;
        for(int i=0;i<len;i++) {
            int t4 = rn.nextInt(all.length());
            char randomChar = all.charAt(t4);
            pw += randomChar;
        }
        return pw;
    }

    public String funcWith2Para(String argu1,String argu2){
        all=argu1+argu2;
        for(int i=0;i<len;i++) {
            int t4 = rn.nextInt(all.length());
            char randomChar = all.charAt(t4);
            pw += randomChar;
        }
        return pw;
    }
    public String funcWith1Para(String argu1){
        all=argu1;
        for(int i=0;i<len;i++) {
            int t4 = rn.nextInt(all.length());
            char randomChar = all.charAt(t4);
            pw += randomChar;
        }
        return pw;
    }

    public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
        UseFullInfo u=new UseFullInfo();
        u.show();
        Display dis=new Display();

        String lower_letter="abcdefghijklmnopqrstuvwxyz";
        String upper_letter="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers="0123456789";
        String special_char="@!#$%&*_)(/><^\\[]{}";

        String password="";
        final Logger logger = LoggerFactory.getLogger(App.class);
        logger.info("Please enter the y/n for quality password");
        logger.info("do you want uppercase?");
        String upper=sc.next();

        logger.info("do you want lowercase?");
        String lower=sc.next();

        logger.info("do you want number?");
        String num=sc.next();

        logger.info("do you want Special Symbol?");
        String special=sc.next();

        logger.info("enter the length of password?");
        int len=sc.nextInt();
        App obj=new App(len);
        if(upper.equals("y") && lower.equals("y") && num.equals("y") && special.equals("y")){
            password=obj.generateAll(upper_letter,lower_letter,numbers,special_char);
            dis.gen_all(password);
        }else if(upper.equals("y") && lower.equals("y") && num.equals("y")){
            password=obj.funcWtih3Para(upper_letter,lower_letter,numbers);
            dis.show(password);
        }else if(upper.equals("y") && lower.equals("y") && special.equals("y")){
            password=obj.funcWtih3Para(upper_letter,lower_letter,special_char);
            dis.show(password);
        }else if(upper.equals("y") && num.equals("y") && special.equals("y")){
            password=obj.funcWtih3Para(upper_letter,numbers,special_char);
            dis.show(password);
        }else if(lower.equals("y") && num.equals("y") && special.equals("y")){
            password=obj.funcWtih3Para(lower_letter,numbers,special_char);;
            dis.show(password);
        }else if(upper.equals("y") && num.equals("y") ){
            password=obj.funcWith2Para(upper_letter,numbers);
            dis.show(password);
        }else if(upper.equals("y") && lower.equals("y") ){
            password=obj.funcWith2Para(upper_letter,lower_letter);
            dis.show(password);
        }else if(upper.equals("y") && special.equals("y") ){
            password=obj.funcWith2Para(upper_letter,special_char);
            dis.show(password);
        }else if(num.equals("y") && lower.equals("y") ){
            password=obj.funcWith2Para(numbers,lower_letter);
            dis.show(password);
        }else if(num.equals("y") && special.equals("y") ){
            password=obj.funcWith2Para(numbers,special_char);
            dis.show(password);
        }else if(lower.equals("y") && special.equals("y") ){
            password=obj.funcWith2Para(lower_letter,special_char);
            dis.show(password);
        }else if(upper.equals("y")){
            password=obj.funcWith1Para(upper_letter);
            dis.show(password);
        }else if(lower.equals("y")){
            password=obj.funcWith1Para(lower_letter);;
            dis.show(password);
        }else if(special.equals("y")){
            password=obj.funcWith1Para(special_char);;
            dis.show(password);
        }else if(num.equals("y")){
            password=obj.funcWith1Para(numbers);;
            dis.show(password);
        }else{
            logger.info("please choose the above options");
        }


    }
}
