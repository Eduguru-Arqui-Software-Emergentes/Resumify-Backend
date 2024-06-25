Feature: Como usuario, quiero poder personalizar el resumen del video según mis necesidades, como resaltar ciertas partes o agregar notas adicionales.

  Scenario: Resaltar partes específicas del resumen
    Given el usuario recibe un resumen automático de un video educativo.
    When accedo a la opción de "Personalizar Resumen" y selecciono la función de "Resaltar" partes específicas.
    Then puedo seleccionar el texto que deseo resaltar en el resumen.
    And el sistema resalta las partes seleccionadas en el resumen de manera clara y visible.

  Scenario: Agregar notas adicionales al resumen
    Given el usuario recibe un resumen automático de un video educativo.
    When accedo a la opción de "Personalizar Resumen" y selecciono la función de "Agregar Notas" adicionales.
    Then puedo escribir y guardar notas relacionadas con el contenido del video en el resumen.
    And las notas adicionales se muestran junto con el resumen para que pueda acceder a ellas fácilmente cuando revise el contenido.