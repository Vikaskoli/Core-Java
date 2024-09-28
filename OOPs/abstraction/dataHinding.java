package OOPs.abstraction;

//Allow to hide unnecessary dat/info from the user
class   ATM{

    private String userNmae;
    private String pass;
    private String bal;

    public String getUserNmae() {
        return userNmae;
    }

    public void setUserNmae(String userNmae) {
        this.userNmae = userNmae;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getBal() {
        return bal;
    }

    public void setBal(String bal) {
        this.bal = bal;
    }
}
public class dataHinding {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.setBal("5000");
        atm.setPass("321");
        atm.setUserNmae("Vikas");
        System.out.println(atm.getBal());
    }
}
