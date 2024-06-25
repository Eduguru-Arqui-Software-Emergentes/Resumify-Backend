Feature: Como usuario, quiero poder descargar el resumen del video en formato PDF para poder consultarlo sin conexión o compartirlo fácilmente con otros.

  Scenario: Descarga exitosa del resumen en PDF
    Given el usuario recibe un resumen automático de un video educativo.
    When seleccione la opción de "Descargar el resumen en formato PDF".
    Then el sistema genera y descarga el archivo PDF del resumen correctamente.
    And puedo abrir el archivo PDF y verificar que contiene la información clave del video

  Scenario: Error al descargar el resumen en PDF
    Given el usuario recibe un resumen automático de un video educativo.
    When intento descargar el resumen en formato PDF, pero ocurre un error en la conexión a Internet.
    Then el sistema muestra un "mensaje de error" indicando que la descarga no se pudo completar.
    And se proporciona una opción para intentar nuevamente la descarga cuando la conexión a Internet esté estable.