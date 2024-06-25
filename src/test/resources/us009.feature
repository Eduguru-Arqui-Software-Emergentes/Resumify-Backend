Feature: Feedback sobre la Calidad del Resumen
  Como estudiante, quiero tener la opción de proporcionar feedback sobre la calidad del resumen del video para ayudar a mejorar el servicio.

  Scenario: Envío de feedback desde la aplicación
    Given que soy un estudiante que ha revisado un resumen de video
    When deseo proporcionar feedback sobre la calidad del resumen
    Then encuentro una opción dentro de la aplicación para enviar mi feedback

  Scenario: Opciones de feedback
    Given que estoy proporcionando feedback sobre el resumen del video
    When accedo a la opción de enviar feedback
    Then se me presenta un formulario o una interfaz donde puedo proporcionar comentarios detallados sobre qué aspectos del resumen considero que podrían mejorarse y por qué
