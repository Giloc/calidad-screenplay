#Author:Trio_Calavera
#Leng:en

Feature: Aceptar o rechazar solicitud de socio
  Como administrador quiero poder gestionar solicitudes de socio para agregarlos a la plataforma o rechazarlos

  Scenario: Acpetar solicitudes para ser socio de la plataforma
    Given que estoy en la pagina inicial de la plataforma
    When entro como administrador a una solicitud pendiente
    Then puedo aceptarla

  Scenario: Rechazar solcitudes para ser socio de la plataforma
    Given que estoy en la pagina inicial de la plataforma
    When entro como administrador a una solicitud pendiente
    Then puedo rechazarla