# 6.3 Actividad Taller: MerceDAWs

## FASE 1: Diseño de Arquitectura de Software

En este enlace puedes ver el diseño de arquitectura de software:

[DESIGN.md](DESIGN.md)

## FASE 2: Implementación de la Arquitectura

En este enlace puedes ver la implementación de la arquitectura:

[ActividadTaller](ActividadTaller/src/main)

## FASE 3: Interpretación de la Arquitectura

¿Por qué has elegido composición o agregación entre Vehiculo y Reparacion?

Se ha elegido **composición fuerte** porque una `Reparacion` no tiene sentido de forma independiente: pertenece a un `Vehiculo` concreto y su ciclo de vida depende completamente de él. Si el vehículo desaparece, sus reparaciones también. Con una agregación, las reparaciones podrían existir de forma autónoma, lo cual no refleja la realidad del dominio.

¿Qué ventaja tiene usar la interfaz Especialista?

La interfaz `Especialista` permite **desacoplar** el concepto de "saber reparar" de una clase concreta. Gracias a ella, el `Taller` puede trabajar con cualquier tipo de especialista (no solo `Mecanico`) sin necesidad de cambiar su código, siguiendo el principio de programación orientada a interfaces. Esto facilita la extensibilidad: si en el futuro se añade un `Electricista` o un `Chapista`, simplemente implementan `Especialista` y el resto del sistema los acepta sin modificaciones.
