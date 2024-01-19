Feature: Iniciar sesión en localhost:8081

  Scenario: Iniciar sesión con usuario y contraseña incorrectos
    Given I am on the login page
    When I enter the username "admin" and password "admin2"
    And I click the login button
    Then I should see "Credenciales inválidas. Inténtelo nuevamente." on the page

  Scenario: Iniciar sesión con usuario y contraseña correctos
    Given I am on the login page
    When I enter the username "admin" and password "admin"
    And I click the login button
    Then I should see "Crear Cita" on the page

  Scenario: Crear Cita
    Given I am on the login page
    When I enter the username "admin" and password "admin"
    And I click the login button
    And Wait "1" seconds
    And I click in button "create-button"
    And Wait "1" seconds

    And I enter value "Mascota" in field "nombreMascota"
    And I enter value "Tipo Mascota" in field "tipoMascota"
    And I enter value "10" in field "edad"
    And I enter value "1-9" in field "rutDueño"
    And I enter value "Nombre Dueño" in field "nombreDueño"
    And I enter value "Apellido Dueño" in field "apellido"
    And I enter value "direccion" in field "direccion"
    And I enter value "correo" in field "correo"
    And I enter value "965696589" in field "telefono"
    And I enter value "10:15" in field "hora"
    And I enter value "10-05-2023" in field "fecha"
    And I click in button "crear-cita"

