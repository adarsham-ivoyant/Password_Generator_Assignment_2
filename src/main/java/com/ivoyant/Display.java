package com.ivoyant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Display {

    final Logger logger = LoggerFactory.getLogger(Display.class);
    public void gen_all(String p){
        if(p.length()>=16){
            logger.info("The password is:"+p);
            logger.info("great password");
        } else if (p.length()<16 && p.length()>=12) {
            logger.info("The password is:"+p);
            logger.info("Good password");
        }else if(p.length()<12 && p.length()>=8){
            logger.info("The password is:"+p);
            logger.info("Medium password");
        }else if(p.length()<8 && p.length()>=1){
            logger.info("Weak password");
            logger.info("password should be more than 8 character with upper case, lower case, special case and number");
        }else{

        }
    }

    public void show(String p){
        if(p.length()>=1){
            logger.info("password should be more than 8 character with upper case, lower case, special case and number");
        }else{
            logger.info("pwd cant be blank");
        }
    }

}
