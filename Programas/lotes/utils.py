import tkinter as tk
from Modelos.lotes import Lotes
import keyboard

def getultimoproceso(ultimo_proceso):
    lotes = Lotes()._lotes[0]
    if lotes and lotes[0] and lotes[-1].procesos[-1].no_proceso == ultimo_proceso:
        return True
    return False

def validateEntero(numero):
    if numero.isdigit():
        return True
    else:
        tk.messagebox.showerror("ERROR", "Por favor, ingresa un valor entero válido.")
        return False
    
def getProcesos():
    lotes = Lotes()._lotes[0]
    if lotes and lotes[0] and lotes[0].procesos:
        return lotes[0].procesos
    return False

def getProcesosPendientes():
    cont = 0
    lotes = Lotes()._lotes[0]
    for lote in lotes:
        for proceso in lote.procesos:
            cont += 1
    return cont-1 if cont>0 else 0

def deleteProcesos(tiempo,directo=None):
    lotes = Lotes()._lotes[0]
    if lotes and lotes[0] and lotes[0].procesos:
        if lotes[0].procesos[0].tiempo_maximo == tiempo:
            proceso = lotes[0].procesos[0]
            lotes[0].procesos.pop(0)
            return proceso
        elif directo ==True:
            proceso = lotes[0].procesos[0]
            lotes[0].procesos.pop(0)
            return proceso

    
    return False

def getLotesPendientes():
    lotes = Lotes()._lotes[0]
    return str(len(lotes)-1) if len(lotes)>0 else "0"

def getLotesEjecucion():
    lotes = Lotes()._lotes[0]
    if lotes and lotes[0]:
        return str(lotes[0].no_lote)
    return 'Ninguno'


def getProcesoEjecucion():
    lotes = Lotes()._lotes[0]
    if lotes and lotes[0] and lotes[0].procesos:
        return str(lotes[0].procesos[0].no_proceso)
    return 'Ninguno'

def getProcesoEjecucionObjeto():
    lotes = Lotes()._lotes[0]
    if lotes and lotes[0] and lotes[0].procesos:
        return lotes[0].procesos[0]
    if len(lotes) > 1:
        if lotes[1] and lotes[1].procesos:
            return lotes[1].procesos[0]
    return False

def deleteLotes():
    lotes = Lotes()._lotes[0]
    if lotes and lotes[0]:
        if len(lotes[0].procesos) == 0:
            lotes.pop(0)
            return True
    return False

def pausarprocesos():
    # Verifica si se ha presionado la tecla "p" para pausar
    if keyboard.is_pressed('p'):
        print("Bucle pausado. Presiona 'c' para continuar.")
        while not keyboard.is_pressed('c'):
            pass  # Espera hasta que se presione la tecla "c"

def encolarProceso(proceso):
    lotes = Lotes()._lotes[0]
    if lotes and lotes[0]:
        proceso.encolado = True
        lotes[0].procesos.append(proceso)
        return True
    return False

def imprimirProcesos():
    lotes = Lotes()._lotes[0]
    y = 0
    lo = ''
    for x in lotes[0].procesos:
        lo = lo + str(x.no_proceso) + ' '
        y+=1
        print(lo)
