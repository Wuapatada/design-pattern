# Challenge: Template Method

## Contexto

En `Main.java` hay dos tipos de reportes:

- `SimpleReport`: imprime datos básicos en consola.
- `DetailedReport`: imprime datos detallados.

Ambos siguen la misma estructura:

1. Conectarse/fetch de datos.
2. Formatear la información.
3. Mostrar el resultado.

Sin embargo, cada clase implementa todo el proceso, generando duplicación de
código y riesgo de inconsistencias.

## Problemas a identificar

- Código duplicado en la estructura del flujo.
- Cambios en el flujo general requieren modificar múltiples clases.
- Riesgo de que un reporte se “desincronice” del comportamiento esperado.

## Instrucciones

1. Abre `Main.java`.
2. Identifica la secuencia de pasos que es común a todos los reportes.
3. Crea una clase abstracta `ReportGenerator` que:
   - Defina un método `generate()` como **método plantilla**.
   - Declare métodos abstractos para los pasos variables:
     - `fetchData()`
     - `formatData(String rawData)`
   - Opcionalmente, tenga un método concreto `print(String formattedData)`.
4. Haz que `SimpleReport` y `DetailedReport` extiendan `ReportGenerator` y
   sobrescriban los pasos necesarios.

## Tips

- Empieza por copiar la secuencia de pasos iguales a `ReportGenerator.generate()`.
- Usa `protected` para métodos que las subclases deban sobrescribir.
- Mantén el `main` lo más simple posible: sólo crea reportes y llama `generate()`.

## Recursos adicionales
- Documentación de patrones de diseño de Oracle/Java.
