package Pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;


public class HomePage {
	
	@FindBy (xpath = "/html/body/div[1]/header/div[1]/div/section/div/div[2]/div/div/div/div/nav/ul/li/a")
	List<WebElement> menus;
	@FindBy(xpath = "/html/body/div[1]/div[5]/div/div/div[1]/div/header/h1")
	WebElement verifTitre;

	
	public HomePage() {
		PageFactory.initElements(Config.driver, this);
	}
	
	public void ClickMenu(String titreMenu) throws Exception {
		try {
			
		
		Config.attente(10);
		for (WebElement menu:menus ) {
			
			if (menu.getText().contains(titreMenu)) {
				
				menu.click();
			}
		}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public void VerifHome(String titre) {
		
		String verifTextTitre=verifTitre.getText();
		Assert.assertEquals(titre, verifTextTitre);
		
	}
}
