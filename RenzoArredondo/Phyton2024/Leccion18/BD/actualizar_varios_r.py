import psycopg2 #Esto es para conectarnos a PostgreSQL

conexion = psycopg2.connect(
    user = 'postgres',
    password = '34016357',
    host = '127.0.0.1',
    port ='5432',
    database ='test_bd'
)

try:
    with conexion:
        with conexion.cursor() as cursor:
            sentencia = 'UPDATE persona SET nombre=%s, apellido=%s, email=%s WHERE id_persona=%s' #Placeholder
            valores = (
                ('Juan', 'Perez', 'jperez@mail.com', 4),
                ('Romina', 'Ayala', 'rayala@mail.com', 5)) #Tupla de tuplas
            cursor.executemany(sentencia, valores) #De esta manera ejecutamos la sentencia
            registros_actualizados = cursor.rowcount #Recuperamos todos los registros que seran una lista
            print(f"Los registros actualizados son: {registros_actualizados}")

except Exception as e:
    print(f'Ocurrio un error: {e}')
finally:
    conexion.close()