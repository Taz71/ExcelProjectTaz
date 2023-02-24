package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.LoginPage;
import utl.Browserfactory;

public class LoginPageTest {

//	To call method from different Class is:
//	1.By create an object.  2.By Class Name.
//	*Non-Static variable can not be refer in Static Method.
//	*Static variable can be refered in a non-static Method.

	WebDriver driver;

	String userName = "demo@techfios.com";
	String password = "abc123";

	@Test
	public void validUserShouldBeLogin() {

		driver = Browserfactory.init();
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.inserUserName(userName);
		loginPage.insertPassword(password);
		loginPage.ClickOnSigninButton();

//		DashBoardPage dashboardpage = PageFactory.initElements(driver, DashBoardPage.class);
//		dashboardpage.validateDashboardPage();

//		BrowserFectory.tearDown();

	}
}
