import customtkinter as ctk
from utils import getultimoproceso, pausarprocesos, encolarProceso,deleteProcesos,getProcesoEjecucionObjeto
import keyboard

#Simualación de Procesos
class SimulacionProcesos(ctk.CTk):
    def __init__(self,proceso):
        super().__init__()

        self.title("PROCESO ACTUAL")
        self.geometry("400x400")
        self.proceso = proceso
        self.proceso_original = proceso
        self.y_axis = 0.2
        self.tiempo = 0

        self.renderizar_procesos()
        self.actualizar_tiempo() 


    def renderizar_procesos(self):
        # Eliminar etiquetas anteriores
        for widget in self.winfo_children():
            widget.destroy()
        
        self.titulo = ctk.CTkLabel(self, text=f"PROCESO {self.proceso.no_proceso} EN EJECUCIÓN", font=ctk.CTkFont(size=20, weight="bold"))
        self.titulo.place(relx=0.5, rely=0.1, anchor=ctk.CENTER)

        # Renderizar etiquetas de proceso
        self.y_axis = 0.2

        labelOperacion = ctk.CTkLabel(self, text=f"Operación y datos: {self.proceso.operacion}", fg_color="transparent")
        labelOperacion.place(relx=0.3, rely=self.y_axis+0.05, anchor=ctk.W)

        labelTiempo = ctk.CTkLabel(self, text=f"Tiempo máximo: {self.proceso.tiempo_maximo}", fg_color="transparent")
        labelTiempo.place(relx=0.3, rely=self.y_axis+0.1, anchor=ctk.W)

        labelPrograma = ctk.CTkLabel(self, text=f"Número de Programa: {self.proceso.numero_programa}", fg_color="transparent")
        labelPrograma.place(relx=0.3, rely=self.y_axis+0.15, anchor=ctk.W)

        self.labelTiempoEjecucion = ctk.CTkLabel(self, text="Tiempo en Ejecución: 0", fg_color="transparent")
        self.labelTiempoEjecucion.place(relx=0.3, rely=self.y_axis+0.2, anchor=ctk.W)

        self.labelTiempoRestante = ctk.CTkLabel(self, text=f"Tiempo Restante: {self.proceso.tiempo_maximo}", fg_color="transparent")
        self.labelTiempoRestante.place(relx=0.3, rely=self.y_axis+0.25, anchor=ctk.W)


    def actualizar_tiempo(self):
        self.tiempo += 1
        self.labelTiempoEjecucion.configure(text=f"Tiempo en Ejecución: {self.tiempo}")
        tiempo_restante = self.proceso.tiempo_maximo - self.tiempo
        self.labelTiempoRestante.configure(text="Tiempo Restante:" + str(tiempo_restante)) 
        if keyboard.is_pressed('p'):
            while True:
                if keyboard.is_pressed('c'):
                    break
        if keyboard.is_pressed('e'):
                self.proceso.tiempo_maximo = self.tiempo + 1
                self.proceso.operacion = "Error"
        if keyboard.is_pressed('i'):
                encolarProceso(self.proceso)
                deleteProcesos(self.tiempo,True)
                self.renderizar_procesos()

        self.after(1000, self.actualizar_tiempo)

    def actualizar_procesos(self, nuevos_procesos):
        self.proceso = nuevos_procesos
        self.tiempo = -1
        self.renderizar_procesos()
    