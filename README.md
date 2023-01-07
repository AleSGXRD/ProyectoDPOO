#                                                                    Empresa Taxista
<img src ="https://raw.githubusercontent.com/AleSGXRD/ProyectoDPOO/main/Documentacion/Icon.png">

## Proyecto de segundo semestre de la carrera Ingeniería Informática
## Proyecto Final de Curso “TaxiExpress”.
### “TaxiExpress” es un proyecto para crear e implementar fácilmente un sistema de transporte capacitado y especializado en el transporte de personas, a través de agentes conocidos como taxistas, logrando que el cliente llegue a su destino con gran rapidez, alcanzando así la satisfacción de nuestros clientes. Nuestra aplicación está desarrollada para brindarles a los usuarios que decidan escoger nuestros servicios, un fácil acceso, un servicio de excelencia y unas tarifas asequibles.


# Medios:


- Lenguaje de programacion:Java


- Arquitecturas:Capas


- IDE:Netbeans

# Integrantes:
* [Alejandro Sánchez González](https://github.com/AleSGXRD/)
* [Alejandro Javier Arevalo Millian](https://github.com/AlejandroXRD)
* [Carlos Erick Rodríguez de la Cruz](https://github.com/KzMikha)
* [Ernesto Quesada](https://github.com/ernestoQG)
* [Yordan David Bell Caballero](https://github.com/yordanbell)

# Informacion del proyecto:

## Alejandro Sánchez González

El módulo a desarrollar por mí fue el del administrador.

El administrador contiene un rol excepcional en la empresa ya que, gracias a él, se controla tanto la información que el orden dentro de ella y el orden de turnos de los trabajadores, y así no dejar este orden a los usuarios o trabajadores.

El modulo administrador se desarrolla en otro plano de la aplicación donde solo puede acceder quienes tengan control de la aplicación y el tráfico por parte de la empresa. En la carpeta aplicación esta diferenciadas, a través de sus respectivas carpetas, la app para el administrador y para los clientes u trabajadores.

Al entrar abrir la app para administrador se le mostrara una interfaz con el nombre de la empresa, el dinero recaudado hasta ese momento, y tres botones:

1-Crear una nueva sesión Trabajador:

Para controlar la cantidad de usuarios trabajadores, y no dejarle un libre tratamiento de ello a cualquier persona, se hace necesario que la información de los trabajadores sea controlada por un administrador de la misma empresa, para ello, es desarrollada esta interfaz para poder crear usuario a los respectivos trabajadores contratados por la empresa y así que ellos puedan interactuar con los usuarios y trabajar cómodamente.

Al pulsar dicho botón, mostrara una nueva interfaz con un formulario para llenar, con el nombre, apellido, carnet de identidad y dirección del trabajador.

Al introducir su carnet de identidad deberá fijarse si esta correcto o en el caso contrario no permitirá crear su usuario.

Usted deberá seguir estas limitaciones:
-El carnet de identidad este compuesto por solo números.
-Este está formado por únicamente 11 dígitos (ni más, ni menos).
-Cada persona tiene su Carnet de identidad propio, asegúrese de que no coincida con otro usuario.

Además, tendrá que rellenar una cuenta de usuario para ese trabajador y asignarle que tipo de trabajador es el que registra.

Para salir de esta pestaña solo deberá pulsar el botón X en la esquina superior derecha (OJO no me refiero al botón en de la pestaña de la aplicación).

2-Dar de alta Usuario:

En determinados momentos habrá trabajadores o clientes que se saldrán de la empresa, en este caso se desarrollo una interfaz para eliminar sus datos y no estar sobrecargando la empresa con tanta información innecesaria, y para ello la interfaz a la que conducirá este botón.

Al pulsar el botón se accederá a una nueva ventana de interfaz donde podrás seleccionar el tipo de usuario q desea expulsar, seleccionar un tipo, la lista debajo que son los usuarios de este tipo cambiaran dependiendo del tipo seleccionado, y a la derecha usted tiene un botón para expulsar al usuario, pero CUIDADO, una vez borrada la información no habrá vuelta atrás.

Para salir de esta pestaña solo deberá cerrarla.

3-Modificar turnos Trabajador:

Que los trabajadores tengan un turno por los que estén obligados a trabajar es de vital importancia, ya que sin un orden la empresa tendría horarios muertos y no podemos dejar que esto ocurra, los clientes deben sentirse contentos con nuestra atención, así que es muy importante que cuando un cliente quiera pedir un taxi haiga siempre una disponibilidad para todos. Por este motivo es creada esta interfaz en la que el administrador podrá registrar los turnos de cada, así como eliminar los turnos de días pasados para que no se acumulen sin necesidad, es importante tener en cuenta que los turnos están compuestos por 3 elementos (Dia, Hora de Comienzo, Hora de Culminación).

Al pulsar el botón se accederá a una nueva ventana de interfaz donde primero deberá escoger el tipo de trabajador, después el trabajador que desea asignarle turnos, y después la interfaz contiene un botón para agregar turno, una vez añadido este usted debe rellenarlo, asegúrese dejar todos rellenados y seguir el formato indicado hh:mm en cada una de las casillas referentes a horarios, y en cuanto a los días simplemente escribir un día de la semana en él.

Como podrá ver cada turno tiene una última casilla donde puedes marcar y desmarcar, ¿cómo funciona ello? Debajo de la tabla podrá ver un botón de borrar turnos, al tocar este botón se borrarán todos aquellos turnos que contengan la última casilla marcada, de esta manera podrá borrar aquellos turnos de días pasados, y de esta manera no acumular tantos turnos.

Una vez terminado de introducir todos los turnos deseados, asegúrese de pulsar el botón de guardar (no cambie de trabajador sin pulsar este botón o no se le guardara ningún cambio que haiga hecho).
Para salir de esta pestaña solo deberá cerrarla.

## Carlos Erick Rodríguez de la Cruz

En esta parte estaré hablando sobre las interfaces de acceso [View.Acceso], además de la interfaz para leer mensajes [View], 
la gestión de cuentas, la gestión de mensajes y la gestión de billetera.

En primer lugar, las interfaces de acceso:

-Tenemos la interfaz "Portal" la cual nos presenta el menú inicial donde tenemos 4 pestaña
con las cuales el usuario puede interactuar:
 
 1-"Iniciar Sesión" la cual te lleva a la interfaz de acceso de la cual hablare más adelante.
 
 2-"Ver Sesiones" que permite al usuario visualizar precisamente eso.

 3-"Registrarse" que dirige al usuario a la interfaz de registro en caso de que este no tenga cuenta y deba registrarse.

 4-"Salir" para cerrar el menú inicial y salir del programa

-Tenemos una interfaz de "Acceso" como mencione anteriormente, en esta encontramos dos campos 
que el usuario deberá llenar una con su nombre de usuario y otro con su contraseña, luego da click en el botón
"Acceder" y si el usuario tiene una cuenta registrada en la base de datos del programa podrá acceder a este y ver 
diferentes opciones que puede realizar, en caso de que los datos introducidos sean incorrectos o no se encuentren 
guardados en la base de datos porque no se tiene una cuenta se mostrará un error, en este caso el usuario debe verificar
que introdujo correctamente los datos y si no se ha registrado aun, debe hacerlo.

-Tenemos la interfaz de "RegistroDeCliente" en la cual el usuario deberá llenar varios campos referentes a este, como su Nombre,
Apellido, Carnet de Identidad(CI)(en este caso se debe introducir un numero de 11 dígitos, no menos ni más, de lo contrario
dará un error al usuario), Dirección, Edad, Usuario y Contraseña, una vez llenado todos los campos se da click en el botan de
"Registrarse" y se guardara la información en la base de datos del programa creándose la cuenta del usuario, es importante llenar
todos los campos que aparecen en la interfaz de lo contrario si el usuario intenta registrarse dejando alguno vacío, no podrá hacerlo 
y se le enviara un mensaje pidiendo que llene todos los campos.

-Por último, la interfaz "VerSesiones" que como bien indica el nombre le permite al usuario visualizar sus accesos al programa.

-La interfaz "LeerMensajes", podemos entrar en ella una vez se accede a la cuenta, esta nos muestra un mensaje o notificación que halla 
sido recibido por el usuario, en caso de que sean más de uno podemos alternar o ver los demás utilizando los botones que podremos apreciar 
a los lados de la interfaz de notificaciones, una vez leídos cuando salgamos de esta interfaz los mensajes serán borrados para preservar el
espacio en memoria.

Gestión de Cuentas:
-Esta se encargará en resumen de guardar, cargar, leer, buscar y eliminar los datos de las cuentas creadas por los usuarios,
cuando un usuario se va a registrar se busca en la base de datos que no haya una cuenta igual ya guardada, en este caso no podrá 
registrarse, si no tiene problemas, el usuario introduce los datos que se le piden y se registra, estos datos se guardan en la base 
de datos. Cuando se vaya a acceder, se introduce el usuario y la contraseña y se busca en la base de datos si hay alguna cuenta con
estos datos guardados, en caso de existir se carga esta y el usuario puede acceder a su cuenta, si no se encuentra cuenta con estos 
datos el usuario debe registrarse. Además el administrador desde su interfaz de gestión de cuentas puede eliminar las cuentas que desee.

Gestión de Mensajes:
-La gestión de mensajes permite guardar, cargar y eliminar los mensajes y notificaciones que se generen. Estos al enviarse ya sea por 
realizarse una transacción, enviar un SOS (los SOS pueden ser enviados por los taxistas que estén en problemas, este será enviado a todos 
los taxistas) o darse por cumplida una tarea son guardados utilizando el carnet de identidad para identificar al usuario al cual fueron enviados,
al iniciar sesión si hay algún mensaje guardado usando el CI del usuario en cuestión para identificarse, estos se cargan y el usuario podrá verlos 
en la interfaz propia de sus notificaciones, una vez vistos, al salir de esta interfaz los mensajes son borrados automáticamente decisión que se 
tomo para evitar la acumulación de estos y ahorrar el espacio en memoria.     

Gestión de Billetera
-Nuestro programa tiene una clase billetera la cual funciona como una pequeña cuenta bancaria, tiene un entero para la cantidad de dinero que tenga
y una dirección para identificarla, a esta el cliente le asigna cierta suma de dinero, el cual podrá utilizar para pagar el servicio prestado por la
empresa, una vez hecho esto se retira la suma correspondiente al precio del servicio de la billetera del cliente, una vez completado dicho pedido, el 
pago se reparte entre la empresa, el taxista y el operador en servicio, esta clase implementa una interfaz Gestión de Billetera la cual se encarga de
guardar y cargar la información referente a la billetera cada vez que esta se modifique ya sea por haber retirado dinero o haberse agregado este, todas 
las billeteras excepto la de la empresa la cual tiene como dirección Empresa.bin se guardan con la dirección de carnet.bin.

## Ernesto Quesada

Mi modulo a desarrollar fue el de cliente.

El cliente la persona más indispensable para el sostén de la empresa, sin él no se podría llevar a cabo la empresa, por lo que esta se disolvería, dejando sus sueños atrás. 

Dado este motivo es creada la interfaz del cliente con el propósito de que este pueda interactuar con los trabajadores de la empresa de manera eficiente y cómoda.
Al iniciar sesión con una cuenta de cliente se abrirá una nueva interfaz que solo pueden acceder los clientes de la empresa, en ella podrá presenciar el nombre del cliente que la usa en ese momento, también se mostrara el dinero actual que posee el cliente en su billetera, un botón para las notificaciones que sean enviada por la empresa al cliente, un botón llamado “Ver Sesiones” para poder el usuario en caso de tener una cuenta más cambiar en cualquier momento, un rectángulo blanco con bordes negro donde se le mandara un mensaje de aviso si los procedimientos hechos están bien, o si tuvo algún error (como por ejemplo que haiga intentado hacer un pedido y no tenga dinero para ello),  también este posee un botón llamado “PedirServicio”  donde se conducirá a la interfaz de los servicios que puede realizar el cliente en la empresa y a su derecha el precio actual por el que se rige la empresa para el cliente realizar un pedido.

El botón “PedirServicio” dicho anteriormente al pulsarlo le llevara a una ventana nueva con dos botones más estos son “Pedir Taxi”, y otro botón llamado “Gestionar Dinero”.
“Pedir Taxi”:
Este botón al ser pulsado se cerrará la ventana actual, conducirá a la ventana del cliente y se le mandara un mensaje de aviso en verde afirmando que se ha enviado el pedido con éxito, este pedido se le mandara a la empresa está la almacena en su bandeja de pedidos sin procesar que deberá ser procesada por el operador para asignársela a un taxista cerca y que el taxista pueda realizar su trabajo.

En caso de que repita este proceso y su envió aun este en la bandeja se le advertirá que ya su pedido está siendo procesado por favor espere un momento.

En caso de que no haiga un taxista trabajando es devuelto el dinero al cliente y se mandan las más sinceras disculpas desde la empresa, tratando de que el cliente no se moleste por no poder viajar gracias a nosotros en ese preciso momento.

“Gestionar Dinero”:
Este botón al ser pulsado se abrirá una pestaña de interfaz nueva donde se le mostrará su dinero actual, un campo para rellenar para introducir el monto deseado a recargar a su billetera en la empresa y dos botones “Depositar” para recargar su cuenta, “Retirar” para si quiere retirar a su tarjeta en caso de que necesite el dinero.

Esta parte al no tener una conexión directa con alguna billetera, se dejó libre de uso para en algún futuro, teniendo licencias para poder manipular el dinero desde nuestra app implementar como debe ser el dinero que circula en la empresa.

Pero OJO, no es tan libre siempre hay requisitos:
1-El monto máximo que podrá tener el cliente son 100000.
2-Si intenta extraer más dinero del que posee el programa te advertirá que no tiene suficiente dinero en la cuenta para extraer ese monto.
3-El campo a rellenar no puede tener letras, solo números o se le advertirá haber rellenado el campo de manera errónea.

Al cerrar esta pestaña serán guardados los cambios en la tarjeta del cliente así que no se preocupe por perder los datos cambiados.

## Alejandro Javier Arevalo Millian

El fragmento desarrollado por mí del proyecto fue todo lo relacionado con el Taxista.
Una vez que nuestra empresa contrata un taxista, el administrador procede a crearle una cuenta en nuestra aplicación. 

Ya creada la cuenta, el taxista puede iniciar sesión en nuestra plataforma y atender los pedidos realizados por los clientes.

Al iniciar nuestra aplicación luego que el taxista inicie sesión la pantalla nos mostrara el panel del taxista que este indica su nombre, el dinero que posee y 7 botones que realizan las siguientes funciones:

1.	Ver Sesión: Este botón lleva al panel de sesiones donde se mostrarán todas las sesiones iniciadas. Una vez seleccionado este botón saldrá un nuevo panel en que mostrará 3 nuevos botones.

1.1	Abrir sesión que es para en caso de que se desee cambiar la sesión actual (esta opción es para todos).
1.2	Iniciar sesión que es para loguearse en otra cuenta.
1.3	Cerrar sesión que es para cerrar algunas o todas las sesiones que se hayan logueado.

2.	Ver Turnos: Esta función es solo para trabajadores de la empresa, este botón es utilizado por el taxista para ver los turnos que se le ha asignado a trabajar.

3.	Notificaciones: Este botón con un signo de exclamación como su nombre indica es para las notificaciones que reciba el taxista, en la parte baja de este hay un contador que muestra la cantidad de notificaciones que sean recibidas, una vez se haya leído las mismas se borran automáticamente por el sistema. En caso de que un taxista este pidiendo un SOS este botón alumbrara en rojo, hasta que sea visto por el trabajador.

4.	Estado del trabajador: Este botón muestra el estado en que se encuentra el taxista, si este botón se encuentra de color verde es que está trabajando, en caso de que se encuentre de color blanco este significa que no está cumpliendo con ningún turno por tanto no está trabajando.

5.	Mapa: Una vez que nuestro trabajador se encuentre realizando algún pedido es de suma importancia que posea un mapa pues con este logra ubicarse, saber la distancia que le falta para llegar a su destino o para conocer su ubicación actual. Este botón muestra la localización de nuestro trabajador junto con el mapa del lugar donde se encuentre.

6.	S.O.S: Este botón como su nombre indica es utilizado por el trabajador en caso de que esta sufra un accidente, una avería en el vehículo, o algún otro impedimento que no lo permita continuar con el trabajo que esté realizando. Este botón tiene también como función enviar una notificación a todos los taxistas que se encuentren en ese momento trabajando, con el nombre del taxista que este solicitando el SOS, la fecha, la hora y la dirección en que se encuentra actualmente para ser auxiliado por sus compañeros.

7.	Pedido: Este botón es utilizado por el taxista para recibir los pedidos realizados por los clientes, en cuanto el taxista recibe un pedido este le pone el nombre del cliente y la dirección, el taxista puede aceptar o rechazar un pedido que le hayan realizado. En cuanto el taxista acepta un pedido, la aplicación notifica al mismo trabajador con el siguiente mensaje “Aceptaste un pedido, asegúrate de cumplirlo”. Una vez realizado el pedido se mostrará el botón como hecho, cuando lo toques el taxista recibirá el 20% del coste del pedido y se le notificara que recibió el dinero. Si no mandan un pedido la opción de Pedido permanecerá vacía, hasta que se soliciten sus servicios.




# Enlaces:
## Diagrama UML:
- https://cacoo.com/diagrams/pKzQeZv4A1JZYpcH/60E47
## GitHub:
- https://github.com/AleSGXRD/ProyectoDPOO/
