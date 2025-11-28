# Reto(Proxy)

## Contexto

En `Main.java`, la clase `RealImage` simula la carga pesada de una imagen
desde disco. Cada vez que creas una nueva instancia, se ejecuta una operación
costosa, incluso si nunca llamas a `display()`.

## Problemas a identificar

- Carga costosa en el constructor de `RealImage`.
- No hay control sobre cuándo se carga realmente el recurso.
- El cliente siempre paga el costo, aunque no use la imagen.

## Instrucciones

1. Abre `Main.java`.
2. Observa cómo `RealImage` carga la imagen en el constructor.
3. Crea una interfaz `Image` con el método `display()`.
4. Haz que `RealImage` implemente `Image`.
5. Crea una clase `ImageProxy` que también implemente `Image` y:
   - Reciba el nombre del archivo.
   - Cargue la `RealImage` solo la primera vez que se llame a `display()`.
6. Cambia el código cliente para que use `ImageProxy` en lugar de `RealImage`
   directamente.

## Tips

- Usa un campo privado `RealImage realImage` dentro del proxy.
- Verifica si `realImage` es `null` antes de crearla.
- Puedes agregar un pequeño log para demostrar el lazy loading.

## Recursos adicionales

- Ejemplos de Virtual Proxy en la literatura de patrones.
- Diapositivas del curso sobre patrones estructurales.
