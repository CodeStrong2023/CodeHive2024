from Producto import Producto

class Orden:
    contador_ordenes = 0

    def __init__(self, productos):
        Orden.contador_ordenes += 1
        self.id_orden = Orden.contador_ordenes
        self._productos = list(productos)


    def agregar_producto(self, producto):
        self._productos.append(producto) #Esto es para agregar un nuevo producto



    def calcular_total(self):
        total = 0 #Variable temporal para almacenar el total temportal
        for producto in self._productos:
            total += producto.precio

        return total

    def __str__(self):
        productos_str = ''
        for producto in self._productos:
            productos_str += producto.__str__() + ' | '
        return f'Orden: {self.id_orden}, \nProductos: {productos_str}'



if __name__ == '__main__':
    producto1 = Producto('Camiseta', 100.00)
    print(producto1)
    producto2 = Producto('Pantalon', 150.00)
    print(producto2)
    productos1 = [producto1, producto2] #Lista de productos
    orden1 = Orden(productos1) #Primer objecto orden pasando la lista de productos
    print(orden1)

    orden2 = Orden(productos1)
    print(orden2)

    #Modificar la orden2 ingresando nuevos productos con sus nombres y precios
    #Crear una nueva lista de productos y agregar a la orden2

    producto3 = Producto('gorra', 50.00)
    producto4 = Producto('Boxer', 164.00)
    producto5 = Producto('bolsa de verduras', 99.00)

    productos2 = [producto3, producto4, producto5]
    orden3 = Orden(productos2)
    print(orden3)



