public class PasswordChecker {

    public static void checkPasswordStrength(String password) {
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        if (password.length() < 8) {
            System.out.println("Weak Password: Too short");
        }
        else {
            for (int i = 0; i < password.length(); i++) {
                char ch = password.charAt(i);

                if (Character.isDigit(ch)) {
                    hasDigit = true;
                }
                if ("!@#$%^&*()-_+=".indexOf(ch) != -1) {
                    hasSpecialChar = true;
                }
            }
            if (!hasDigit) {
                System.out.println("Weak Password: Needs a number");
            }
            else if (!hasSpecialChar) {
                System.out.println("Weak Password: Needs a special character");
            }
            else{
                System.out.println("Strong Password");
            }
        }
    }

    public static void main(String[] args) {
        String password = "P@ssw0rd!";
        checkPasswordStrength(password);
    }
}