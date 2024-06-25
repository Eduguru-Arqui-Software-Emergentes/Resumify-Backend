Feature: Como usuario, quiero recibir actualizaciones periódicas de la aplicación para disfrutar de nuevas características y mejoras de rendimiento.

  Scenario: Notificación de nuevas actualizaciones
    Given el usuario de la aplicación.
    When se lanza una nueva actualización de la aplicación con nuevas características y mejoras de rendimiento.
    Then recibo una notificación dentro de la aplicación informándome sobre la disponibilidad de la actualización.

  Scenario: Información sobre mejoras y características nuevas
    Given el usuario de la aplicación actualiza a la última versión.
    When accede a la "Lista de Cambios" de la versión.
    Then encuentro información detallada sobre las nuevas características agregadas y las mejoras de rendimiento realizadas en la actualización.