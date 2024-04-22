
#La clase no se carga en memoria hasta que no se instancia por primera vez. Se crea el primer objeto
class Miclase():
    #Variable de clase, este atributo dara a cada objeto el mismo valor
    variable_clase = 'Esta es una variable de clase'

    def __init__(self, variable_instancia):
        self.variable_instancia = variable_instancia

    #Metodo estatico, se asocia a la clase
    @staticmethod
    def metodo_statico(): #No tiene parametro self
        print(Miclase.variable_clase)

    #Metodos de clase
    @classmethod
    def metodo_clase(cls): #Recibe un contexto de clase
        #el parametro cls es una referencia a la clase en si misma. La documentacion recomiendo cls
        print(cls.variable_clase)

    def metodo_instancia(self):
        self.metodo_clase()
        self.metodo_statico()
        print(self.variable_clase)
        print(self.variable_instancia)


#-------------------------------------------------------------------------------------------------------------------#

#La clase de guarda en MEMORIA
print(Miclase.variable_clase)
miClase1 = Miclase('Esta es una variable de instancia')
print(miClase1.variable_instancia)
print(miClase1.variable_clase)
miClase2 = Miclase('Esta es otra prueba de variables de instancia')
print(miClase2.variable_instancia)
print(miClase2.variable_clase)


#No es algo muy comun(se puede realizar porque en python todos los tipos de datos son objetos)
Miclase.variable_clase2 = 'Valor de variable de clase 2'
print(Miclase.variable_clase2)
print(miClase1.variable_clase2)
print(miClase2.variable_clase2)


#Metodos de clase
#1 - Metodos Staticos
#2 - Metodos de clase

#metodo estatico
Miclase.metodo_statico()

#Metodo de clase
Miclase.metodo_clase()

miObjeto1 = Miclase('Variable de instancia')
miObjeto1.metodo_clase()
miObjeto1.metodo_instancia()








