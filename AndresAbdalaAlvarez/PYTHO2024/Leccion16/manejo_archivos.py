#Declaramos una Variable

try:
    #Puede abrir archivos o si no existe lo crea
    archivo = open('prueba.txt', 'w') #La 2 es de WRITE que significa escribir
except Exception as e:
    print(e)
finally: #Siempre se ejecuta
    archivo.close() #Con esto se cierra el archivo




