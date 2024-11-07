# ConversorDeMonedas
Challenge del Conversor de monedasChallenge del Conversor de monedas, Curso Alura Java

![image](https://github.com/user-attachments/assets/1206800d-1cfb-4c40-b2ba-428aec55d72f)

Esta aplicación es un conversor de monedas desarrollado en Java. Utiliza la API de ExchangeRate-API para obtener las tasas de cambio actuales y realizar conversiones entre diferentes monedas.

# 📝  Características
Conversión de Dólares (USD) a Peso Argentino (ARS), Real Brasileño (BRL) y Peso Colombiano (COP).

Conversión de Peso Argentino (ARS), Real Brasileño (BRL) y Peso Colombiano (COP) a Dólares (USD).

Obtención de tasas de cambio en tiempo real desde ExchangeRate-API.

# 🛠️ Requisitos
Java 17 o superior.

Conexión a Internet para acceder a la API de ExchangeRate-API.

Biblioteca Gson para el manejo de JSON.

# 🔌Instalación
Clona o descarga el repositorio del proyecto.

Abre el proyecto en tu IDE favorito (IntelliJ IDEA, Eclipse, etc.).

Asegúrate de que la biblioteca Gson esté incluida en las dependencias del proyecto.

# 👩‍💻 Clases Implementadas
*Principal* 🏦: Esta clase es el corazón de la aplicación, maneja la interacción con el usuario, presenta el menú y recibe la entrada del usuario para realizar la conversión de monedas.

*ConsultaMoneda* 💰: Esta clase se encarga de hacer la solicitud a la API de ExchangeRate-API, obtener las tasas de cambio actuales y devolverlas en un formato que la clase Principal pueda usar.

*Moneda* 💸: Esta es una clase de datos que estructura la respuesta de la API, conteniendo el código de la moneda base y las tasas de conversión para otras monedas.


