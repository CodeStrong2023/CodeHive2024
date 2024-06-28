from monitor import Monitor
from dispositivo_entrada import DispositivoEntrada
from mundo_pc.orden import Orden
from raton import Raton
from teclado import Teclado
from computadora import Computadora


teclado1 = Teclado('HP', 'USB')
monitor1 = Monitor('HP', '15 pulgadas')
raton1 = Raton('HP', 'USB')
computadora1 = Computadora('HP', monitor1, teclado1, raton1)

teclado2 = Teclado('Acer', 'USB')
monitor2 = Monitor('Acer', '15 pulgadas')
raton2 = Raton('Acer', 'USB')
computadora2 = Computadora('Acer', monitor2, teclado2, raton2)

computadoras1 = [computadora1, computadora2]

orden1 = Orden(computadoras1)
print(orden1)

# -----------> Crear orden 2 con 2 computadoras con sus respectivos dispositivos

teclado3 = Teclado('Samsung', 'USB')
monitor3 = Monitor('Samsung', '15 pulgadas')
raton3 = Raton('Samsung', 'USB')
computadora3 = Computadora('Samsung', monitor3, teclado3, raton3)

teclado4 = Teclado('Gamer', 'USB')
monitor4 = Monitor('Gamer', '15 pulgadas')
raton4 = Raton('Gamer', 'USB')
computadora4 = Computadora('Gamer', monitor4, teclado4, raton4)

computadoras2 = [computadora3, computadora4]
computadoras3 = [computadora1, computadora2, computadora3, computadora4]

orden2 = Orden(computadoras2)
print(orden2)
orden3 = Orden(computadoras3)
print(orden3)

orden1.agregar_computadoras(computadora3)
print(orden1)