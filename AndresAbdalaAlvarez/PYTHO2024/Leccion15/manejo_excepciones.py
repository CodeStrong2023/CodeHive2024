#|-------------->Try Except|<--------------|#
import pprint

resultado = None
a = 10
b = 0

try:
    resultado = a / b
except Exception as e:
    print(f"EL error fue -->|{e}|")

# pprint.pp(f"El resultado es {resultado}")
# pprint.pp("Seguimos.......")

#-------------------------------------------------------------------

resultado = None
a = '10'
b = 0

try:
    resultado = a / b
except TypeError as e:
    print(f"EL error fue -->|{e}|")

# pprint.pp(f"El resultado es {resultado}")
# pprint.pp("Seguimos.......")

#-------------------------------------------------------------------
#Excepciones mas especificas

resultado = None
a = 7
b = 5
try:
    # a = int(input("Digite el primer Numero: "))
    # a = 7
    # b = int(input("Digite el segundo Numero: "))
    # b = 5
    resultado = a / b
except TypeError as e:
    print(f"Ocurrio un error: {type(e)}")
except ZeroDivisionError as e:
    print(f"Ocurrio un error: {type(e)}")
except Exception as e:
    print(f"Ocurrio un error: {type(e)}")


# pprint.pp(f"El resultado es {resultado}")
# pprint.pp("Seguimos.......")

#-------------------------------------------------------------------
#BOLOQUE ELSE es opcional y solo corre si no se ejecuta ninguna excepcion
#El FINALLY siempre se va a ejecutar
# try:
#     a = 5
#     b = 5
#     resultado = a / b
# except TypeError as e:
#     print(f"Ocurrio un error: {type(e)}")
# except ZeroDivisionError as e:
#     print(f"Ocurrio un error: {type(e)}")
# except Exception as e:
#     print(f"Ocurrio un error: {type(e)}")
# else:
#     print(f"No se arrojo ninguna excepcion")
# finally:
#     print(f"Este bloque siempre se ejecuta. BLOQUE FINALLY")

# pprint.pp(f"El resultado es {resultado}")
# pprint.pp("Seguimos.......")

#-------------------------------------------------------------------
#CLASES DE EXCEPCIONES PERSONALIZADAS

from NumerosIgualesException import NumerosIgualesException

try:
    a = 5
    b = 5
    if a == b:
        raise NumerosIgualesException("Son Numeros Iguales") #Funciona de 10!
    resultado = a / b
except TypeError as e:
    print(e)
finally:
    print("Se ejecuto la ultima linea por el finally")