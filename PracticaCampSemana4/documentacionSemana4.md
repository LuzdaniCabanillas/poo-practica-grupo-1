# Documentación del Proyecto

1.	Identificación de restricciones realistas del proyecto

Para el desarrollo del Sistema de Gestión de Pedidos en Restaurante, se identificaron algunas restricciones que podrían limitar el desarrollo del proyecto durante el ciclo académico. Estas restricciones se relacionan con el tiempo disponible, la tecnología utilizada, los recursos del equipo y las condiciones propias del negocio.

Restricción identificada	Tipo	Alternativa de solución propuesta
El tiempo disponible para desarrollar el proyecto está limitado por la duración del ciclo académico.	Tiempo	Priorizar las funcionalidades principales del sistema, como registrar pedidos, agregar platos, calcular el total, enviar el pedido a cocina, generar la cuenta y registrar el pago.
El proyecto debe desarrollarse utilizando Java y las herramientas definidas para el curso.	Tecnología	Utilizar Java y las librerías permitidas por el curso, evitando incorporar tecnologías adicionales que aumenten la complejidad o el tiempo de desarrollo.
El equipo cuenta con recursos y tiempo limitados para realizar pruebas en un restaurante real.	Recursos	Utilizar datos simulados y realizar las pruebas mediante escenarios representativos de un restaurante, como mesas, platos, pedidos y pagos de prueba.
No se cuenta con acceso a información real de un restaurante, como precios, ventas o datos de clientes.	Recursos	Crear una base de datos o conjunto de datos de prueba con platos, precios, mesas y pedidos ficticios que representen situaciones reales.
El sistema debe manejar correctamente el cálculo del IGV y los estados del pedido y de la cuenta.	Negocio	Establecer reglas de negocio claras dentro del sistema, como calcular automáticamente el IGV del 18%, impedir modificar manualmente el total y controlar los cambios de estado.
La cocina se considera un proceso externo y no se desarrollará un módulo específico para ella.	Negocio	Representar el envío del pedido mediante el cambio de estado de PENDIENTE → EN_PREPARACION, simulando la recepción y preparación del pedido.
El sistema no contempla el registro de clientes debido al alcance definido para el proyecto.	Negocio	Identificar cada pedido mediante la mesa asociada, evitando implementar funcionalidades adicionales de registro y administración de clientes.


2.	Establecer los objetivos del proyecto

Objetivo general:
Desarrollar un sistema de gestión de pedidos para restaurante que permita optimizar y controlar el proceso de atención, desde el registro del pedido hasta el pago y cierre de la venta, con el propósito de reducir los retrasos en la entrega de los pedidos al cliente.

1.	Registro de Pedido:
Implementar el registro de pedidos asociados a una mesa, permitiendo agregar los platos, cantidades y precios correspondientes para reducir errores y omisiones durante la toma del pedido.

2.	Automatización de cálculos:
Automatizar el cálculo del subtotal, IGV del 18% y total de la cuenta para reducir el tiempo empleado en la generación manual de la cuenta y evitar errores en los montos.

3.	Control del estado del pedido: 
Implementar el control de los estados del pedido mediante las etapas PENDIENTE, EN_PREPARACION, ENTREGADO y FINALIZADO, permitiendo realizar un seguimiento del pedido durante el proceso de atención.

4.	Automatización del pago y cierre: 
Implementar el registro de pagos mediante efectivo o tarjeta, permitiendo actualizar automáticamente el estado de la cuenta y finalizar el pedido una vez realizado el pago.

5.	Registro de tiempos e información:
Registrar información relacionada con los pedidos, incluyendo sus estados y tiempos de atención, para facilitar el seguimiento del proceso e identificar posibles retrasos en la entrega.






3.	 Definir el alcance de la solución

3.1.	Descripción del alcance
El proyecto consiste en desarrollar un Sistema de Gestión de Pedidos en Restaurante que permita controlar y agilizar el proceso de atención al cliente, desde el registro del pedido asociado a una mesa hasta el pago y cierre de la venta.

El sistema permitirá al personal encargado registrar los pedidos, agregar los platos solicitados, calcular automáticamente los importes, enviar el pedido a cocina mediante un cambio de estado, controlar la entrega, generar la cuenta, registrar el pago y almacenar la venta finalizada en un historial.

El alcance se encuentra limitado a las funcionalidades necesarias para gestionar el proceso de pedidos y ventas dentro del restaurante, dejando fuera procesos adicionales que no sean necesarios para cumplir con el objetivo principal del proyecto.

El sistema incluirá los siguientes módulos y funcionalidades:

Gestión de Mesas:
•	Identificar las mesas disponibles y asociarlas a un pedido.
•	Asociar cada pedido con una mesa determinada.
•	Permitir identificar el pedido mediante el número de mesa.
•	No será necesario registrar información del cliente.

Gestión de Pedidos:
el sistema permitirá:
•	Crear un nuevo pedido.
•	Asociar el pedido a una mesa.
•	Registrar los platos solicitados.
•	Registrar la cantidad de cada plato.
•	Mostrar el precio de cada plato.
•	Agregar y eliminar platos del pedido.
•	Calcular automáticamente el subtotal.
•	Controlar el estado del pedido.

Estados: PENDIENTE → EN_PREPARACION → ENTREGADO → FINALIZADO

Gestión de platos:
El sistema permitirá:
•	Registrar los platos disponibles.
•	Mostrar el nombre del plato.
•	Mostrar el precio establecido.
•	Utilizar el precio registrado para calcular automáticamente el pedido.

Envío del pedido a cocina:
El sistema permitirá que el mozo confirme el pedido y lo envíe a cocina mediante la función: enviarACocina()

Al realizar esta acción: PENDIENTE → EN_PREPARACION
La cocina será considerada un proceso externo al sistema.

Entrega del pedido:
•	Identificar las mesas disponibles y asociarlas a un pedido.
•	Asociar cada pedido con una mesa determinada.
•	Permitir identificar el pedido mediante el número de mesa.
•	No será necesario registrar información del cliente.

Entrega del pedido:
Una vez que la preparación haya finalizado, el mozo podrá registrar la entrega del pedido mediante: entregarPedido()

El estado cambiará: EN_PREPARACION → ENTREGADO

Generación de la cuenta:
Después de entregar el pedido, el sistema permitirá generar automáticamente la cuenta mediante: generarCuenta()

El sistema calculará:
•	Subtotal.
•	IGV del 18%.
•	Total.

El total será calculado automáticamente y no podrá ser modificado manualmente.
La cuenta comenzará en estado: PENDIENTE

Registro del pago:
El sistema permitirá registrar el pago de una cuenta mediante: registrarPago()

Se considerarán los siguientes métodos:

•	Efectivo.
•	Tarjeta.

Una vez registrado correctamente el pago: PENDIENTE → PAGADO

El pago podrá ser registrado por el mozo o si se implementa dentro del alcance por el cajero.

Cierre del pedido:
Una vez que la cuenta haya sido pagada, el sistema permitirá cerrar el pedido.

Los estados cambiarán a:

•	Pedido → FINALIZADO

•	Cuenta → FINALIZADA

