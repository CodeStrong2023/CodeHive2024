class Persona:

    #Contexto ESTATICO------------------------------
    contador_personas = 0 #Variable de clase

    #Forma correcta de hacerlo
    @classmethod
    def generar_siguiente_valor(cls):
        cls.contador_personas += 1
        return cls.contador_personas

    # Contexto ESTATICO------------------------------

    # Contexto DINAMICO------------------------------
    def __init__(self, nombre, edad):
        # Persona.contador_personas += 1 #Vamos a incrementando
        self.id_persona = Persona.generar_siguiente_valor()
        self.nombre = nombre
        self.edad = edad

    def __str__(self):
        return f'Persona [{self.id_persona} = {self.nombre}, {self.edad}]'
    # Contexto DINAMICO------------------------------

#-----------------------------------------------------------------------------#

persona1 = Persona('Ariel', 40)
persona2 = Persona('Osvaldo', 45)
persona3 = Persona('Liliana', 35)
print(persona1)
print(persona2)
print(persona3)
Persona.generar_siguiente_valor()#El valor aumento
persona4 = Persona('Natalia', 35)
print(persona4)
print(f'Valor contador personas: {Persona.contador_personas}')

