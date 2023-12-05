# Expresiones regulares

Formación de Oracle sobre expresiones regulares: 
[Oracle](https://docs.oracle.com/javase/tutorial/essential/regex/index.html)

Otra página interesante sobre la utilización de expresiones regulares en Java: 
[javatpoint.com](https://www.javatpoint.com/java-regex)

## Clase Pattern
Se utilizan para crear un patrón de una expresión regular.

Se crea una expresión regular a partir de un String. Se compila como instancia de esta clase y el resultado se 
utilizará como objeto para comparar contra otros objetos.

[API Java 17 Class Pattern](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/regex/Pattern.html)

## Clase Matcher

Se utiliza para configurar operaciones de comparación entre la expresión regular y un string.
[API Java 17 Class Pattern](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/regex/Matcher.html)

## Comprobar expresiones
Hay muchas páginas que nos ayudan a crear y comprobar nuestra expresión regular, podéis utilizar la siguiente:
[regexr.com](https://regexr.com/)

# EJERCICIO AGENDA

Vamos a crear una agenda para el usuario.

### Requisitos
- El usuario indicará cuantas personas quiere añadir a la agenda.
- Le ofreceremos terminar cada vez que introduzca una persona completa.
- Los datos que hacen referencia a cada persona tienen que cumplir el siguiente formato, si no, no podrán ser 
  añadidos, teniendo que volver a introducir ese dato.
  previamente:

        Nombre y apellidos: 	 Apellido1 Apellido 2, Nombre (Tanto nombre como apellidos aceptan guiones)
        Correo electrónico: 	 nombre_usuario@dominio
        Dirección IP:  		 xxx.xxx.xxx.xxx (IPv4)
        Teléfono: 		 +(34) número de teléfono (sólo permitido España)

- Antes de terminar, bien sea porque el usuario ha terminado de introducir todos los contactos indicados o porque a 
  preferido finalizar antes de hora, imprimiremos la agenda por pantalla.
- Para el desarrollo, utilizaremos de la forma más óptima posible métodos y arrays.
