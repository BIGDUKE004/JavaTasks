import java.util.regex.Pattern;
public class RegexTask {
    public static boolean passwordValidation(String userPassword){
        String regex = "^(?=.*\\d)(?=.*\\w)(?=.*[@#_+]).{8,16}$";
        boolean isMatch = Pattern.matches(regex, userPassword);
        return isMatch;
    }

    public static boolean emailValidation(String userEmail){
        String regex = "[a-zA-Z]*.[.].*[a-zA-z{7,10}]*.[@].*[a-zA-z{7,10}]*.[.].*[a-zA-z{7,10}]*.[.].*[a-zA-z{7,10}]";
        boolean isMatch = Pattern.matches(regex, userEmail);
        return isMatch;
    }



    public static void main(String [] args){
        System.out.println(passwordValidation("ElijahMira@004"));
        System.out.println(emailValidation("P.nwakwo@native.semicolon.africa"));

    }
}

