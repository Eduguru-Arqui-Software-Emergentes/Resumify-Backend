Feature: Como usuario deseo poder guardar un resumen de video

  Scenario: Guardado exitoso de resumen de video
    Given el usuario "2" quiere guardar un resumen de un video
    When el usuario ingrese el <name>, <content>, <dayAdded> y <link>
    Then la aplicación guardara un nuevo resumen <name>

    Example:
      | name                     | content                              | dayAdded     | link                                          |
      | "Segunda Guerra Mundial" | "La guerra inicio en el año de 1939" | "19/06/2024" | "https://www.youtube.com/watch?v=sRi0bCjnMFs" |


