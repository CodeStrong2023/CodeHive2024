from Cuadrado import Cuadrado
from Rectangulo import Rectangulo
from pythonProject.FiguraGeometrica import FiguraGeometrica

print("Creacion de objeto clase Cuadrado ".center(50,"_"))
cuadrado1=Cuadrado(5,"azul")
cuadrado1._alto=10

print(cuadrado1.ancho)

print(f"El area es: {cuadrado1.calcular_area()}")

#Metodo MRO (Method resolution order)
print(Cuadrado.mro())
print(cuadrado1)

rectangulo1 = Rectangulo(23,8,"Verde")
rectangulo1._ancho=15

print(f"Calculo del area del rectangulo {rectangulo1.calcularArea()}")
print(rectangulo1)

#figura1=FiguraGeometrica() No se puede instanciar una clase abstracta