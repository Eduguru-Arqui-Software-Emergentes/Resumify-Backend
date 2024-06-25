Feature: Historial de Resúmenes
  Como usuario, quiero tener un historial de los resúmenes de videos que he solicitado para poder revisarlos en cualquier momento.

  Scenario: Visualización del historial de resúmenes
    Given que soy un usuario de la aplicación
    When accedo a la sección de historial o registros de la aplicación
    Then puedo ver una lista de todos los resúmenes de videos que he solicitado previamente

  Scenario: Acceso rápido a los resúmenes anteriores
    Given que soy un usuario de la aplicación
    When reviso mi historial de resúmenes
    And encuentro un resumen específico que deseo revisar nuevamente
    Then puedo seleccionar el resumen deseado y acceder a él rápidamente para su revisión
