package com.employee.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.parking.pojo.Employee;


public class Validation {

    public static boolean isValidEmail(Employee employee) {
        String email = employee.getEmail();
        String regex =
                "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";

        Pattern pattern = Pattern.compile(regex);


        Matcher matcher = pattern.matcher(email);
        //System.out.println(matcher.matches()+" email");
        return matcher.matches();
    }

    public static boolean isValidFullName(Employee employee) {
        String name = employee.getFullName();
        String regex = "/^[a-zA-Z]+ [a-zA-Z]+$/";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(name);
        if (matcher.matches()) {
            if (name.length() < 2)
                return false;
            else
                return true;
        }
        return false;
    }

    public static boolean isValidPassword(Employee employee) {
        String password = employee.getPassword();
        String regex = "((?=.*[a-z])(?=.*\\d)(?=.*[@#$%])(?=.*[A-Z]).{8,16})";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(password);
        if (matcher.matches()) {
            if (password.length() < 8)
                return false;
            else
                return true;
        }
        return false;
    }
    
    public static boolean isMatchPassword(Employee employee){
        if(employee.getConfirmPassword().equals(employee.getPassword())){
            return true;
        }
        else
            return false;
    }

    public static boolean isValidContactNumber(Employee employee) {
        String contact = employee.getContact();
        String regex = "\\d{10}";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(contact);
        if (matcher.matches()) {
            if (contact.length()!= 10)
                return false;
            else
                return true;
        }
        return false;
    }
    
}
