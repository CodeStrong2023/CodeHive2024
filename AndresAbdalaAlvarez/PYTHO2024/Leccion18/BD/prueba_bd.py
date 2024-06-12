import psycopg2 #Esto es para conectarnos a PostgreSQL

conexion = psycopg2.connect(
    user = 'postgres',
    password = '34016357',
    host = '127.0.0.1',
    port ='5432',
    database ='test_bd'
)
#--------------------------------------------------------------------------------------------
# # print(conexion)
# #Creamos un cursor para correr sentencias de SQL
# cursor = conexion.cursor()
# sentencia = 'SELECT * FROM persona'
# cursor.execute(sentencia) #De esta manera ejecutamos la sentencia
# registros = cursor.fetchall() #Recuperamos todos los registros que seran una lista
# print(registros)
# cursor.close()
# conexion.close()
#--------------------------------------------------------------------------------------------

try:
    with conexion:
        with conexion.cursor() as cursor:
            sentencia = 'SELECT * FROM persona WHERE id_persona = %s'
            # id_persona = 2
            id_persona = input("Digite un numero para el id_persona: ")
            # sentencia = 'SELECT id_persona, nombre FROM persona WHERE %s' #Parametro Placeholder o posicional -> %s
            cursor.execute(sentencia, (id_persona,)) #De esta manera ejecutamos la sentencia
            registros = cursor.fetchall() #Recuperamos todos los registros que seran una lista
            # registros = cursor.fetchone() #Nos trae solo 1 registro
            print(registros)
except Exception as e:
    print(f'Ocurrio un error: {e}')
finally:
    conexion.close()





