Feature: Como usuario, quiero que la aplicación admita varios idiomas para poder utilizarla en mi idioma preferido.

  Scenario: Selección de idioma preferido
    Given el usuario de la aplicación.
    When accedoe a la pestaña de "Configuración" de la aplicación.
    Then encuentra una opción para "Seleccionar Idioma" preferido de una lista de idiomas admitidos.

  Scenario: Traducción completa de la aplicación
    Given el usuario de la aplicación selecciona un idioma preferido.
    When navega por todas las secciones y características de la aplicación.
    Then encuentro que todo el contenido, incluidos los menús, botones, instrucciones y mensajes de error, está completamente traducido al idioma seleccionado.