
#Clase independiente hereda de la clase Object
class Monitor:

    contador_monitores = 0

    def __init__(self, marca, tamaño):
        Monitor.contador_monitores += 1
        self._idMonitor = Monitor.contador_monitores
        self._marca = marca
        self._tamaño = tamaño


    def __str__(self):
        return f'Id: {self._idMonitor}, Marca: {self._marca}, Tamaño: {self._tamaño}'


#Hacemos las pruebas
if __name__ == "__main__":
    monitor1 = Monitor('HP', '15 pulgadas')
    print(monitor1)
    monitor2 = Monitor('Acer', '32 pulgadas')
    print(monitor2)