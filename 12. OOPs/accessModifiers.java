public class accessModifiers {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.username = "Anubhav Singh";
        // myAcc.password = "abcd";  /* ERROR becoz it's private specifier */
        myAcc.setPassword("abcdef");
        System.out.println(myAcc.setPassword());
        System.out.println(myAcc.username);
    }
}
class BankAccount {
    public String username;
    private String password;
    public void setPassword (String pwd) {
        password = pwd;
    }
}