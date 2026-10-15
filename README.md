# pry_palindromo

**Alumno:** Angel Josue Domingo Guillen
**Grupo:** 4 C
**Matrícula:** 20251011

## Descripción

Programa en Java que determina si una palabra o frase es un **palíndromo** (se lee igual de izquierda a derecha que de derecha a izquierda) usando **recursividad** y el **patrón wrapper**.

## Estructura

```
pry_palindromo
└── src/main/java/recursividad/Recursividad.java
```

## Diseño

- **`esPalindromo(String texto)`** (wrapper, público): limpia el texto (minúsculas y sin espacios) e inicia la recursión con `i = 0` y `j = length - 1`.
- **`esPalindromoAux(String texto, int i, int j)`** (recursivo, privado):
  - Caso base de éxito: `i >= j` → `true`.
  - Caso base de fallo: `texto.charAt(i) != texto.charAt(j)` → `false`.
  - Paso recursivo: `esPalindromoAux(texto, i + 1, j - 1)`.
- **`main`**: lee la palabra con `Scanner.nextLine()` y muestra el resultado.

**Complejidad:** O(n), porque se hacen como máximo n/2 llamadas.

## Ejecución

Abrir el proyecto en NetBeans y ejecutar (F6).

```
Ingresa una palabra o frase: Anita lava la tina
Anita lava la tina SI es palindromo
```
