# Lab02-CVDS
Hemos implementado una Simple Factory en la clase ShapeFactory. Este patrón es perfecto cuando necesitamos crear instancias de clases concretas sin exponer la lógica de creación al cliente, especialmente si no se necesita mucha flexibilidad para crear objetos.

¿Cuál es la mejor opción? Depende del contexto y de lo que necesite el proyecto:

- **Simple Factory** es ideal para situaciones sencillas donde la creación de objetos es directa y no se requiere mucha flexibilidad.
- **Factory Method** es útil cuando estamos trabajando con una jerarquía de clases y las subclases necesitan decidir cómo crear las instancias.
- **Abstract Factory** es más adecuada cuando necesitamos crear familias de productos relacionados que deben ser utilizados juntos.