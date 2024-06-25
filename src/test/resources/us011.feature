Feature: Actualizaciones y Mejoras Continuas
  Como usuario, quiero recibir actualizaciones periódicas de la aplicación para disfrutar de nuevas características y mejoras de rendimiento.

  Scenario: Notificación de nuevas actualizaciones
    Given que soy un usuario de la aplicación
    When se lanza una nueva actualización de la aplicación con nuevas características y mejoras de rendimiento
    Then recibo una notificación dentro de la aplicación informándome sobre la disponibilidad de la actualización

  Scenario: Información sobre mejoras y características nuevas
    Given que soy un usuario de la aplicación y he actualizado a la última versión
    When accedo a la lista de cambios o notas de la versión
    Then encuentro información detallada sobre las nuevas características agregadas y las mejoras de rendimiento realizadas en la actualización
