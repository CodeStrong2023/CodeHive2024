
from abc import ABC, abstractmethod

class FiguraGeometrica(ABC):
    def __init__(self,ancho,alto):
        if self._validar_valores(ancho):
          self._ancho=ancho
        else:
            self._ancho=0
            print(f"valor erroneo para el ancho {ancho}")
        if  self._validar_valores(alto):
            self._alto=alto
        else:
            self._alto=0
            print(f"valor erroneo para el alto {alto}")

    @property
    def ancho(self):
        return self._ancho


    @ancho.setter
    def ancho(self):
        if self._validar_valores(ancho):
          self._ancho=ancho
        else:
            print(f"valor erroneo para el ancho {ancho}")

    @property
    def alto(self):
        return self._alto

    @alto.setter
    def alto(self):
        if self._validar_valores(alto):
            self._alto
        else:
            print(f"valor erroneo para el alto {alto}")

    @abstractmethod
    def calcular_area(self):
        pass

    def __str__(self):
        return f"figuraGeometrica [ancho: {self._ancho} alto: {self._alto}"

    def _validar_valores(self,valor): #el _ encapsula al metodo
        return True if 0<valor<15 else False


