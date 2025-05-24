import tkinter as tk
import customtkinter as ctk
from Vistas.inicio import Inicio
from Vistas.captura import Captura
from Vistas.simulacion import Simulacion
import Modelos.lotes as lotes
from Modelos.procesos import Proceso
import time


#Temas y Colores
ctk.set_appearance_mode("dark")  # Modes: system (default), light, dark
ctk.set_default_color_theme("green")  # Themes: blue (default), dark-blue, green

#Lotes
capacidad = 3
lotes_a = []

#Pantalla de Inicio para obtener el total de procesos
pantallaInicio = Inicio()
pantallaInicio.mainloop()
procesos = pantallaInicio.procesos #3

#Contadores de procesos y lotes
contador_procesos = 0
contador_lotes = 0

#Proceso para capturar Lotes y Procesos
while procesos != contador_procesos:

    #Se obtiene un lote de 3 procesos en lotes cada 3 procesos
    if contador_procesos % capacidad == 0:
        if contador_procesos > 0:
            lotes_a.append(lote)
        #Se genera un lote nuevo para cada 5 procesos o cuando no es el primer proceso
        lote = lotes.Lote(capacidad)
        contador_lotes = contador_lotes + 1 
        lote.no_lote = contador_lotes
    
    #Se crea el proceso con los datos ya validados de la captura
    contador_procesos +=1
    proceso = Proceso(contador_procesos)
    #Se añade el proceso a su lote correspondiente
    lote.procesos.append(proceso)
    
#Se agrega el lote pendiente a lotes
lotes_a.append(lote)

#Se crea una instancia singleton de lotes con todos lotes
lotes_o = lotes.Lotes(lotes_a)

#Proceso para manejar el tiempo
pantallaSimulacion = Simulacion()
pantallaSimulacion.mainloop()  






