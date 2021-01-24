package step_definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.Random;

import static modules.Hooks.driver;
import static page_objects.GooglePage.*;

public class ModificationAdresseStepDefinition {
    Random rnd = new Random();
    String n = String.valueOf(rnd.nextInt(99));
    String makeAdresse = n+ " "+ "AVENUE BON AIR";
    String adresse = makeAdresse;
    String n1 = "01" + rnd.nextInt(90000000);


    @Given("un abonné voudrait se connecter à son espace personnel")
    public void unAbonnéVoudraitSeConnecterÀSonEspacePersonnel() throws InterruptedException {
        driver.get("https://compte-canal.canal-plus.com/oauth2/authentication?displayTvByCanal=true&from=idpoauth2&idpName=myCANAL&omnitureChannel=mycanal&pass_target=https%3A%2F%2Fpass.canal-plus.com%2FIdPOAuth2%2Fauth%2Fmycanal%3Fclient_id%3D2E4A08AA4ACEF15A%26portailId%3D23%26redirect_uri%3Dhttps%253A%252F%252Fboutique.canalplus.com%252Foffres-packagees%252F%26response_type%3Dcode%26scope%3Dpass_profile%2520email%26state%3Dorigref%253Dhttps%253A%252F%252Fboutique.canalplus.com%252Foffres-packagees%252F&portailId=0&socialLinksDisabled=true&sourceURL=https%3A%2F%2Fpass.canal-plus.com%2FIdPOAuth2%2Fauth%2Fmycanal%3Fclient_id%3D2E4A08AA4ACEF15A%26portailId%3D23%26redirect_uri%3Dhttps%253A%252F%252Fboutique.canalplus.com%252Foffres-packagees%252F%26response_type%3Dcode%26scope%3Dpass_profile%2520email%26state%3Dorigref%253Dhttps%253A%252F%252Fboutique.canalplus.com%252Foffres-packagees%252F&ssoconf=auth_oauth2");
        driver.manage().window().maximize();
        Thread.sleep(2000);

    }

    @And("Il entre son email {string}")
    public void ilEntreSonEmail(String arg0) {
        email(arg0);
    }

    @And("Il entre son mot de passe {string}")
    public void ilEntreSonMotDePasse(String arg0) {
        mp(arg0);

    }

    @And("Il appuie sur le bouton")
    public void ilAppuieSurLeBouton() {
    }

    @And("Je me déplace dans paramètre du compte")
    public void jeMeDéplaceDansParamètreDuCompte() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.className("menu___pecxl")).click();
        driver.findElement(By.linkText("Espace Client")).click();
        Thread.sleep(2000);
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        driver.findElement(By.linkText("Compte")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Modifier mes coordonnées")).click();

    }

    @When("le conseiller modifie l adresse de l'abonné.")
    public void leConseillerModifieLAdresseDeLAbonné() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.name("zipCode")).sendKeys("33700");
        driver.findElement(By.id("streetName")).clear();
        driver.findElement(By.id("streetName")).sendKeys(adresse);
        driver.findElement(By.cssSelector("#fix > input")).clear();
        driver.findElement(By.cssSelector("#fix > input")).sendKeys(n1);
        driver.findElement(By.className("spinner--btn")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("button")).click();


    }

    @And("un mouvement de modification d'adresse est créé avec la nouvelle adresse client")
    public void unMouvementDeModificationDAdresseEstCrééAvecLaNouvelleAdresseClient() {
    }



    @Then("la nouvelle adresse de l’abonné est enregistrée sur l ensemble des contrats de l'abonné.")
    public void laNouvelleAdresseDeLAbonnéEstEnregistréeSurLEnsembleDesContratsDeLAbonné() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals("Compte - Espace Client CANAL+", driver.getTitle());
        System.out.println(adresse);
        System.out.println(driver.findElement(By.cssSelector("#app > div > div > main > div > div > section:nth-child(2) > div > div:nth-child(2) > div:nth-child(1)")).getText());
        Assert.assertEquals(adresse, driver.findElement(By.cssSelector("#app > div > div > main > div > div > section:nth-child(2) > div > div:nth-child(2) > div:nth-child(1)")).getText());
    }
}
