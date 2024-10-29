package TestSuites;

import Helper.Config;
import Helper.Utils;
import Pages.MaisonConnectePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MaisonConnecteTestSuite {
	
	
	@Given("Utilisateur est sur la page Maison Connecte")
	public void utilisateur_est_sur_la_page_maison_connecte() throws Exception {
		Config.confChromeDriver();
		Config.maximWindow();
		Config.driver.get(Utils.getproprety("BaseURL"));
		
	
	}

	@When("Utilisateur survole le menu {string} et clique sur le sousmenu {string}")
	public void utilisateur_survole_le_menu_et_clique_sur_le_sousmenu(String menu, String sousmenu) throws Exception {
		
		MaisonConnectePage maisonconnecte = new MaisonConnectePage();
		Thread.sleep(5000);
		maisonconnecte.hoverMouse(menu);
		Thread.sleep(3000);
		maisonconnecte.ClickSousmenu(sousmenu);
	
	}

	@Then("Utilisateur Selectionne {string} et clique {string}")
	public void utilisateur_selectionne_et_clique(String tri, String product) throws Exception {
		MaisonConnectePage maisonconnecte = new MaisonConnectePage();
		maisonconnecte.triSelectandClickProduct(tri, product);
	
	
	}
	
//	@Then("verifie que le titre est {string}")
//	public void verifie_que_le_titre_est(String verifT) {
//		MaisonConnectePage maisonconnecte = new MaisonConnectePage();
//		maisonconnecte.Verif(verifT);
//	
//	}

}
