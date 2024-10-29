package Pages;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helper.Config;

public class ProductPage {
	
	
	
	@FindBy(xpath = "/html/body/div[1]/div[4]/div/div/div/div/div[3]/div[1]/div/div[3]/div/form/div/button")
	static
	WebElement AjoutPanier;
	
	@FindBy(xpath = "/html/body/div[2]/div[1]")
	static
	WebElement voirPanier;
	
	@FindBy(xpath = "/html/body/div[2]/div[3]/div[2]/div[1]/div[1]/div[2]/a[2]")
	WebElement titreDansPanier;
	
	@FindBy(xpath = "/html/body/div[2]/div[3]/div[3]/div[2]/div[2]/a[3]")
	static
	WebElement continuer;
	
	public ProductPage() {
		PageFactory.initElements(Config.driver, this);
	}
	
	public static void ajoutProduit() {
		try {
			
			
			
			AjoutPanier.click();
			
			Thread.sleep(3000);
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}
	public void voirPanier() {
		try {
			
			voirPanier.click();
			
			WebDriverWait wait= new WebDriverWait(Config.driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(continuer));
			
			
			Config.actions.moveToElement(continuer).perform();
			
			Thread.sleep(2000);
			continuer.click();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	public void verifTitreProduitDansPanier(String titreAttendu) {
		try {
			
			String titreAffiche = titreDansPanier.getText();
			Assert.assertEquals("Le titre du produit dans le panier ne correspond pas", titreAttendu, titreAffiche);
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}	

}
