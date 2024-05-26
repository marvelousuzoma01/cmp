public class User {
    String username = "marvelous";
    String password = "Pass";
    String login() {
        if (username.equals("rokari") && password.equals("Pass")) {
            return "Logged in";
        } else {
            return "Failed";
        }
    }
    boolean checker() {
        if (1 != 1) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        User uzoma = new User();
        User marvelous = new User();
        System.out.println(uzoma.checker());
        System.out.println(marvelous.login());
    }
}
