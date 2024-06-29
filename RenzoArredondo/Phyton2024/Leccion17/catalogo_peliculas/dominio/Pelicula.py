class Pelicula:

    def __init__(self, nombre):
        self._nombre = nombre #ENCAPSULADO


    def __str__(self):
        return f"Pelicula: {self._nombre}"

    # --------------->GETTER
    @property
    def nombre(self):
        return self._nombre

    # --------------->SETTER
    @nombre.setter
    def nombre(self, nombre):
        self._nombre = nombre




