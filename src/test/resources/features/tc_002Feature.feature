Feature: Validate file upload with valid format and preview

  Scenario: Uploading a valid PDF/DOCX file and verifying preview
    Given the user navigates to the file upload page
    When the user selects a valid PDF/DOCX file within the 50 MB limit
    Then the file should be uploaded successfully
    And the file preview should display the correct name, size, and type