
from Empleado import *
from Gerente import *

def imprimir_detalles(objeto):
    #print(objeto) #De manera indirecta llama al str de la clase Empleado o Gerente
    print(type(objeto)) #Esto es para saber el tipo de dato que recibe
    print(objeto.mostrar_detalles())
    if(isinstance(objeto, Gerente)):
        print(objeto.departamento)


empleado1 = Empleado('Ariel', 500000.0)
imprimir_detalles(empleado1)

gerente1 = Gerente('Natalia', 6000.0, 'Sistemas')
imprimir_detalles(gerente1)

