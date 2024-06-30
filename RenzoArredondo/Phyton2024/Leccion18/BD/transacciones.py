import psycopg2 as bd #Renombardo el import
import psycopg2 #Esto es para conectarnos a PostgreSQL

conexion = bd.connect(
    user = 'postgres',
    password = '34016357',
    host = '127.0.0.1',
    port ='5432',
    database ='test_bd'
)

try:
    conexion.autocommit = False #Indicamos que no se guarde de manera automatica
    # conexion.autocommit = True #No es una buena practica
    cursor  = conexion.cursor()
    sentencia = f"INSERT INTO persona(nombre, apellido, email) VALUES(%s, %s, %s)"
    valores = ('Maria', 'Esparza', 'mesparza@mail.com')
    cursor.execute(sentencia, valores)
    print('Termina la transaccion')
    conexion.commit() # Hacemos el commit manualmente
except Exception as e:
    conexion.rollback() #Si ocurre un error se va para atras y no guarda el error
    print(f'Ocurrio un error y se hizo un rollback {e}')
finally:
    conexion.close()