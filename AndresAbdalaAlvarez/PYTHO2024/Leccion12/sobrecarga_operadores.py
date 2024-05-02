import Persona

# SOBRECARGA DE OPERADORES
a = 3
b = 5
print(a + b) #Sumando valores numericos

a = 'hola '
b = 'mundo'
print(a + b) #Concatenando

a = [3, 5, 4]
b = [6, 7, 8, 9]
print(a + b) #Crea una sola lista de las 2 listas

# miObjeto1 + miObjecto2 <----- No se puede hacer porque el operador necesita una sobrecarga
#Para hacerlo hay que modificar el metodo __ad__

persona1 = Persona('Ariel', 40)