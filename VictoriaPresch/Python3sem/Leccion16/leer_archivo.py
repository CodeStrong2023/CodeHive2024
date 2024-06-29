#La letra r es de READ
# try:
#     path = 'C:\\archivos de programas\\.... etc' #esto lo utilizamos si el archivo no esta en la misma carpeta
#     archivo = open('prueba.txt', 'r', encoding='utf8') #No olvidar el encoding
#     #print(archivo.read())
#     # print(archivo.read(16))
#     # print(archivo.read(10)) #Continuamos desde la linea anterior
#     # print(archivo.readline())
# except Exception as e:
#     print(e)

# #Vamos a iterar el archivo, cada una de las lineas
archivo = open('prueba.txt', 'r', encoding='utf8') #No olvidar el encoding
# # for linea in archivo:
#     # print(linea) #iteramos todos los elementos del archivo
#     # print(archivo.readlines()) #Accedemos al archivo como si fuera una lista
#
# print(archivo.readlines()[11]) #accedemos al archivo como si fuera una lista


#---------------------------------------------------------------------
#METODO APPEND

#Anexamos informacion, copiamos a otro
archivo2 = open('copia.txt.', 'a', encoding='utf8')
archivo2.write(archivo.read())
archivo.close()
archivo2.close()

print("Se ha terminado el proceso de leer y copiar archivos")





























