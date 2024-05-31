import psycopg2 #Esto es para conectarnos a PostgreSQL

conexion = psycopg2.connect(
    user = 'postgres',
    password = '34016357',
    host = '127.0.0.1',
    port ='5432',
    database ='test_bd'
)

# print(conexion)

#Creamos un cursor para correr sentencias de SQL
cursor = conexion.cursor()
sentencia = 'SELECT * FROM persona'

cursor.execute(sentencia) #De esta manera ejecutamos la sentencia
registros = cursor.fetchall() #Recuperamos todos los registros que seran una lista
print(registros)

cursor.close()
conexion.close()
