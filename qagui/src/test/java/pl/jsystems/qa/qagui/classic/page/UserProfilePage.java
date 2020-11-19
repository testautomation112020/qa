package pl.jsystems.qa.qagui.classic.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class UserProfilePage extends BasePage  {


    public UserProfilePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "profile-gravatar__user-display-name")
    public WebElement userNamePanel;
//    public WebElement userNamePanel = driver.findElement(By.className("profile-gravatar__user-display-name"));

    @FindBy(css = ".button.form-button.is-primary")
    public WebElement saveButton;

    @FindBy(css = "a[href=\"/me/notifications\"] .sidebar__menu-link-text.menu-link-text")
    public WebElement notificationLabel;

//    @FindBy(css = "#secondary > ul > li > ul:nth-child(4) li")
    public List<WebElement> labels;

    public List<WebElement> getlabels() {
        labels = driver.findElements(By.cssSelector("css = \"#secondary > ul > li > ul:nth-child(4) li"));
        return labels;
    }


}
