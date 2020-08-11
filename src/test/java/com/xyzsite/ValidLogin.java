package test.java.com.xyzsite;
import main.java.com.xyzsite.base.BaseUtils;

import main.java.com.xyzsite.pageobjects.LoginPage;
import org.testng.annotations.Test;

/**
 * Created by IN22913003 on 07-12-2019.
 */
public class ValidLogin extends BaseUtils{
    @Test
    public void testValidLogin()
    {
        //SoftAssert s=new SoftAssert();
        LoginPage l=new LoginPage(driver);
        l.setUserName("ayvans90@yahoo.in");
        l.setPwTextBox("thoughtworkspassword");
        l.clickLoginButton();

       /* OrderPage h=new HomePage(driver);
        h.verifyBuildNumber(s,eBuildNumber);*/

    }

    public void secondmethod(){

    }
}
