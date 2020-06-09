import java.util.List;

class User {
    String username;
    String password;
    String email;

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}

public class SILab2 {

    public boolean function (User user, List<String> allUsers) { //A
        String specialCharacters="!#$%&'()*+,-./:;<=>?@[]^_`{|}"; //A
        if (user!=null) { //A
            if (user.getUsername()!=null && user.getPassword()!=null) { //B
                String password = user.getPassword(); //C
                String passwordLower = password.toLowerCase(); //C
                if (!passwordLower.contains(user.getUsername().toLowerCase()) && password.length()>=8) { //C
                    boolean digit = false, upper = false, special = false; //D
                    for (int i=0;i<password.length();i++) { //D(i = 0) E(i < password.length) F(i++)
                        if (Character.isDigit(password.charAt(i))) //G
                            digit = true; //H
                        if (Character.isUpperCase(password.charAt(i))) //I
                            upper = true; //J
                        if (specialCharacters.contains(String.valueOf(password.charAt(i)))) //K
                            special = true; //L
                    }
                    if (digit && upper && special) //M
                        return true; //N
                }
            }
        }
        return false; //O
    }

    /*
     * every branch:
     * T1
     * username: test ; password: P@ssw0rd1
     * T2
     * user is null
     * T3
     * username OR password are null
     * T4
     * password contains username OR password's length is less than 8
     * T5
     * username either doesn't contain an uppercase character, a number or a special character
     *
     * every statement:
     * T1 and T2 from every branch cover all of the nodes
     * */
}
