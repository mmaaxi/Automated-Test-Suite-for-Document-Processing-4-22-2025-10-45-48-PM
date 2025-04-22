package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_010Page {

    WebDriver driver;

    private By documentsUploadField = By.id("documentsUpload");
    private By processButton = By.id("processButton");
    private By slipGenerationButton = By.id("generateSlipButton");
    private By historyCheck = By.id("historyCheck");

    public tc_010Page(WebDriver driver) {
        this.driver = driver;
    }

    public void uploadDocuments() {
        WebElement uploadField = driver.findElement(documentsUploadField);
        uploadField.sendKeys("path/to/documents");
    }

    public void completeProcessing() {
        WebElement processBtn = driver.findElement(processButton);
        processBtn.click();
    }

    public void generateSlipDeSalida() {
        WebElement generateSlipButton = driver.findElement(slipGenerationButton);
        generateSlipButton.click();
    }

    public boolean isDataSavedInHistory() {
        WebElement historyElement = driver.findElement(historyCheck);
        return historyElement.isDisplayed();
    }
}