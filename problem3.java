class PasswordChecker {

    // Password is private and cannot be changed
    private final String password;

    // Constructor
    PasswordChecker(String password) {
        this.password = password;
    }

    // Returns only the strength, not the password
    String getStrength() {

        int length = password.length();

        if (length < 6) {
            return "Weak";
        } 
        else if (length <= 9) {
            return "Medium";
        } 
        else {
            return "Strong";
        }
    }
}

public class problem3 {
    public static void main(String[] args) {

        PasswordChecker pc = new PasswordChecker("abcd");
        System.out.println(pc.getStrength());

        PasswordChecker pc2 = new PasswordChecker("abcdefghij");
        System.out.println(pc2.getStrength());
    }
}

