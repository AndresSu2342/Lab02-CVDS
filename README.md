# LABORATORIO 2 - PATTERNS

## LA HERRAMIENTA MAVEN

**Maven** es una herramienta de gestión y construcción de proyectos basada en Java. Su mayor utilidad es simplificar y estandarizar el proceso de construcción, ofreciendo un sistema uniforme y generando información de calidad sobre los proyectos.

**Fases de Maven:** Incluyen validación, compilación, pruebas, empaquetado, verificación, instalación y despliegue.

**Ciclo de vida de construcción:** Define el conjunto de fases que ejecutan tareas específicas del proyecto en un orden determinado.

**Plugins:** Extienden las capacidades de Maven al añadir funcionalidades como la compilación de código o el manejo de dependencias.

**Repositorio Central de Maven:** Es un repositorio en línea donde se almacenan artefactos (como librerías y plugins) que los proyectos pueden usar sin necesidad de almacenarlos localmente.

## EJERCICIO DE LAS FIGURAS

### Creacion del Proyecto Maven

![Creacion](/Capturas/Captura1.png)
![Estructura](/Capturas/Captura2.png)

### Configuraciones del Proyecto

![Configuracion](/Capturas/Captura3.png)

### Compilar y Ejecutar


Hemos implementado una Simple Factory en la clase ShapeFactory. Este patrón es perfecto cuando necesitamos crear instancias de clases concretas sin exponer la lógica de creación al cliente, especialmente si no se necesita mucha flexibilidad para crear objetos.

¿Cuál es la mejor opción? Depende del contexto y de lo que necesite el proyecto:

- **Simple Factory** es ideal para situaciones sencillas donde la creación de objetos es directa y no se requiere mucha flexibilidad.
- **Factory Method** es útil cuando estamos trabajando con una jerarquía de clases y las subclases necesitan decidir cómo crear las instancias.
- **Abstract Factory** es más adecuada cuando necesitamos crear familias de productos relacionados que deben ser utilizados juntos.