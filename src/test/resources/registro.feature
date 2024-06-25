Feature: Como usuario deseo poder registrarme en la aplicacion para poder utilizar sus beneficios

  Scenario: Registro exitoso de usuario
    Given que el usuario tiene una cuenta de <email>
    And el usuario se encuentra en la pestaña "Registrarse" de la aplicacion
    When el usuario ingrese su <userName> y <password en el formulario
    And el usuario selecione "Registrar"
    Then la aplicación le mostrará un "message"

    Example:
      | name    | userName   | email             | password | role   | message                            |
      | "Marco" | "Marco123" | "marco@gmail.com" | "123"    | "USER" | "Usuario registrado correctamente" |

  Scenario: Iniciar sesión en cuenta existente
    Given que el usuario registro en la aplicación
    And el usuario se encuentra en la pestaña "Login"
    When el usuario ingresa su <userName> y <password> en el formulario
    Then la aplicación le mostrará al usuario la pantalla principal

    Example:
      | userName   | password |
      | "Marco123" | "123"    |


