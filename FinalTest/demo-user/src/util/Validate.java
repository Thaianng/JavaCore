package util;

public class Validate {
    static final String EMAIL_REGEX = "^(.+)@(\\S+)$";
    static final String PASSWORD_REGEX = "^.*(?=.{7,15})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=.,/]).*$";

    public static boolean validateEmail(String email){
        if(email.matches(EMAIL_REGEX)){
            return true;
        }else {
            return false;
        }
    }

    public static boolean validatePassword(String password){
        if(password.matches(PASSWORD_REGEX)){
            return true;
        }else {
            return false;
        }
    }
}
