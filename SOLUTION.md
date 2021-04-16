# Parcial-2
CONCEPTOS:
1. ¿Cuáles son las acciones los tres momentos importantes de las excepciones?
   Lanzar, Propagar y capturar.
   ¿Cuál es el objetivo de cada una? ¿Cómo se implementa en Java cada acción?.

Cuando se lanza una excepcion se esta se sale del codigo actual y se entra a ejecutar el codigo de catch y si no la consigue se sale con un mensaje de error.

CUando se propaga, se esta

Cuando se captura se esta ejecutando el codigo que produce la excepcion.
2. ¿Qué es sobre-escritura de métodos? ¿Por qué aplicarla? ¿Cómo impedir que se sobre-escriba un método?.
   
La sobreescritura de metodos sucede cuando una clase tiene un metodo con el mismo nombre y mismos parametros, esto se utiliza cuando tenemos clases abstractas, donde las clases abstractas tienen metodos y las que heredan de estas clases deben sobreescribir esos mismos metodos pero lo que hace o el procedimiento o funcion dentro de la clase puede ser distinto a las demas clases que lo invocan.

Se aplica para tener un mejor orden en el codigo, para tener un codigo limpio y controlado, de esta manera reutilizamos el codigo, es mas facil hacerle mantenimiento si lo requiere y facilita la creacion de nuevas clases apartir de las que ya existen.

Para impedir que un metodo se sobreescriba se le coloca FINAL en el metodo de la clase padre por decirlo de cierta manera.
