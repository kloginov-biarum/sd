
import lombok.extern.java.Log;
import org.junit.Test;


import static org.junit.Assert.assertTrue;


public class LoginTests extends TestBase{

    @Test
    public void logIn()  {


        User user = new User(username,password);
        ProductsPage productsPage = new ProductsPage(driver);
        new LoginPage(driver).loginValidUser(user);
        assertTrue(productsPage.inventoryListIsDisplayed());
    }

}
