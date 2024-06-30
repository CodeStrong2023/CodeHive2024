#HERENCIA MULTIPLE

from Cuadrado import Cuadrado
from FiguraGeometrica import FiguraGeometrica
from Rectangulo import Rectangulo

print('Creacion de objeto clase Cuadrado'.center(50, '_'))
cuadrado1 = Cuadrado(8, 'Azul')
# cuadrado1.alto = 7
# cuadrado1.ancho = 7

# print(cuadrado1.ancho)
# print(cuadrado1.alto)
print(f'Calculo del area del cuadrado: {cuadrado1.calcular_area()}')
print(cuadrado1)
#MRO = Method Resolution Order
print(Cuadrado.mro())
#-------------------------------------------------------
print('Creacion de objeto clase Rectangulo'.center(50, '_'))
rectangulo1 = Rectangulo(3, 9, 'Verde')
# rectangulo1.ancho = 15
# print(rectangulo1.ancho)
# print(rectangulo1.alto)
print(f'Calculo del area del cuadrado: {rectangulo1.calcular_area()}')
#MRO = Method Resolution Order
print(Rectangulo.mro())
print(cuadrado1)

#No se puede instanciar una clase abstracta
#figura1 = FiguraGeometrica()

#Cuando queremos que no se modifique un objeto por ejemplo la altura y ancho del cuadrado
