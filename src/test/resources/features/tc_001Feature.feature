Feature: Validar selección de modo de carga de documentos

  Scenario: Selección y validación de carga de documentos
    Given I am on the document upload page
    When I select the 'cargar documentos' option
    Then I should see options for "carga única" and "carga múltiple"
    When I choose 'carga en un solo archivo'
    Then a single upload box should be enabled
    When I choose 'cargar documentos por separado'
    Then multiple upload boxes should be displayed for each required document