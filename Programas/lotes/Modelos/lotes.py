class Lote:
  def __init__(self,capacidad):
    self.capacidad = capacidad
    self.procesos = []
    self.no_lote = 0

class Lotes:
    _instancia = None
    _lotes = None
    def __new__(cls, *args, **kwargs):
        if cls._instancia is None:
            cls._lotes = args
            cls._instancia = super().__new__(cls)
        return cls._instancia

   

