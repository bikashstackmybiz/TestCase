import org.testng.annotations.Test;

public class TestCases {

    @Test(priority = 1 , description = "user verifies user is able to login")     // without priority methods will run alphabetically
    void login(){
        System.out.println("log in sucessfull");
    }
    @Test(priority = 2 , description = "user verifies user is able to select the item")
    void selectItem(){
        System.out.println("item selcted");
    }
    @Test(priority = 3 , description = "user verifies user is able to log out")
     void logOut(){
         System.out.println("log out sucessfull");
     }
}
