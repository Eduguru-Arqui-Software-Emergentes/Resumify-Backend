Feature: Como estudiante, quiero tener la opción de proporcionar feedback sobre la calidad del resumen del video para ayudar a mejorar el servicio.

  Scenario: Envío de feedback desde la aplicación
    Given el usuario revisa un resumen de video.
    When deseo proporcionar feedback sobre la calidad del resumen.
    Then encuentro una opción dentro de la aplicación para "enviar mi feedback".

  Scenario: Opciones de feedback
    Given el usuario da un feedback sobre el resumen del video.
    When accedo a la opción de "Enviar Feedback".
    Then se me presenta un formulario o una interfaz donde puedo proporcionar comentarios detallados sobre qué aspectos del resumen considero que podrían mejorarse y por qué.
