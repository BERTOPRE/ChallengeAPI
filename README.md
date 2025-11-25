# Conversor de Monedas en Java

Este proyecto es un **conversor de monedas** desarrollado en Java que permite convertir entre varias monedas utilizando la **API de ExchangeRate** para obtener tasas de cambio en tiempo real. Incluye un menú interactivo en consola y validación de entradas.
Creado para el challenge de ALURA.

---

## Tecnologías

- Java 24
- IntelliJ IDEA
- API de ExchangeRate (https://www.exchangerate-api.com/)
- Gson para parsear JSON

---

##  Funcionalidades

El programa permite convertir entre las siguientes monedas:

1. Dólar (USD) a Quetzales (GTQ)
2. Quetzales (GTQ) a Dólar (USD)
3. Pesos Mexicanos (MXN) a Quetzales (GTQ)
4. Quetzales (GTQ) a Pesos Mexicanos (MXN)
5. Pesos Colombianos (COP) a Pesos Argentinos (ARS)

Opción adicional:

- Salir del programa

---

## Cómo usar


1. Clona el proyecto o descárgalo en tu máquina.
2. Abre el proyecto en **IntelliJ IDEA**.
3. Asegúrate de tener **Java 24** configurado.
4. **Cambia tu API Key** en el archivo `ConversorAPI.java` reemplazando `YOUR-API-KEY` con tu clave real.
5. Ejecuta la clase `Main.java`.
6. Selecciona la opción deseada del menú ingresando un número.
7. Ingresa la cantidad a convertir cuando se solicite.
8. Obtén el resultado en consola.

---
- La API requiere una **API Key**. Reemplaza `YOUR-API-KEY` en `ConversorAPI.java` con tu clave real.
- El programa valida que las entradas sean números válidos, evitando errores al ingresar texto.
- Para cualquier conversión, el programa obtiene la tasa actual en tiempo real desde la API


