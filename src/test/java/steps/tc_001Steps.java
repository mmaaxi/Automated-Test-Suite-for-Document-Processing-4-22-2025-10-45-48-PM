package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.tc_001Page;

public class tc_001Steps {
    WebDriver driver;
    tc_001Page page;

    @Given("I am on the document upload page")
    public void i_am_on_the_document_upload_page() {
        driver = // Initialize the WebDriver
        page = new tc_001Page(driver);
        driver.get("URL of document upload page");
    }

    @When("I select the 'cargar documentos' option")
    public void i_select_the_cargar_documentos_option() {
        page.clickCargarDocumentos();
    }

    @Then("I should see options for {string} and {string}")
    public void i_should_see_options_for_carga_unica_and_carga_multiple(String option1, String option2) {
        page.verifyUploadOptions(option1, option2);
    }

    @When("I choose 'carga en un solo archivo'")
    public void i_choose_carga_en_un_solo_archivo() {
        page.selectCargaUnica();
    }

    @Then("a single upload box should be enabled")
    public void a_single_upload_box_should_be_enabled() {
        page.verifySingleUploadBoxIsEnabled();
    }

    @When("I choose 'cargar documentos por separado'")
    public void i_choose_cargar_documentos_por_separado() {
        page.selectCargaMultiple();
    }

    @Then("multiple upload boxes should be displayed for each required document")
    public void multiple_upload_boxes_should_be_displayed() {
        page.verifyMultipleUploadBoxes();
    }
}