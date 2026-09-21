# Sistema de Gestión de Pedidos en Restaurante
---
# ACTIVIDAD DE PRACTICA DE CAMPO SEMANA 4

**Propuesta de sistema para el curso:**
TECNICAS DE PROGRAMCION ORIENTADA A OBJETOS

**Grupo:** 01

**Integrantes:**
1. LUZDANY F. CABANILLAS PIZARRO (Coordinadora)
2. VICTOR JOSUE CASTRO BAYETO
3. SERGIO GUSTAVO MORI AHUANARI
4. LENIN ANDERSON MENDO COTRINA

**Docente:**
> HEBER GOMEZ HURTADO

---

## 1. Identificación de restricciones realistas del proyecto

Para el desarrollo del Sistema de Gestión de Pedidos en Restaurante, se identificaron algunas restricciones que podrían limitar el desarrollo del proyecto durante el ciclo académico. Estas restricciones se relacionan con el tiempo disponible, la tecnología utilizada, los recursos del equipo y las condiciones propias del negocio.

| Restricción identificada | Tipo | Alternativa de solución propuesta |
|---|---|---|
| El tiempo disponible para desarrollar el proyecto está limitado por la duración del ciclo académico. | Tiempo | Priorizar las funcionalidades principales del sistema, como registrar pedidos, agregar platos, calcular el total, enviar el pedido a cocina, generar la cuenta y registrar el pago. |
| El proyecto debe desarrollarse utilizando Java y las herramientas definidas para el curso. | Tecnología | Utilizar Java y las librerías permitidas por el curso, evitando incorporar tecnologías adicionales que aumenten la complejidad o el tiempo de desarrollo. |
| El equipo cuenta con recursos y tiempo limitados para realizar pruebas en un restaurante real. | Recursos | Utilizar datos simulados y realizar las pruebas mediante escenarios representativos de un restaurante, como mesas, platos, pedidos y pagos de prueba. |
| No se cuenta con acceso a información real de un restaurante, como precios, ventas o datos de clientes. | Recursos | Crear una base de datos o conjunto de datos de prueba con platos, precios, mesas y pedidos ficticios que representen situaciones reales. |
| El sistema debe manejar correctamente el cálculo del IGV y los estados del pedido y de la cuenta. | Negocio | Establecer reglas de negocio claras dentro del sistema, como calcular automáticamente el IGV del 18%, impedir modificar manualmente el total y controlar los cambios de estado. |
| La cocina se considera un proceso externo y no se desarrollará un módulo específico para ella. | Negocio | Representar el envío del pedido mediante el cambio de estado de **PENDIENTE → EN_PREPARACION**, simulando la recepción y preparación del pedido. |
| El sistema no contempla el registro de clientes debido al alcance definido para el proyecto. | Negocio | Identificar cada pedido mediante la mesa asociada, evitando implementar funcionalidades adicionales de registro y administración de clientes. |

---

## 2. Establecer los objetivos del proyecto

**Objetivo general:**
Desarrollar un sistema de gestión de pedidos para restaurante que permita optimizar y controlar el proceso de atención, desde el registro del pedido hasta el pago y cierre de la venta, con el propósito de reducir los retrasos en la entrega de los pedidos al cliente.

**Objetivos específicos:**

1. **Registro de Pedido:**
   > Implementar el registro de pedidos asociados a una mesa, permitiendo agregar los platos, cantidades y precios correspondientes para reducir errores y omisiones durante la toma del pedido.

2. **Automatización de cálculos:**
   > Automatizar el cálculo del subtotal, IGV del 18% y total de la cuenta para reducir el tiempo empleado en la generación manual de la cuenta y evitar errores en los montos.

3. **Control del estado del pedido:**
   > Implementar el control de los estados del pedido mediante las etapas PENDIENTE, EN_PREPARACION, ENTREGADO y FINALIZADO, permitiendo realizar un seguimiento del pedido durante el proceso de atención.

4. **Automatización del pago y cierre:**
   > Implementar el registro de pagos mediante efectivo o tarjeta, permitiendo actualizar automáticamente el estado de la cuenta y finalizar el pedido una vez realizado el pago.

5. **Registro de tiempos e información:**
   > Registrar información relacionada con los pedidos, incluyendo sus estados y tiempos de atención, para facilitar el seguimiento del proceso e identificar posibles retrasos en la entrega.

---

## 3. Definir el alcance de la solución

### 3.1. Descripción del alcance

> El proyecto consiste en desarrollar un Sistema de Gestión de Pedidos en Restaurante que permita controlar y agilizar el proceso de atención al cliente, desde el registro del pedido asociado a una mesa hasta el pago y cierre de la venta.
>
> El sistema permitirá al personal encargado registrar los pedidos, agregar los platos solicitados, calcular automáticamente los importes, enviar el pedido a cocina mediante un cambio de estado, controlar la entrega, generar la cuenta, registrar el pago y almacenar la venta finalizada en un historial.
>
> El alcance se encuentra limitado a las funcionalidades necesarias para gestionar el proceso de pedidos y ventas dentro del restaurante, dejando fuera procesos adicionales que no sean necesarios para cumplir con el objetivo principal del proyecto.

**El sistema incluirá los siguientes módulos y funcionalidades:**

#### Gestión de Mesas:

- Identificar las mesas disponibles y asociarlas a un pedido.
- Asociar cada pedido con una mesa determinada.
- Permitir identificar el pedido mediante el número de mesa.
- No será necesario registrar información del cliente.

#### Gestión de Pedidos:

El sistema permitirá:

- Crear un nuevo pedido.
- Asociar el pedido a una mesa.
- Registrar los platos solicitados.
- Registrar la cantidad de cada plato.
- Mostrar el precio de cada plato.
- Agregar y eliminar platos del pedido.
- Calcular automáticamente el subtotal.
- Controlar el estado del pedido.

> **Estados: PENDIENTE → EN_PREPARACION → ENTREGADO → FINALIZADO**

#### Gestión de platos:

El sistema permitirá:

- Registrar los platos disponibles.
- Mostrar el nombre del plato.
- Mostrar el precio establecido.
- Utilizar el precio registrado para calcular automáticamente el pedido.

#### Envío del pedido a cocina:

> El sistema permitirá que el mozo confirme el pedido y lo envíe a cocina mediante la función: `enviarACocina()`
>
> Al realizar esta acción: **PENDIENTE → EN_PREPARACION**
>
> La cocina será considerada un proceso externo al sistema.

#### Entrega del pedido:

- Identificar las mesas disponibles y asociarlas a un pedido.
- Asociar cada pedido con una mesa determinada.
- Permitir identificar el pedido mediante el número de mesa.
- No será necesario registrar información del cliente.

#### Entrega del pedido:

> Una vez que la preparación haya finalizado, el mozo podrá registrar la entrega del pedido mediante: `entregarPedido()`
>
> El estado cambiará: **EN_PREPARACION → ENTREGADO**

#### Generación de la cuenta:

> Después de entregar el pedido, el sistema permitirá generar automáticamente la cuenta mediante: `generarCuenta()`
>
> El sistema calculará:

- Subtotal.
- IGV del 18%.
- Total.

> El total será calculado automáticamente y no podrá ser modificado manualmente.
>
> La cuenta comenzará en estado: **PENDIENTE**

#### Registro del pago:

> El sistema permitirá registrar el pago de una cuenta mediante: `registrarPago()`
>
> Se considerarán los siguientes métodos:

- Efectivo.
- Tarjeta.

> Una vez registrado correctamente el pago: **PENDIENTE → PAGADO**
>
> El pago podrá ser registrado por el mozo o si se implementa dentro del alcance por el cajero.

#### Cierre del pedido:

> Una vez que la cuenta haya sido pagada, el sistema permitirá cerrar el pedido.
>
> Los estados cambiarán a:

- **Pedido → FINALIZADO**
- **Cuenta → FINALIZADA**

---

### Funcionalidades fuera del alcance

| Funcionalidad excluida | Justificación |
|---|---|
| **Registro de clientes** | El pedido será identificado mediante la mesa, por lo que no será necesario almacenar información del cliente. |
| **Sistema de delivery** | El proyecto está orientado a la atención de pedidos dentro del restaurante. |
| **Reservas de mesas** | No forma parte del flujo principal definido para la gestión de pedidos. |
| **Gestión de proveedores** | No está relacionada directamente con el proceso de toma, preparación, entrega y pago del pedido. |
| **Control de inventario de ingredientes** | El alcance se concentra en los pedidos y ventas, no en la administración de insumos de cocina. |
| **Integración con sistemas reales de cocina** | La cocina será representada como un proceso externo. |
| **Pagos electrónicos reales** | El sistema únicamente registrará el método de pago; no se conectará con bancos, POS o pasarelas de pago reales. |
| **Facturación electrónica ante SUNAT** | No se implementará integración con servicios externos de facturación electrónica. |
| **Aplicación móvil para clientes** | El cliente no interactuará directamente con el sistema. |
| **Sistema de delivery externo** | No se desarrollará integración con servicios como repartidores o plataformas de entrega. |

---

## 4. Usuarios o roles que interactuarán con el sistema

| Rol | Funciones principales |
|---|---|
| **Mozo** | Registrar pedidos, seleccionar mesa, agregar platos, enviar pedidos a cocina, registrar la entrega y registrar pagos cuando corresponda. |
| **Cajero** | Registrar el pago de las cuentas cuando el cliente realice el pago en caja. (El cajero será considerado un rol opcional dentro del sistema, utilizado únicamente cuando el pago se realice en caja.) |
| **Cocina** | No tendrá un usuario dentro del sistema. Se considera un proceso externo que recibe el pedido y prepara los platos. |

---

## 5. Plataforma y tecnologías

| Elemento | Tecnología propuesta |
|---|---|
| **Lenguaje de programación** | Java |
| **Base de datos** | MySQL |
| **Entorno de desarrollo** | Apache Netbeans |
| **Arquitectura** | Aplicación de escritorio |
| **Sistema operativo** | Windows |


# Requerimientos e Historias de Usuario

## Tabla de Requerimientos

| # | Requerimiento | Prioridad | Responsable |
|---|---|---|---|
| RF-01 | El sistema debe permitir registrar un nuevo cliente con sus datos básicos. | Alta | Integrante 1 |
| RF-02 | El sistema debe permitir modificar los datos registrados de un cliente. | Media |  |
| RF-03 | El sistema debe permitir consultar los datos de un cliente registrado. | Alta |  |
| RF-04 | El sistema debe permitir buscar un cliente mediante su documento de identidad. | Alta |  |
| RF-05 | El sistema debe permitir buscar un cliente mediante su nombre. | Media |  |
| RF-06 | El sistema debe validar que el documento de identidad de un cliente no se encuentre registrado previamente. | Alta |  |
| RF-07 | El sistema debe permitir registrar los datos de contacto de un cliente. | Media |  |
| RF-08 | El sistema debe permitir actualizar los datos de contacto de un cliente registrado. | Media |  |
| RF-09 | El sistema debe permitir consultar el historial de pedidos asociados a un cliente. | Media |  |
| RF-10 | El sistema debe permitir identificar al cliente asociado a un pedido registrado. | Alta |  |
| RF-11 | El sistema debe registrar los platos solicitados en el pedido. | Alta | Integrante 2 |
| RF-12 | El sistema debe enviar el pedido a cocina y cambiar su estado a “EN_PREPARACION”. | Alta |  |
| RF-13 | El sistema debe generar automáticamente la cuenta con subtotal, IGV y total. | Alta |  |
| RF-14 | El sistema debe permitir registrar el pago en efectivo o tarjeta. | Alta |  |
| RF-15 | El sistema debe guardar la venta en el historial una vez finalizado el pedido. | Alta |  |
| RF-16 | El sistema debe permitir registrar una nueva mesa indicando su número y capacidad. | Alta |  |
| RF-17 | El sistema debe permitir consultar las mesas registradas en el restaurante. | Alta |  |
| RF-18 | El sistema debe permitir consultar la disponibilidad de una mesa. | Alta |  |
| RF-19 | El sistema debe permitir actualizar el estado de una mesa. | Alta |  |
| RF-20 | El sistema debe validar que una mesa no sea asignada a más de un pedido activo simultáneamente. | Alta |  |
| RF-21 | El sistema debe permitir registrar un nuevo plato con su nombre, precio y categoría. | Alta | Integrante 3 |
| RF-22 | El sistema debe permitir modificar los datos de un plato registrado. | Media |  |
| RF-23 | El sistema debe permitir consultar la información de un plato registrado. | Alta |  |
| RF-24 | El sistema debe permitir actualizar la disponibilidad de un plato. | Alta |  |
| RF-25 | El sistema debe permitir consultar los platos disponibles para ser solicitados en un pedido. | Alta |  |
| RF-26 | El sistema debe permitir modificar la cantidad de un plato solicitado en un pedido antes de su preparación. | Media |  |
| RF-27 | El sistema debe permitir modificar la cantidad de un plato solicitado en un pedido antes de su preparación. | Media |  |
| RF-28 | El sistema debe calcular el importe de cada plato considerando su precio y cantidad solicitada. | Alta |  |
| RF-29 | El sistema debe permitir consultar el detalle de un pedido mostrando los platos, cantidades y estado. | Alta |  |
| RF-30 | El sistema debe permitir actualizar el estado de un pedido durante su proceso de atención. | Alta |  |
| RF-31 | El sistema debe permitir registrar un nuevo mesero con sus datos básicos. | Alta | Integrante 4 |
| RF-32 | El sistema debe permitir modificar los datos de un mesero registrado. | Media |  |
| RF-33 | El sistema debe permitir consultar los meseros registrados en el sistema. | Media |  |
| RF-34 | El sistema debe permitir asociar un mesero responsable a un pedido. | Alta |  |
| RF-35 | El sistema debe permitir consultar los pedidos asociados a un mesero. | Media |  |
| RF-36 | El sistema debe permitir consultar los pedidos registrados según su estado. | Media |  |
| RF-37 | El sistema debe permitir consultar las ventas registradas en el historial. | Media |  |
| RF-38 | El sistema debe permitir consultar una venta mediante el identificador del pedido. | Media |  |
| RF-39 | El sistema debe permitir consultar el total pagado de una venta registrada. | Media |  |
| RF-40 | El sistema debe permitir consultar un resumen de las ventas realizadas durante una jornada. | Baja |  |

## Distribución del trabajo

- Distribucion:
- Integrante 1: RF-01 al RF-10 → Gestión de clientes.
- Integrante 2: RF-11 al RF-20 → Pedidos, cuenta, pagos y mesas.
- Integrante 3: RF-21 al RF-30 → Platos y detalle de pedidos.
- Integrante 4: RF-31 al RF-40 → Meseros, consultas y ventas.

