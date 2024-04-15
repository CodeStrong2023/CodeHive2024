#HERENCIA MULTIPLE

from Cuadrado import Cuadrado
from Rectangulo import Rectangulo

cuadrado1 = Cuadrado(5, 'Azul')

print(cuadrado1.ancho)
print(cuadrado1.alto)
print(f'Calculo del area del cuadrado: {cuadrado1.area()}')

#MRO = Method Resolution Order
print(Cuadrado.mro())
#-------------------------------------------------------

rectangulo1 = Rectangulo(3, 8, 'Verde')
print(rectangulo1.ancho)
print(rectangulo1.alto)
print(f'Calculo del area del cuadrado: {rectangulo1.area()}')
#MRO = Method Resolution Order
print(Rectangulo.mro())


print(cuadrado1)