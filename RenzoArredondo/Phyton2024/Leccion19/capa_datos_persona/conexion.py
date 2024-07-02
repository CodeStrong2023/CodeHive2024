import psycopg2 as bd
from psycopg2 import pool
from logger_base import log
import sys

class Conexion:
    #Variables de clase
    _DATABASE = 'test_bd'
    _USERNAME = 'postgres'
    _PASSWORD = '34016357'
    _DB_PORT = '5432'
    _HOST = '127.0.0.1'
    _MIN_CON = 1 #Minimo de conexiones va a ser 1
    _MAX_CON = 5 #Maximo de conexiones va a ser 5
    _pool = None
    # _conexion = None
    # _cursor = None

    @classmethod
    def obtenerConexion(cls):
        conexion = cls.obtenerPool().getconn()
        log.debug(f'Conexion obtenida del pool: {conexion}')
        return conexion

    # @classmethod
    # def obtenerCursor(cls):
    #     # if cls._cursor is None:
    #     #     try:
    #     #         cls._cursor = cls.obtenerConexion().cursor()
    #     #         log.debug(f"Se abrio correctamente el cursor: {cls._cursor}")
    #     #         return cls._cursor
    #     #     except Exception as e:
    #     #         log.error(f"Ocurrio un error: {e}")
    #     #         sys.exit()
    #     # else:
    #     #     return cls._cursor
    #     pass


    @classmethod
    def obtenerPool(cls):
        if cls._pool is None:
            try:
                cls._pool = pool.SimpleConnectionPool(cls._MIN_CON,
                                                      cls._MAX_CON,
                                                      host=cls._HOST,
                                                      user=cls._USERNAME,
                                                      password=cls._PASSWORD,
                                                      port=cls._DB_PORT,
                                                      database=cls._DATABASE)
                log.debug(f'Creacion del pool exitosamente: {cls._pool}')
                return cls._pool
            except Exception as e:
                log.error(f'Ocurrio un error al obtener el pool: {e}')
                sys.exit()
        else:
            return cls._pool

    @classmethod
    def liberarConexion(cls, conexion):
        cls.obtenerPool().putconn(conexion)
        log.debug(f'Regresamos la conexion del pool: {conexion}')


    @classmethod
    def cerrarConexiones(cls):
        cls.obtenerPool().closeall()


if __name__ == '__main__':
    conexion1 = Conexion.obtenerConexion()
    Conexion.liberarConexion(conexion1)
    conexion2 = Conexion.obtenerConexion()
    Conexion.liberarConexion(conexion2)
    conexion3 = Conexion.obtenerConexion()
    Conexion.liberarConexion(conexion3)
    conexion4 = Conexion.obtenerConexion()
    conexion5 = Conexion.obtenerConexion()
    conexion6 = Conexion.obtenerConexion()