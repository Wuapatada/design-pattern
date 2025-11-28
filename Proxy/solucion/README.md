# Solución (Proxy)

> ⚠️ Revisa esta solución solo después de intentar el reto.

## Cambios principales

- Se introdujo la interfaz `Image` con el método `display()`.
- `RealImage` ahora implementa `Image`.
- Se creó `ImageProxy` que también implementa `Image` y:
  - Recibe el nombre del archivo pero no carga la imagen inmediatamente.
  - Carga la `RealImage` solo cuando se llama por primera vez a `display()`.

## Salida esperada

Ejemplo de salida:

```text
=== Cargando imagenes CON Proxy ===
[ImageProxy] Imagen creada, carga diferida.
[ImageProxy] Mostrando imagen bajo demanda...
[RealImage] Cargando imagen desde disco: foto_perfil.png
[RealImage] Mostrando imagen: foto_perfil.png
