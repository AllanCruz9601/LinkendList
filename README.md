# Estructura de Datos 2025 - Listas Enlazadas

## Descripción
Este proyecto contiene la implementación de tres ejercicios sobre listas enlazadas en Java, utilizando la clase `LinkedList`. Además, se incluyen pruebas unitarias con JUnit para verificar el correcto funcionamiento de cada método.

---

## Problemas Resueltos

### 1. Eliminar Duplicados en una `LinkedList<Integer>`
- Implementación en el método `eliminarDuplicados(LinkedList<Integer> lista)`.
- Se utiliza un `HashSet<Integer>` para rastrear los elementos únicos.
- Se recorre la lista y se eliminan los valores repetidos, manteniendo solo la primera aparición.

### 2. Invertir una `LinkedList<String>` sin usar otra lista
- Implementación en el método `invertirLista(LinkedList<String> lista)`.
- Se intercambian los elementos desde los extremos hacia el centro.
- No se usa ninguna otra lista auxiliar, solo se trabaja sobre la original.

### 3. Intercalar dos `LinkedList<Integer>` ordenadas
- Implementación en el método `intercalarListas(LinkedList<Integer> lista1, LinkedList<Integer> lista2)`.
- Se recorren ambas listas con índices y se insertan los valores en orden.
- Se devuelve una nueva lista ordenada con los elementos intercalados.

---

## Proceso de Pruebas

Las pruebas unitarias se encuentran en el paquete `umg.edu.gt.test.EjercicioLinkedList`.  
Se utiliza **JUnit 5** para verificar el correcto funcionamiento de cada método.  

### Estrategia de pruebas:
1. Se crean pruebas separadas para cada método en la clase `EjercicioLinkedListTest`.
2. Se utilizan casos de prueba con diferentes entradas para validar la lógica.
3. Se incluye al menos una prueba que falle intencionalmente para comprobar la robustez del código.

Para ejecutar las pruebas en NetBeans:
- Abrir el archivo `EjercicioLinkedListTest.java`.
- Ejecutar las pruebas con `Ctrl + F6` o desde la pestaña "Test Files".

---

## Entrega
- Se ha subido el código con las soluciones y pruebas unitarias al repositorio.
- Este README describe la implementación y el proceso de pruebas.
- El código está documentado en cada método con comentarios explicativos.
