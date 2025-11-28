# Kata: Command

## Contexto

Estás desarrollando un control remoto programable para encender y apagar
dispositivos (por ejemplo, luces). Actualmente el botón del control remoto
llama directamente a métodos de la clase `Light`. Si quieres agregar más
dispositivos (ventiladores, televisiones, etc.), el código del control remoto
se vuelve complejo y lleno de condicionales.

## El Patrón: Command

El patrón **Command** encapsula una petición como un objeto. Cada comando
implementa una interfaz común (por ejemplo, `Command` con `execute()` y
`undo()`), lo que permite:

- Desacoplar el objeto que invoca la acción del que la ejecuta.
- Manejar acciones como objetos (almacenarlas, deshacer, colas, logs, etc.).

## ¿Cuándo usar este patrón?

- Cuando quieres desacoplar quién solicita la acción de quién la ejecuta.
- Cuando quieres soportar operaciones de deshacer/rehacer.
- Cuando quieres almacenar y reprocesar comandos (macro comandos, colas, etc.).

## Beneficios

- Desacoplamiento entre invocador y receptor.
- Facilidad para agregar nuevos comandos sin modificar el invocador.
- Posibilidad de implementar deshacer/rehacer de manera natural.

## Referencias

- GoF – Command.
