Feature: Como estudiante, quiero recibir un resumen automático del video enviado que condense la información clave para una comprensión rápida.

  Scenario: Generación exitosa del resumen automático
    Given que soy un estudiante que ha enviado un enlace de video educativo a la aplicación en la pestaña "Resumen".
    When la aplicación procesa el <link> y generado el <content>.
    Then la aplicación muestra el resumen, condensando la información clave del video.

  Scenario: Resumen incompleto o poco claro
    Given el usuario recibe el resumen automático de un video educativo.
    When revisa que no contiene la información clave de manera clara o incompleta.
    Then tengo la opción de proporcionar feedback sobre la calidad del resumen para que el sistema pueda mejorar en futuras generaciones.