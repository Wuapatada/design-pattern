# Kata: Proxy

## Contexto

Tienes un visor de imágenes que debe cargar archivos muy pesados desde disco
o desde la red. Si el cliente crea directamente instancias de `RealImage`,
cada imagen se carga inmediatamente, incluso si nunca se llega a mostrar.

Esto genera:

- Tiempo de carga innecesario.
- Consumo excesivo de memoria.

## El Patrón: Proxy

El patrón **Proxy** crea un objeto sustituto que controla el acceso a otro
objeto. En este ejemplo, `ImageProxy` implementa la misma interfaz `Image`,
pero:

- Retrasa la carga real del recurso (lazy loading).
- Puede agregar comportamiento extra (logs, caché, control de acceso, etc.).

## ¿Cuándo usar este patrón?

- Cuando la creación/uso de un objeto es costosa y quieres retrasarla.
- Cuando quieres controlar el acceso a un objeto (seguridad, logs, cache).
- Cuando trabajas con recursos remotos (Remote Proxy) o virtuales (Virtual Proxy).

## Beneficios

- Mejora del rendimiento mediante carga diferida.
- Control centralizado de acceso.
- Transparencia para el cliente (usa la misma interfaz).

## Referencias

- GoF – Proxy.
- Ejemplos típicos: proxy de imágenes, proxy remotos (RMI), etc.
