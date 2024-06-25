Feature: Opción de Compartir Resumen
  Como usuario, quiero poder compartir el resumen del video con otros estudiantes o profesores a través de diferentes medios.

  Scenario: Compartir a través de aplicaciones de mensajería
    Given que soy un usuario de la aplicación y he generado un resumen del video
    When deseo compartir el resumen con otros estudiantes o profesores
    Then encuentro una opción dentro de la aplicación para compartir el resumen a través de aplicaciones de mensajería, como WhatsApp, Messenger, Telegram, etc.

  Scenario: Compartir por correo electrónico
    Given que soy un usuario de la aplicación y he generado un resumen del video
    When quiero enviar el resumen a través de correo electrónico
    Then encuentro una opción dentro de la aplicación para compartir el resumen mediante correo electrónico, donde puedo ingresar las direcciones de correo electrónico de los destinatarios y enviar el resumen como un archivo adjunto o un enlace
