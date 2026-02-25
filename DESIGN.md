# 6.3 Actividad Taller: Diseño de Arquitectura de Software

```mermaid
classDiagram
    class Vehiculo {
        - String matricula
        - String modelo
        - List~Reparacion~ Reparaciones
    }
    class Coche {

    }
    
    class Moto{

    }

    class Cliente {
        - String nombre
        -List ~Vehiculo~ vehiculos
    }

    class Reparacion {
        - String descripccion
        - Date fecha
    }

    class Especialista {
        <<interface>>
        + reparar (Reparacion reparacion)
    }

    class Mecanico {
        - String nombre
        + reparar (Reparación reparacion) void
    }

    class Taller {
        + asignarReparacion (Reparacion reparacion, Mecanico mecanico) void
    }

    %% HERENCIA
    Vehiculo <|-- Coche
    Vehiculo <|-- Moto

    %% COMPOSICION (vinculo fuerte)
    Vehiculo "1" *-- "0..*" Reparacion

    %% ASOCIACION
    Cliente "1" --> "1..*" Vehiculo

    %% DEPENDENCIA
    Taller ..> Mecanico
    Taller ..> Reparacion

    %% REALIZACION (interfaz)
    Especialista <|-- Mecanico

```
