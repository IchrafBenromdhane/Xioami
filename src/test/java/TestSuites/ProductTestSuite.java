package TestSuites;

import Helper.Config;
import Pages.ProductPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductTestSuite {
	
	@Given("je suis sur la page du produit {string}")
	public void je_suis_sur_la_page_du_produit(String titreProduit) {
		
		Config.confChromeDriver();
		Config.maximWindow();
		
		String url ="https://mistore.com.tn/product/redmi-pad-pro-5g-12-1-keyboard/";
		Config.driver.get(url);
		
		Config.attente(10);
	
	}

	@When("j ajoute le produit au panier")
	public void j_ajoute_le_produit_au_panier() {
		ProductPage productpage = new ProductPage();
		productpage.ajoutProduit();
		
	
	}

	@When("je visualise le panier")
	public void je_visualise_le_panier() {
		ProductPage productpage = new ProductPage();
		productpage.voirPanier();
		
	}

	@Then("je vérifie que le titre du produit dans le panier est {string}")
	public void je_vérifie_que_le_titre_du_produit_dans_le_panier_est(String titrePanier) {
		ProductPage productpage = new ProductPage();
		productpage.verifTitreProduitDansPanier(titrePanier);
		
	
	}


}
