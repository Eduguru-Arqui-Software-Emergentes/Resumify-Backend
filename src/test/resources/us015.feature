Feature: Estadísticas de Uso
  Como usuario, quiero poder ver estadísticas sobre mi uso de la aplicación, como la cantidad de resúmenes solicitados y el tiempo dedicado a estudiar con ellos.

  Scenario: Acceso a las estadísticas
    Given que soy un usuario de la aplicación
    When accedo a la sección de estadísticas o análisis de la aplicación
    Then encuentro una visualización clara de mis estadísticas de uso, como la cantidad de resúmenes solicitados y el tiempo dedicado a estudiar con ellos

  Scenario: Detalles de las estadísticas
    Given que soy un usuario de la aplicación y he accedido a las estadísticas
    When reviso los detalles de mis estadísticas
    Then encuentro información detallada, como la cantidad de resúmenes solicitados por día, semana o mes, y el tiempo promedio dedicado a cada resumen
