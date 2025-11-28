# Reto(Command)

## Contexto

En `Main.java` existe una clase `Light` con métodos `turnOn()` y `turnOff()`.
La clase `SimpleRemoteControl` tiene un botón que actualmente llama
directamente a la luz.

## Problemas a identificar

- El control remoto está acoplado a una implementación concreta (`Light`).
- Para manejar múltiples dispositivos y acciones, el control remoto tendría
  que llenarse de condicionales.
- Es difícil agregar nuevas acciones (por ejemplo, atenuar luz, encender
  varias luces a la vez, etc.).

## Instrucciones

1. Abre `Main.java`.
2. Define una interfaz `Command` con el método `execute()`.
3. Crea comandos concretos:
   - `LightOnCommand`
   - `LightOffCommand`
4. Modifica `SimpleRemoteControl` para que:
   - Tenga un atributo `Command slot`.
   - Exporte un método `setCommand(Command command)`.
   - Su botón llame `slot.execute()`.
5. En el `main`, configura el control remoto con distintos comandos y ejecuta
   las acciones.

## Tips

- El control remoto no debe conocer los detalles de `Light`, solo el comando.
- Piensa en el comando como un "adaptador" entre el botón y el receptor real.
- Puedes simular varios botones creando más atributos `Command`.

## Recursos adicionales

- Capítulos sobre Command en libros de patrones.
