Feature: Seguridad de Datos
  Como usuario, quiero que mis datos personales y de navegación estén seguros y protegidos al utilizar la aplicación.

  Scenario: Implementación de medidas de seguridad
    Given que soy un usuario de la aplicación
    When ingreso o navego dentro de la aplicación
    Then todos mis datos personales y de navegación están protegidos mediante medidas de seguridad como la autenticación de usuario

  Scenario: Política de privacidad transparente
    Given que soy un usuario de la aplicación
    When accedo a la aplicación por primera vez
    Then se me presenta una política de privacidad clara y fácil de entender que describe cómo se recopilan, utilizan y protegen mis datos personales y de navegación mientras utilizo la aplicación
