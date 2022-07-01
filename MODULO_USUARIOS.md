# MODULO INVENTARIO:

## Entrada y salida de productos.

Definicion de Niveles de usuarios:
	Administrador: 	Agrega, actualiza y elimina usuarios.
					Crea elimina y actualiza categorias subcategorias e insumos.
					Agrega, resta y modifica elementos del inventario. 

	Encargado: 	Crea elimina y actualiza categorias subcategorias e insumos
				en el sistema
				Agrega, resta y modifica elementos del inventario.  

	Obrador:	Agrega y resta elementos del inventario.


### Gherkin: 

Feature: Usuarios.

	Background:
		Given: Seccion iniciada por el administrador o encargado.
		facultades definidas en el sistema	
	
	Scenario: Crear nivel. 
		Given: Facultades definidas en el sistema
		When se define el nivel y facultades
		Then se muestra nivel creado

	Scenario: modificar nivel. 
		Given: Facultades definidas en el sistema
		When se modifica el nivel
		Then se muestra nivel modificado

	Scenario: eliminar nivel. 
		Given: Facultades definidas en el sistema
		When se elimina el nivel y facultades
		Then se muestra nivel eliminado

	Scenario: Crear usuario.
		Given: nivel de usuario definido
		When se define el usuario y asigna nivel
		Then se muestra datos del usuario y nivel 

	Scenario: Modificar usuario.
		Given: Usuario creado
		When se modifica el usuario
		Then se muestra datos del usuario modificado

	Scenario: Elminar usuario.
		Given: Usuario creado
		When se alimina el usuario
		Then se muestra datos del usuario eliminado