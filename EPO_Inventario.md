# Inventario entidades y propiedades

## Entidad absctracta

    Entidad Inventario

    propiedades:
    id: texto
    nombre: texto
    autor: Usuario
    fecha: FechaAccion
    
## FechaAccion

    Entidad FechaAccion 
        fecha Date

        operacinoes
        asignar fecha a las acciones por parte de usuarios
        fecha de creacion
        fecha de actualziacion
        fecha de eliminacion


## Categoria:
Da una clasificacion general para agregar subcategorias,
es creada por el usuario facultado y logeado en el sistema.

    Entidad: Categoria.

    Propiedades: 
    nombre: texto
    //autor: Usuario
    fecha de creacion: FechaAccion 
    coleccion de categorias: array de Categorias

    Operaciones:
    crear 
    actualizar (debe exitistir y estar seleccionada al categoria a actualizar)
    eliminar (debe exitistir y estar seleccionada al categoria a eliminar)
    listar (debe existir por menos una de lo contrario muestra lista vacia y la operacion crear)


## Subcategoria:
Deficnion de subcategoria, asignado a categoria la cual debe existir,
es creado por un usario logeado en el sistema, contendra los insumos.

    Entidad: Subcategoria.

    Propiedades:
    id: texto
    categoria: Categoria
    nombre: texto
    insumos: array de insumos
    autor: usuario
    fecha de creacion: FechaAccion 
    fecha de actualizacion: FechaAccion

    Operaciones:
    crear/asociar (se crea la subcategoria y se asocia a la categoria la cual debe existir de lo contario muestra operacion agregar de categoria)
    actualizar (debe exitistir y estar seleccionada al categoria a actualizar)
    ***eliminar (debe exitistir y estar seleccionada al categoria a eliminar)
    listar (debe existir por menos una de lo contrario muestra lista vacia y la operacion crear)

## Ingrediente: 
Elemento que se agregara al inventario, da las pautas para 
definirlo, esta asociado a una categoria y subcategoria.

    Entidad: Ingrediente

    Propiedades:
    id: texto 
    categoria: Categoria
    subcategoria: Subcategoria
    nombre: texto 
    marca: texto 
    lote: texto 
    fecha de vencimiento: FechaAccion 
    precio: numero
    autor: usuario
    fecha de ingreso: FechaAccion
    fecha de salida: FechaAccion

    Operaciones:
    crear/asociar (debe estar creado, se selecciona la subcatergoria y se asocia, de lo contrario se muestra la operacion crear/asociar de subcategoria)
    actualizar (debe exitistir)
    eliminar (debe exitistir)
    listar (debe existir por menos una de lo contrario muestra lista vacia y la operacion crear)


## Utilitario: 
Elemento que se agregara al inventario, da las pautas para 
definirlo, esta asociado a una categoria.

    Entidad: Utilitario

    Propiedades:
    id: texto 
    categoria: Categoria
    nombre: texto 
    marca: texto 
    lote: texto 
    fecha de vencimiento: FechaAccion 
    precio: numero
    autor: usuario
    fecha de ingreso: FechaAccion
    fecha de salida: FechaAccion

    Operaciones:
    crear/asociar (debe estar creado, se selecciona la categoria  y se asocia, de lo contrario se muestra la operacion crear/asociar de categoria)
    actualizar (debe exitistir)
    eliminar (debe exitistir)
    listar (debe existir por menos una de lo contrario muestra lista vacia y la operacion crear)



