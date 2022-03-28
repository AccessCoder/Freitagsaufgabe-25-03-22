public class PasswordValidator {


    public static String[] forbiddenPasswordList = {"Passwort123", "Passwort123!", "FCBayernMünchen1"};

    public static boolean isValid(String password){
        return validLength(password) && checkNums(password) && checkUpperCase(password) && checkLowerCase(password);
    }

    public static boolean validLength(String password){
        return password.length() > 7;
    }

    public static boolean checkNums(String password){
        char[] chars = password.toCharArray();
        for (int i = 0; i<password.length();i++){
            if (Character.isDigit(chars[i])){
                return true;
            }
        }
        return false;
    }

    public static boolean checkUpperCase(String password){
        return !password.equals(password.toLowerCase());
    }

    public static boolean checkLowerCase(String password){
        return !password.equals(password.toUpperCase());
    }

    public static boolean isAllowed(String password){
        for (int i = 0;i< forbiddenPasswordList.length; i++){
            if (forbiddenPasswordList[i].equals(password)){
                return false;
            }
        }
        return true;
    }
}
