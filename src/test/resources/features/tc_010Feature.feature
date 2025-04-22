Feature: Validate Slip Generation and Storage in History

  Scenario: Validate the generation of 'Slip de salida' and storage in request history
    Given the documents are uploaded and processing is completed
    When the system generates the 'Slip de salida'
    Then the original documents and extracted data should be saved in the request history