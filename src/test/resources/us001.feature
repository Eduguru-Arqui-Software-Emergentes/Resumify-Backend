Feature: Como usuario, quiero poder enviar enlaces de videos educativos de YouTube a la aplicación para obtener un resumen automático.
  Scenario: Envío exitoso del enlace de YouTube
    Given el usuario de la aplicación.
    When el usario ingresa un enlace de video educativo de YouTube en el campo <link>.
    And selecciono la opción para obtener un resumen automático.
    Then el sistema procesa el enlace correctamente y comienza a generar el resumen.

  Scenario:
    Given el usuario de la aplicación.
    When el usuario intenta enviar un enlace de YouTube, pero el formato del <link> es incorrecto.
    Then el sistema muestra un <message> de error indicando que el enlace no es válido para ser procesado.