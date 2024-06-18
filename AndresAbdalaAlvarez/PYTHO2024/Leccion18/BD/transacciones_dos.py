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
    cursor = conexion.cursor()
    sentencia = f"INSERT INTO persona(nombre, apellido, email) VALUES(%s, %s, %s)"
    valores = ('Jorge', 'Prol', 'jprol@mail.com')
    cursor.execute(sentencia, valores)

    sentencia = 'UPDATE persona SET nombre = %s, apellido = %s, email=%s WHERE id_persona = %s'
    valores = ('Juan Carlos', 'Perez', 'jcperez@mail.com', 1)
    cursor.execute(sentencia, valores)

    conexion.commit() # Hacemos el commit manualmente
    print('Termina la transaccion')
except Exception as e:
    conexion.rollback() #Si ocurre un error se va para atras y no guarda el error
    print(f'Ocurrio un error y se hizo un rollback {e}')
finally:
    conexion.close()