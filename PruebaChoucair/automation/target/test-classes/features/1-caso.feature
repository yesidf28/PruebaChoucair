@Suite @Home
Feature: Caso1 - Registrar nuevo candidato y validar que se halla registrado exitosamente

  Background: Validar el acceso al sitio https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
    Given el usuario tiene acceso al sitio web

    @Login
    Scenario: 1 - Loguearse en la aplicacion
      When ingresar credenciales validas "Admin" y "admin123" luego presionar el boton Login
      Then Se visualiza la opcion Recruitment.

    @IngresarNuevoCandidato
    Scenario: 2 - Ingresar datos del nuevo candidato en la opcion Recruitment
      When Se ingresan todos los datos del candidato  FirtsName "Pedro" MiddleName "Juan" Lastname "Torres Garcia"  Email "tester@prueba.com" Contact Number "45698987" notes "ingresando candidato" y se presiona el boton save
      Then Se visualiza una ventana emergente con el mensaje succesfully Update.


#