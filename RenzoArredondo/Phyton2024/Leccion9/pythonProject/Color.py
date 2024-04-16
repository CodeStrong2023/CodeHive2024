class Color:
    def __init__(self,color):
        self.color=color

    @property
    def color(self):
        self._color=color

    @color.setter
    def color(self,color):
        self._color=color

    def __str__(self):
        return f"Color: [{self._color}]"