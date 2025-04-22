package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.junit.Assert;

public class tc_001Page {
    WebDriver driver;

    @FindBy(id = "cargar_documentos_button")
    WebElement cargarDocumentosButton;

    @FindBy(id = "single_upload_option")
    WebElement singleUploadOption;

    @FindBy(id = "multiple_upload_option")
    WebElement multipleUploadOption;

    @FindBy(id = "single_upload_box")
    WebElement singleUploadBox;

    @FindBy(id = "multiple_upload_boxes")
    WebElement multipleUploadBoxes;

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickCargarDocumentos() {
        cargarDocumentosButton.click();
    }

    public void verifyUploadOptions(String option1, String option2) {
        Assert.assertTrue(singleUploadOption.isDisplayed());
        Assert.assertTrue(multipleUploadOption.isDisplayed());
    }

    public void selectCargaUnica() {
        singleUploadOption.click();
    }

    public void verifySingleUploadBoxIsEnabled() {
        Assert.assertTrue(singleUploadBox.isDisplayed());
    }

    public void selectCargaMultiple() {
        multipleUploadOption.click();
    }

    public void verifyMultipleUploadBoxes() {
        Assert.assertTrue(multipleUploadBoxes.isDisplayed());
    }
}