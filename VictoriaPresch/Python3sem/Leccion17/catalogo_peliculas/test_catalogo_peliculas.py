from dominio.Pelicula import Pelicula
from servicio.catalogo_peliculas import CatalogoPeliculas as cp

opcion = None
while opcion != 4:
    try:
        print(f'Opciones: ')
        print('1. Agregar Pelicula')
        print('2. Listar Peliculas')
        print('3. Eliminar Catalogo de Peliculas')
        print('4. Salir\n')

        opcion = int(input("Digite una opcionde menu(1-4): "))
        print("")

        if opcion == 1:
            nombre_pelicula = input("Digite el nombre de la pelicula: ")
            pelicula = Pelicula(nombre_pelicula)
            cp.agregar_peliculas(pelicula)
        elif opcion == 2:
            cp.listar_peliculas()
        elif opcion == 3:
            cp.eliminar_peliculas()

    except Exception as e:
        print(f"Ocurrio un error de tipo {e}\n")
        opcion  = None
    else:
        print("Salimos del Programa.....\n")

