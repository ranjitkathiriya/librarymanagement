package com.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JTextField;

public class Utils {

    public static boolean isemailValidator(String mailAddress) {
        Pattern pattern;
        Matcher matcher;
        final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        pattern = Pattern.compile(EMAIL_PATTERN);
        matcher = pattern.matcher(mailAddress);
        return matcher.matches();
    }

    public static boolean iscontactvalid (String contact){
        Pattern pattern;
        Matcher matcher;
        final String MobilePattern = "[0-9]{10}";
        pattern = Pattern.compile(MobilePattern);
        matcher = pattern.matcher(contact);
        return matcher.matches();
    }

    public static boolean isValidPassword(String pass) {
        if (pass != null && pass.length() <4) {
            return true;
        }
        return false;
    }

    public static boolean isValidMobileNumber(String pass) {
        if (pass != null && pass.length() == 8) {
            return true;
        }
        return false;
    }

    public static boolean isEmpty (JTextField txtfield){

        return txtfield.getText().toString().trim().length()==0;
    }
}
