from Color import Color
from FiguraGeometrica import FiguraGeometrica


class Cuadrado(FiguraGeometrica,Color):
    def __int__(self, lado, color):
       # super.__init__(lado)
FiguraGeometrica.__init__(self,lado,lado)
Color.__int__(self, color)

def calcular_area(self):
    return self.alto * self.ancho

