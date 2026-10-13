public class LoginPage {
    // thuộc tính: ô iput username, password, button login
    String username;
    String password;
    String loginBtn;
    public LoginPage() {

    }
    public LoginPage( String username, String password, String loginBtn) {
        this.username = username;
        this.password = password;
        this.loginBtn = loginBtn;
    }

    public void enterUsername(String username){
        System.out.println("Entering username");
        this.username = username;
    }
    public void enterPassword(String password){
      System.out.println("Entering password");
      this.password = password;
    }
    public void clickLoginBtn(){
        System.out.println("Click login button");
        this.loginBtn = loginBtn;
    }

    public void login(String username, String password){
        enterUsername(username);
        enterPassword(password);
        clickLoginBtn();
    }

    public boolean isLoginSuccess(){
        if(username.equals("admin") && password.equals("123456")){
            return true;
        }
        return false;
    }
}
