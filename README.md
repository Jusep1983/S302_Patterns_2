# S302_Patterns_2

## 📄 Descripción
En esta práctica profundizaremos en los patrones de diseño **Builder**, **Observer** y **Callback** en Java. Cada nivel corresponde a un patrón distinto:

- **Nivel 1 – Builder**: Gestión de pedidos de pizzas con el patrón _Builder_.
- **Nivel 2 – Observer**: Sistema de notificaciones bursátiles con el patrón _Observer_.
- **Nivel 3 – Callback**: Pasarela de pago simulada con patrón _Callback_ en una tienda de zapatos.

## 🔽 Enunciados

<details>
<summary>🔹 Nivel 1 – Builder (clic para ver el enunciado completo)</summary>

    Desarrolla un sistema de gestión de pedidos de pizzas utilizando el patrón _Builder_ en Java. El sistema ha de permitir la creación 
    de diferentes tipos de pizzas con configuraciones de tamaño, masa e ingredientes distintos.
    
    1. Define una clase `Pizza` con los siguientes atributos:
       - `size` (tamaño)
       - `dough` (tipo de masa)
       - `toppings` (ingredientes)
    2. Crea una interfaz `PizzaBuilder` con el método `Pizza build()`.
    3. Implementa builders concretos (por ejemplo: `MediumHawaiianPizzaBuilder`, `LargeVeganPizzaBuilder`, `SmallPepperoniPizzaBuilder`).
    4. Desarrolla una clase `MestrePizzer` que reciba un `PizzaBuilder` y llame a `build()`.
    5. En la clase `Main`, instancia varios builders y usa `MestrePizzer` para construir y mostrar las pizzas.

</details>

<details>
<summary>🔹 Nivel 2 – Observer (clic para ver el enunciado completo)</summary>

    Diseña un sistema en el que un **Agente de Bolsa** (o `StockExchange`) notifique a varias 
    **Agencias de Bolsa** (o `Broker`) cuando la Bolsa sube o baja.
    
    1. Define la interfaz `Broker` con el método `update(String indexName, double lastValue, double change)`.
    2. Define la interfaz `StockExchange` con los métodos `addBroker()`, `removeBroker()` y `notifyBrokers()`.
    3. Implementa `ConcreteStockExchange` y `ConcreteBroker`.
    4. En la clase `Main`, suscribe varios brokers, simula actualizaciones de índices y observa las notificaciones.

</details>

<details>
<summary>🔹 Nivel 3 – Callback (clic para ver el enunciado completo)</summary>

Simula una pasarela de pago que reciba un objeto que implemente `PaymentMethod` (tarjeta de crédito, PayPal o transferencia bancaria).

    1. Define la interfaz funcional `PaymentMethod` (`getName()`, `pay(amount)`).
    2. Implementa las clases `CreditCardPayment`, `PaypalPayment`, `BankTransfer`.
    3. Crea `PaymentGateway` que reciba un `PaymentMethod` y un importe, invoque `pay()` y devuelva el control.
    4. La clase `ShoeStore` invoca la pasarela con un `Purchase` que contiene la lista de `Shoe` y el `PaymentMethod`.
    5. En la clase `Main`, crea clientes, compras y procesa varios pagos.

</details>

## 💻 Tecnologías Utilizadas

- Java 23
- Gradle como sistema de compilación
- IntelliJ IDEA
- Git y GitHub para control de versiones

## 📋 Requisitos

- JDK 23 instalado
- Gradle instalado o uso del wrapper `gradlew`
- IntelliJ IDEA (opcional)
- Conexión a Internet para clonar el repositorio

## 🛠️ Instalación

### Clonar el repositorio
- Desde la terminal situate en la carpeta que desees clonarlo (por ejemplo: cd S302_Patterns_2) y ejecuta el comando git clone
  
```bash
      cd S302_Patterns_2

      git clone https://github.com/Jusep1983/S302_Patterns_2.git
      
```

### Importar en IntelliJ IDEA

1. Abre IntelliJ IDEA.  
2. Ve a **File > Open** y selecciona la carpeta del proyecto.  
3. Asegúrate de usar **JDK 23** en **Project Structure**.


## ▶️ Ejecución

En la terminal (dentro de la carpeta del proyecto):

```bash
./gradlew run
```
O bien, ejecutando la clase Main directamente desde IntelliJ IDEA.

## 🌐 Estructura de Paquetes

level1.builders         Patrón Builder
level2.observers        Patrón Observer: interfaces y brokers
level2.subjects         Patrón Observer: stock exchange
level3.model            Modelo de dominio para compras y clientes
level3.payment          Interfaz PaymentMethod y métodos de pago
level3.payment.gateway  Pasarela de pago
level3.payment.methods  Implementaciones de métodos de pago

## 🤝 Contribuciones

Haz un fork del repositorio.

1. Crea una rama para tu feature (git checkout -b feature/X).
2. Haz commit de tus cambios (git commit -m "feat: descripción").
3. Publica tu rama (git push origin feature/X).
4. Abre un Pull Request.

## ¡Gracias por pasarte y a tope con los patrones! 🚀
