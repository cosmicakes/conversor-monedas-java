# Conversor de Monedas – Desafío Java + API + Gson

Proyecto realizado como parte del desafío de Alura – Oracle Next Education.

## ✔ Tecnologías utilizadas
- Java 17
- Biblioteca Gson 2.10.1
- ExchangeRate-API
- HttpClient, HttpRequest, HttpResponse

## ✔ Descripción
Este programa permite convertir valores entre diferentes monedas utilizando datos reales obtenidos mediante una API de tasas de cambio.

El proyecto incluye:
- Menú interactivo por consola
- API externa para obtener tasas actualizadas
- Uso de Gson para parsear JSON
- Uso de HttpClient para consumir la API

## ✔ Cómo ejecutar
1. Instalar Java 17
2. Descargar **gson-2.10.1.jar** y colocarlo en la carpeta `/lib`
3. Compilar:
   ```bash
   javac -cp lib/gson-2.10.1.jar src/*.java
