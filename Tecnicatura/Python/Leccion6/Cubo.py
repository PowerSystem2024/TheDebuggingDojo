class Cubo:
    """
    Crear la clase Cubo con los atributos, ancho, alto y profundidad.
    Con un método calcular_volumen que tendrá la fórmula: volumen = ancho * altura * profundidad
    Que el usuario debe ingresar.
    """
    def __init__(self, ancho, alto, profundidad):
        self.ancho = ancho
        self.alto = alto
        self.profundidad = profundidad

    def cacular_volumen(self):
        return self.ancho * self.altura * self.profundidad

ancho = int(input('Digite el ancho del cubo: '))
altura = int(input('Digite la altura del cubo: '))
profundidad = int(input('Digite la profundidad del cubo:  '))

cubo1 = Cubo(ancho, altura, profundidad)
print(f'El volumen del cubo es: {cubo1.cacular_volumen()}')