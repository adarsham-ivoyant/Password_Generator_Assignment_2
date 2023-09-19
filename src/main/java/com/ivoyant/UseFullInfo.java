package com.ivoyant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UseFullInfo {
    final Logger logger = LoggerFactory.getLogger(UseFullInfo.class);
    public void show(){
        logger.info("password Generator and Validator");
        logger.info("UseFull Information about Password");
        logger.info("\n\nStrong Password" +
                "\nA strong password is typically considered to be a highly secure one, providing a robust defense against various forms of attacks." +
                "\nLength: It is relatively long, typically at least 12 characters or more." +
                "\nComplexity: It includes a mix of uppercase letters, lowercase letters, numbers, and special characters (e.g., !, @, #, $, %)." +
                "\nUnpredictability: It does not contain easily guessable patterns, such as common words, phrases, or sequences (e.g., \"password,\" \"123456,\" \"qwerty\")." +
                "\n\nGood Password:" +
                "\nA good password is reasonably secure but may not meet all the stringent criteria of a strong password." +
                "\nLength: It is moderately long, generally containing 12 or more characters." +
                "\n\nMedium Password" +
                "\nA Medium password is reasonably secure but may not meet all the stringent criteria of a strong password." +
                "\nLength: It is moderately long, generally containing 8 or more characters." +
                "\n\nWeak Password" +
                "\nA weak password is less secure and can be easily compromised, making it susceptible to various attacks." +
                "\nShort Length: It is too short, often containing fewer than eight characters." +
                "\nLack of Complexity: It may consist solely of lowercase letters or numbers, without special characters or uppercase letters." +
                "\nPredictability: It may be based on common words, phrases, or easily guessable patterns.");
    }
}
