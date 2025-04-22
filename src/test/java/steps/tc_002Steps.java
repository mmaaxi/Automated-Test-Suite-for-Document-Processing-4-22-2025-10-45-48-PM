package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_002Page;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class tc_002Steps {
    private WebDriver driver;
    private tc_002Page uploadPage;

    @Given("the user navigates to the file upload page")
    public void the_user_navigates_to_the_file_upload_page() {
        driver = // initialize your webdriver here
        uploadPage = PageFactory.initElements(driver, tc_002Page.class);
        uploadPage.open();
    }

    @When("the user selects a valid PDF/DOCX file within the 50 MB limit")
    public void the_user_selects_a_valid_file_within_the_limit() {
        uploadPage.uploadFile("path/to/valid-file.pdf");
    }

    @Then("the file should be uploaded successfully")
    public void the_file_should_be_uploaded_successfully() {
        assertTrue(uploadPage.isUploadSuccess());
    }

    @Then("the file preview should display the correct name, size, and type")
    public void the_file_preview_should_display_correct_details() {
        assertEquals("valid-file.pdf", uploadPage.getFileName());
        assertTrue(uploadPage.getFileSize() <= (50 * 1024 * 1024));
        assertEquals("application/pdf", uploadPage.getFileType());
    }
}