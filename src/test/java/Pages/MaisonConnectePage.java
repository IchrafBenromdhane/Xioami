package Pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Helper.Config;

public class MaisonConnectePage {
	
	@FindBy(xpath = "/html/body/div[1]/header/div[1]/div/section/div/div[2]/div/div/div/div/nav/ul/li/a")
	List<WebElement> menus;
	
	@FindBy(xpath = "/html/body/div[1]/header/div[1]/div/section/div/div[2]/div/div/div/div/nav/ul/li[3]/div/div/div/div/section/div/div/div/div/div/a/div/div[2]/h4")
	List<WebElement> sousmenus;
	
	@FindBy(xpath = "/html/body/div[1]/div[5]/div/div/div[1]/div/div[2]/div[4]/form/div/select")
	WebElement tri;
	
	@FindBy(xpath = "/html/body/div[1]/div[5]/div/div/div[1]/div/div[3]/div/div/div/div[2]/div[2]/h3/a")
	List<WebElement> ProductList;
	
	@FindBy(xpath = "/html/body/div[1]/div[4]/div/div/div/div/div[3]/div[1]/div/div[3]/div/h3")
	WebElement verifTitre;
	
	public MaisonConnectePage() {
		PageFactory.initElements(Config.driver, this);
	
	}
	
	public void hoverMouse(String titleMenu) {
		
		Config.attente(10);
		
		try {
			
			for(WebElement menu:menus) {
				if(menu.getText().contains(titleMenu)) {
				
					Config.actions.moveToElement(menu).perform();
					Thread.sleep(3000);
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public void ClickSousmenu(String titleSubmenu) {
		try {
				Config.attente(10);
				
			for (WebElement sousmenu : sousmenus) {
				if(sousmenu.getText().contains(titleSubmenu)) {
					
					sousmenu.click();
				}
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public void triSelectandClickProduct(String option, String ProductName) throws Exception {
		try {
			
		Thread.sleep(5000);
		
		Select select = new Select(tri);
		select.selectByVisibleText(option);
		
			
		for(WebElement product:ProductList)
		{
			if(product.getText().contains(ProductName))
			{
				
				product.click();
				break;
			}
		}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public void Verif(String Title) {
		
		String VerifierText=verifTitre.getText();
		Assert.assertEquals(Title, VerifierText);
		
	}

}
