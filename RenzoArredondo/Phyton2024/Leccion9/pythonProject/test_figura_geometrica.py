from Cuadrado import Cuadrado
from Rectangulo import Rectangulo

cuadrado1=Cuadrado(5,"azul")
print(cuadrado1.ancho)
print(cuadrado1.alto)
print(f"El area es: {cuadrado1.calcular_area()}")

#Metodo MRO (Method resolution order)
print(Cuadrado.mro())
print(cuadrado1)

rectangulo1 = Rectangulo(23,8,"Verde")

print(f"Calculo del area del rectangulo {rectangulo1.calcularArea()}")
print(rectangulo1)