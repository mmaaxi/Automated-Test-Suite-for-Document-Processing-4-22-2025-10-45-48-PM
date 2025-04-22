package steps;

import pages.tc_010Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

public class tc_010Steps {

    tc_010Page page = new tc_010Page();

    @Given("the documents are uploaded and processing is completed")
    public void the_documents_are_uploaded_and_processing_is_completed() {
        page.uploadDocuments();
        page.completeProcessing();
    }

    @When("the system generates the 'Slip de salida'")
    public void the_system_generates_the_slip_de_salida() {
        page.generateSlipDeSalida();
    }

    @Then("the original documents and extracted data should be saved in the request history")
    public void the_original_documents_and_extracted_data_should_be_saved_in_the_request_history() {
        assertTrue(page.isDataSavedInHistory());
    }
}