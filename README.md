# Sistema de Entregas con Drones Autónomos
**Prueba BI — Programación Orientada a Objetos**
Escuela Politécnica Nacional | Semestre 2026A

## Descripción
Sistema en Java que modela drones de entrega autónomos aplicando herencia, encapsulamiento, métodos abstractos y polimorfismo.

## Estructura de clases
- `Dron.java` → Clase abstracta base con atributos comunes, getters, setters con validación y métodos abstractos
- `DronLiviano.java` → Carga máx. 5 kg, 2 horas máx. Fórmula: costoBase + (distancia * 0.80) + (peso * 0.50)
- `DronCarga.java` → Carga máx. 30 kg, 5 horas máx. Fórmula: costoBase + (distancia * 1.20) + (peso * costoPorKg)
- `DronEmergencia.java` → Carga máx. 10 kg, 3 horas máx. Fórmula: costoBase + (distancia * 1.50) + (peso * 0.90) + recargoUrgencia
- `Main.java` → Punto de entrada, Scanner, demostración de polimorfismo y setters

## Conceptos aplicados
- Herencia con `extends` y `super`
- Encapsulamiento con atributos `protected` y setters con validación
- Métodos abstractos `calcularCostoEntrega()` y `validarDatos()`
- Polimorfismo mediante referencias de tipo `Dron`
- Sobrescritura con `@Override`
- Entrada de datos con `Scanner`

## Decisiones de diseño
1. `Dron` es abstracta porque no existe un dron sin tipo definido
2. Los setters validan antes de asignar para proteger el estado del objeto
3. Cada clase hija tiene su propio `setPesoPaquete()` con su límite específico
4. El polimorfismo se demuestra con variables tipo `Dron` apuntando a objetos concretos
5. Los constructores sin parámetros cargan valores quemados para facilitar las pruebas

## Cómo ejecutar
1. Clonar el repositorio
2. Abrir en IntelliJ, Eclipse o NetBeans
3. Compilar y ejecutar `Main.java`
4. Seguir las instrucciones en consola

## Autor
[Tu nombre completo]
Escuela de Formación de Tecnólogos — EPN
