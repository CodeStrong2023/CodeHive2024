import sqlite3

miConexion=sqlite3.connect("Base de datos")

miCursor=miConexion.cursor()

miCursor.execute("CREATE TABLE PERSONAS(NOMBRE_PERSONA VARCHAR(50),APELLIDO VARCHAR (50),SECCION VARCHAR(20))")

