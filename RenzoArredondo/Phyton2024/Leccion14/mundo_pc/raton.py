
from mundo_pc.dispositivo_entrada import *
class Raton(DispositivoEntrada):

    contador_ratones = 0

    def __init__(self, marca, tipo_entrada):
        Raton.contador_ratones += 1
        self._idRaton = Raton.contador_ratones
        super().__init__(marca, tipo_entrada)


    def __str__(self):
        return f'Id: {self._idRaton}, Marca: {self._marca}, tipo Entrada: {self._tipo_entrada}'



#Hacemos pruebas
if __name__ == "__main__":
    raton1 = Raton('HP', 'USB')
    print(raton1)
    raton2 = Raton('Acer', 'Bluetooth')
    print(raton2)