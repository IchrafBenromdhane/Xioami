package TestSuites;

import Helper.Config;
import Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeTestSuite {
	
	HomePage homepage;
	

	@Given("je suis sur la page d accueil")
	public void je_suis_sur_la_page_d_accueil() {
		
		Config.confChromeDriver();
		Config.maximWindow();
		String Url="https://mistore.com.tn/";
		Config.driver.get(Url);
	   
	}

	@When("je clique sur le menu {string}")
	public void je_clique_sur_le_menu(String menu) throws Exception {
		homepage = new HomePage();
		homepage.ClickMenu(menu);

	}

	@Then("je devrais voir le titre {string} sur la page")
	public void je_devrais_voir_le_titre_sur_la_page(String titre) {
		homepage = new HomePage();
		homepage.VerifHome(titre);
		
		}
	
	
}
