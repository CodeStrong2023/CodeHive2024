class FiguraGeometrica:
    def __init__(self,ancho,alto):
        self._ancho=ancho
        self._alto=alto

    @property
    def ancho(self):
        return self._ancho

    @ancho.setter
    def ancho(self):
        self._ancho=ancho

    @property
    def alto(self):
        return  self._alto

    @alto.setter
    def alto(self):
        self._alto=alto

    def __str__(self):
        return f"figuraGeometrica [ancho: {self._ancho} alto:{self._alto}"