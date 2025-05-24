import customtkinter as ctk
import keyboard
import threading
import tkinter as tk
from Vistas.simulacionLotes import SimulacionLote
from Vistas.simulacionProcesos import SimulacionProcesos
from Vistas.simulacionTerminados import SimulacionProcesosTerminados
from utils import getLotesPendientes,deleteProcesos,getProcesosPendientes,deleteLotes,getLotesEjecucion, \
getProcesoEjecucion, getProcesos, getProcesoEjecucionObjeto, pausarprocesos, imprimirProcesos

#Simualación de Procesos
class Simulacion(ctk.CTk):
    def __init__(self):
        super().__init__()

        self.title("EJECUCIÓN")
        self.geometry("300x250")
        self.tiempo = -1
        self.tiempo_proceso = -1
        
        lotes_pendientes = getLotesPendientes()
        lotes_ejecucion = getLotesEjecucion()
        procesos_pendientes = getProcesosPendientes()
        procesos_ejecucion = getProcesoEjecucion()
        

        self.titulo = ctk.CTkLabel(self, text="EJECUCIÓN", font=ctk.CTkFont(size=20, weight="bold"))
        self.titulo.place(relx=0.5, rely=0.1, anchor=ctk.CENTER)
        
        self.labelTiempo= ctk.CTkLabel(self, text="Tiempo:", fg_color="transparent")
        self.labelTiempo.place(relx=0.3, rely=0.3, anchor=ctk.CENTER)
        self.labelTiempoV= ctk.CTkLabel(self, text="0" , fg_color="transparent")
        self.labelTiempoV.place(relx=0.6, rely=0.3, anchor=ctk.CENTER)
         
        self.labelLotesPendientes = ctk.CTkLabel(self, text="Lotes Pendientes:", fg_color="transparent")
        self.labelLotesPendientes.place(relx=0.3, rely=0.45, anchor=ctk.CENTER)
        self.labelLotesPendientesV= ctk.CTkLabel(self, text=lotes_pendientes , fg_color="transparent")
        self.labelLotesPendientesV.place(relx=0.6, rely=0.45, anchor=ctk.CENTER)

        self.labelLotesEjecucion = ctk.CTkLabel(self, text="Lotes en Ejecución:", fg_color="transparent")
        self.labelLotesEjecucion.place(relx=0.3, rely=0.6, anchor=ctk.CENTER)
        self.labelLotesEjecucionV= ctk.CTkLabel(self, text=lotes_ejecucion , fg_color="transparent")
        self.labelLotesEjecucionV.place(relx=0.6, rely=0.6, anchor=ctk.CENTER)

        self.labelProcesosPendientes = ctk.CTkLabel(self, text="Procesos Pendientes:", fg_color="transparent")
        self.labelProcesosPendientes.place(relx=0.3, rely=0.75, anchor=ctk.CENTER)
        self.labelProcesosPendientesV= ctk.CTkLabel(self, text=procesos_pendientes , fg_color="transparent")
        self.labelProcesosPendientesV.place(relx=0.6, rely=0.75, anchor=ctk.CENTER)

        self.labelProcesosEjecucion = ctk.CTkLabel(self, text="Proceso en Ejecución:", fg_color="transparent")
        self.labelProcesosEjecucion.place(relx=0.3, rely=0.9, anchor=ctk.CENTER)
        self.labelProcesosEjecucionV= ctk.CTkLabel(self, text=procesos_ejecucion , fg_color="transparent")
        self.labelProcesosEjecucionV.place(relx=0.6, rely=0.9, anchor=ctk.CENTER)
        self.actualizar_tiempo()

        
        self.thread_lote = threading.Thread(target=self.abrir_simulacion_lote)
        self.thread_proceso = threading.Thread(target=self.abrir_simulacion_proceso)
        self.thread_terminados = threading.Thread(target=self.abrir_simulacion_terminados)

        self.thread_lote.start()
        self.thread_proceso.start()
        self.thread_terminados.start()
        
    def abrir_simulacion_lote(self):
        self.pantallaSimulacionLote = SimulacionLote(getProcesos())
        self.pantallaSimulacionLote.mainloop()

    def abrir_simulacion_proceso(self):
        self.pantallaSimulacionProceso = SimulacionProcesos(getProcesoEjecucionObjeto())
        self.pantallaSimulacionProceso.mainloop()
    
    def abrir_simulacion_terminados(self):
        self.pantallaSimulacionTerminados= SimulacionProcesosTerminados()
        self.pantallaSimulacionTerminados.mainloop()

    def actualizar_tiempo(self):
        self.tiempo += 1
        self.tiempo_proceso += 1
        self.labelTiempoV.configure(text=str(self.tiempo))
        if keyboard.is_pressed('p'):
            while True:
                if keyboard.is_pressed('c'):
                    break
        self.actualizar_procesos()
        self.actualizar_lotes()
        self.after(1000, self.actualizar_tiempo)
        
    def actualizar_procesos(self):
        imprimirProcesos()
        procesos_pendientes = getProcesosPendientes()
        proceso_ejecucion = getProcesoEjecucion()
        proceso_objeto = getProcesoEjecucionObjeto()
        self.labelProcesosPendientesV.configure(text=str(procesos_pendientes))
        self.labelProcesosEjecucionV.configure(text=str(proceso_ejecucion))
        borro_proceso = deleteProcesos(self.tiempo_proceso)
        if borro_proceso:
            self.pantallaSimulacionTerminados.actualizar_procesos(borro_proceso)
            if keyboard.is_pressed('c'):
                self.pantallaSimulacionTerminados.actualizar_procesos(borro_proceso)
            if getProcesoEjecucionObjeto():
                self.pantallaSimulacionProceso.actualizar_procesos(getProcesoEjecucionObjeto())
            self.tiempo_proceso = 0
        if proceso_objeto.encolado == True:
            proceso_objeto.encolado = False
            self.tiempo_proceso = 0
        imprimirProcesos()

    def actualizar_lotes(self):
        lotes_pendientes = getLotesPendientes()
        lote_ejecucion = getLotesEjecucion()
        self.labelLotesPendientesV.configure(text=str(lotes_pendientes))
        self.labelLotesEjecucionV.configure(text=str(lote_ejecucion))
        borro_lotes = deleteLotes()
        if borro_lotes and getProcesos():
            self.pantallaSimulacionLote.actualizar_procesos(getProcesos())
            self.tiempo_proceso = 0




        