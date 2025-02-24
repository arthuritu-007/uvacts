class Nodo:
    def __init__(self, titulo_cancion):
        self.titulo_cancion = titulo_cancion
        self.siguiente = None

class ListaEnlazada:
    def __init__(self):
        self.cabeza = None

    def add_cancion(self, titulo_cancion):
        nuevo_nodo = Nodo(titulo_cancion)
        if self.cabeza is None:
            self.cabeza = nuevo_nodo
        else:
            actual = self.cabeza
            while actual.siguiente:
                actual = actual.siguiente
            actual.siguiente = nuevo_nodo

    def print_lista(self):
        actual = self.cabeza
        while actual:
            print(actual.titulo_cancion)
            actual = actual.siguiente

lista = ListaEnlazada()
lista.add_cancion("Canción 1")
lista.add_cancion("Canción 2")
lista.add_cancion("Canción 3")

lista.print_lista()


