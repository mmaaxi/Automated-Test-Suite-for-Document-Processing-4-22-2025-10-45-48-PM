package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class tc_002Page {
    WebDriver driver;
    
    @FindBy(id = "fileInput")
    private WebElement fileInput;

    @FindBy(id = "uploadButton")
    private WebElement uploadButton;

    @FindBy(id = "fileName")
    private WebElement fileName;

    @FindBy(id = "fileSize")
    private WebElement fileSize;

    @FindBy(id = "fileType")
    private WebElement fileType;

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void open() {
        driver.get("URL_OF_UPLOAD_PAGE");
    }

    public void uploadFile(String filePath) {
        fileInput.sendKeys(filePath);
        uploadButton.click();
    }

    public boolean isUploadSuccess() {
        // Implement logic to verify upload success
        return fileName.isDisplayed() && fileSize.isDisplayed() && fileType.isDisplayed();
    }

    public String getFileName() {
        return fileName.getText();
    }

    public long getFileSize() {
        return Long.parseLong(fileSize.getText());
    }

    public String getFileType() {
        return fileType.getText();
    }
}