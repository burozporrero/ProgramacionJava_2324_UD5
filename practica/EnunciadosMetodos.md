## De decimal a romano
Crear un programa desde dos perspectivas: Primero sin el uso de métodos y luego usando métodos.
El programa debe transformar un número introducido por teclado en notación decimal a romana. El
número será entero y positivo y no excederá de 3.000.

# MÉTODOS y ARRAYS

## Operaciones con matrices
Escribe una aplicación que realice las operaciones siguientes:
- Crea una matriz bidimensional del tamaño que el usuario indique, debe funcionar con matrices regulares o 
irregulares.
- Rellénala con valores aleatorios entre -250 y 250. Utiliza para ellos la clase Random, en lugar de Math.random().
- Muestra la matriz creada.
- Muestra el valor mayor y el menor de la matriz
- Suma cada fila de la matriz
- Ordena los valores de cada fila de la matriz
- Súmalos de nuevo
- Reordena en función del valor de la suma de fila, cada fila de la matriz, primero las filas que tengan valores de 
  suma inferiores.
- Suma todos los elementos de la matriz

Se debe tener en cuenta las funcionalidades necesarias y aislarlas en métodos independientes.

## Ejercicio A: Pasar a mayúsculas
Escribe una aplicación que dada una cadena de texto y unas consonantes, pase a mayúsculas las consonantes indicadas 
dentro de la cadena y la muestre.
Se debe solicitar al usuario la cadena de texto y las consonantes. Si en la lista de consonantes hay caracteres que 
no lo son, se le indica al usuario los caracteres que no serán tenidos en cuenta y se limpian de la cadena.
Se debe tener en cuenta:
- Identificar las funcionalidades necesarias y aislarlas en métodos independientes.
- Trabajar con Arrays.

## Ejercicio B: AÑADIR al ejercicio A

Elimina de la cadena aquellos caracteres que no son números o letras del abecedario.
Para cada palabra de la cadena, imprime la palabra e indica el número de vocales que tiene y el número de 
consonantes. Las vocales acentuadas también son vocales...
En caso de no encontrar consonantes o vocales, se muestra la palabra pero no la información. Es decir, no escribimos 
"0 vocales". Mostraremos el texto adaptado al número de elementos que haya: "1 vocal" o "2 vocales".

- Identificar las funcionalidades necesarias y aislarlas en métodos independientes.
- Trabajar con Arrays.

## Ejercicio C: AÑADIR al ejercicio B

Para la cadena dada, indica cuantas veces aparece cada letra del abecedario. No indicar aquellas que no aparecen. 
Adaptar los textos a singular y/o plural.

- Identificar las funcionalidades necesarias y aislarlas en métodos independientes.
- Trabajar con Arrays.

## Ejercicio D: AÑADIR al ejercicio C

Ordenar según el alfabeto tradicional, las letras de cada una de las palabras de la cadena dada.
Ejemplo: 
Mi casa es grande -> Im aacs es adegnr

- Identificar las funcionalidades necesarias y aislarlas en métodos independientes.
- Trabajar con Arrays.

## Detectar números

Escribe una aplicación que dado un número le indique al usuario:
- los números primos inferiores al dado,
- y que para cada número inferior a este, busque sus múltiplos; números múltiplos de 2, de 3...
La aplicación debe tener en cuenta que el número introducido por el usuario puede ser negativo o decimal, en ese 
caso, debe informar al usuario de los cambios realizados en su número para poder operar sobre él.


# RECURSIVIDAD

## Invierte cadenas

Escribe un programa que invierta una cadena usando recursión. Dada la cadena "Supercalifragilistico", el programa 
debería devolver "ocitsiligarfilacrepuS".

Escribe un programa que devuelva el número de veces que aparece una letra en una cadena. Tu programa debería recibir una cadena y la letra.
let programa = (cadena, letra) => {...}
Después, debe devolver el número de veces que la letra aparece en la cadena. Dado el texto "JavaScript" y la letra  "a", su programa debe devolver 2.‌‌‌‌
Pista: Intenta averiguar cuándo quieres que la función deje de llamarse a sí misma y cómo devolver una versión más pequeña del problema cada vez que la función se llama a sí misma.
