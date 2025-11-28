# Solución (Command)

> ⚠️ Revisa esta solución después de intentar resolver el reto.

## Cambios principales

- Se creó la interfaz `Command` con el método `execute()`.
- Se implementaron `LightOnCommand` y `LightOffCommand` como comandos concretos.
- `SimpleRemoteControl` ahora:
  - Depende de `Command`, no de `Light` directamente.
  - Permite configurar dinámicamente qué comando se ejecuta.

## Salida esperada

Ejemplo de salida:

```text
=== Usando control remoto CON Command ===
[Light] La luz está encendida.
[Light] La luz está apagada.
