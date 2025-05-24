import random
class Proceso:
  def __init__(self, no):
    operacion=['+','-','*','/','%']
    
    self.operacion = str(random.randrange(0,100)) + str(operacion[random.randrange(0,5)]) + str(random.randrange(0,100))
    self.tiempo_maximo = random.randrange(7,18)
    self.numero_programa = no
    self.no_proceso = no
    self.encolado = False




