Feature: Soporte Multilingüe
  Como usuario, quiero que la aplicación admita varios idiomas para poder utilizarla en mi idioma preferido.

  Scenario: Selección de idioma preferido
    Given que soy un usuario de la aplicación
    When accedo a la configuración de la aplicación
    Then encuentro una opción para seleccionar mi idioma preferido de una lista de idiomas admitidos

  Scenario: Traducción completa de la aplicación
    Given que soy un usuario de la aplicación y he seleccionado un idioma preferido
    When navego por todas las secciones y características de la aplicación
    Then encuentro que todo el contenido, incluidos los menús, botones, instrucciones y mensajes de error, está completamente traducido al idioma seleccionado
