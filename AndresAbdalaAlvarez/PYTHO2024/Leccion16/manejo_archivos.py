#Declaramos una Variable
#-----------------------------------------------------
# Character Meaning
# 'r'
# open for reading (default)
# 'w'
# open for writing, truncating the file first
# 'x'
# create a new file and open it for writing
# 'a'
# open for writing, appending to the end of the file if it exists
# 'b'
# binary mode
# 't'
# text mode (default)
# '+'
# open a disk file for updating (reading and writing)
# 'U'
# universal newline mode (deprecated
#-----------------------------------------------------

try:
    #Puede abrir archivos o si no existe lo crea
    archivo = open('prueba.txt', 'w', encoding='utf8') #La 2 es de WRITE que significa escribir
    archivo.write('Programamos con diferentes tipos de archivos, ahora en txt.\n')
    archivo.write('Los acentos son importantes para las palabras\n')
    archivo.write('Como por ejemplo: acción y producción\n')
    archivo.write('Las letras son: \n\tr = Read, \n\tw = Write, \n\ta = Append, \n\tx = Crea un archivo')
    archivo.write('\n\tt = esta para texto o text, \n\tb = archivos binarios, \n\tw+ = lee y escribe son iguals r+\n')
    archivo.write('Saludos a todos los alumnos de la tecnicatura\n')
    archivo.write('Con esto terminamos')
except Exception as e:
    print(e)
finally: #Siempre se ejecuta
    archivo.close() #Con esto se cierra el archivo








