Feature: Como estudiante, quiero poder acceder rápidamente al resumen del video para repasar su contenido antes de un examen o tarea.

  Scenario: Acceso rápido desde la página principal
    Given el usuairo que necesita repasar el contenido de un video educativo antes de un examen.
    When ingresa a la página principal de la aplicación.
    And el sistema muestra un "acceso directo al último resumen generado".
    Then puedo acceder rápidamente al resumen del video con un solo clic desde la página principal.

  Scenario: Acceso rápido desde el historial de resúmenes
    Given que soy un estudiante que ha utilizado la aplicación anteriormente.
    When accedo al historial de resúmenes de la aplicación.
    And el sistema muestra una lista de los resúmenes generados previamente.
    Then puedo seleccionar el resumen del video que deseo repasar y acceder a él de manera rápida desde el historial.