Feature: Como estudiante, quiero recibir una notificación cuando el resumen del video esté listo para poder revisarlo inmediatamente.

  Scenario: Notificación en tiempo real
    Given el usuario envia un <link> de video educativo a la aplicación.
    When el sistema procesa el enlace y generado el resumen automáticamente.
    Then el sistema envía una notificación inmediata a mi dispositivo indicando que el resumen está listo para ser revisado.

  Scenario: Opción de configuración de notificaciones
    Given el usuario utiliza la aplicación.
    When accedo a la pestaña de "Configuración" de la aplicación.
    And encuentra la opción para "Activar" o "Desactivar" las notificaciones.
    Then puedo activar las notificaciones para recibir alertas cuando un resumen esté listo para revisión inmediata.
