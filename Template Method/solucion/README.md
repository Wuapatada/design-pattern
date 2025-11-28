# Solución (Template Method)

> ⚠️ Revisa esta solución solo después de intentar resolver el reto.

## Cambios principales

- Se creó una clase abstracta `ReportGenerator` con el método plantilla
  `generate()`.
- La estructura del algoritmo (obtener → formatear → imprimir) se define
  en un solo lugar.
- `SimpleReport` y `DetailedReport` ahora extienden `ReportGenerator` y
  solo implementan los detalles de obtención y formateo de datos.

## Salida esperada

Ejemplo de salida:

```text
=== Generando reportes CON Template Method ===
[SimpleReport] Obteniendo datos...
[SimpleReport] Formateando datos...
[ReportGenerator] Imprimiendo reporte:
VENTAS: 100 | CLIENTES: 20

[DetailedReport] Obteniendo datos...
[DetailedReport] Formateando datos...
[ReportGenerator] Imprimiendo reporte:
VENTAS: 100 | CLIENTES: 20 | DEVOLUCIONES: 5
