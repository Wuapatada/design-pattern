# Kata: Template Method

## Contexto

Tienes un sistema que genera reportes en diferentes formatos (por ejemplo,
reporte diario en consola, reporte CSV, reporte detallado). Todos los reportes
siguen el mismo flujo general:

1. Obtener datos.
2. Darles formato.
3. Exportar/mostrar el resultado.

Actualmente cada tipo de reporte implementa todo el proceso completo y hay
mucho código duplicado.

## El Patrón: Template Method

El patrón **Template Method** define el esqueleto de un algoritmo en una clase
base, dejando que las subclases definan algunos pasos específicos. El método
plantilla (`generateReport()`, por ejemplo) marca el flujo, mientras que
métodos como `fetchData()` y `formatData()` son implementados por las
subclases.

## ¿Cuándo usar este patrón?

- Cuando múltiples clases comparten un flujo general de pasos, pero difieren
  en algunos detalles.
- Cuando quieres evitar duplicación de código en métodos que siguen la misma
  estructura.
- Cuando quieres garantizar un orden específico de pasos en un proceso.

## Beneficios

- **Reutilización de código**: el flujo común se define una vez.
- **Consistencia**: todos los reportes siguen el mismo orden de pasos.
- **Extensibilidad**: puedes crear nuevos tipos de reporte sin duplicar lógica
  del algoritmo general.

## Principios SOLID aplicados

- **SRP**: cada subclase se enfoca en los detalles de un tipo de reporte.
- **OCP**: para agregar un nuevo tipo de reporte, creas una nueva subclase, sin
  modificar el algoritmo base.

## Referencias

- GoF – Template Method.
