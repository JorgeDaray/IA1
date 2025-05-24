import customtkinter as ctk
from utils import pausarprocesos
import keyboard

# Simulación de Procesos
class SimulacionProcesosTerminados(ctk.CTk):
    def __init__(self):
        super().__init__()

        self.title("PROCESOS TERMINADOS")
        self.geometry("400x800")
        self.procesos_terminados = []  # Lista para almacenar procesos terminados
        self.y_axis = 0.1
        

    def renderizar_procesos(self):
        # Eliminar etiquetas anteriores
        for widget in self.winfo_children():
            if not isinstance(widget, ctk.CTkCanvas):
                widget.destroy()
        self.y_axis = 0.1
        # Renderizar etiquetas de proceso para todos los procesos en la lista
        for proceso in self.procesos_terminados:
            label_proceso = ctk.CTkLabel(self, text=f"Proceso {proceso.no_proceso}:", fg_color="transparent")
            label_proceso.place(relx=0.1, rely=self.y_axis, anchor=ctk.CENTER)

            label_programa = ctk.CTkLabel(self, text=f"Número de Programa: {proceso.numero_programa}", fg_color="transparent")
            label_programa.place(relx=0.3, rely=self.y_axis+0.03, anchor=ctk.W)

            label_tiempo = ctk.CTkLabel(self, text=f"Operación y Datos:  {proceso.operacion}", fg_color="transparent")
            label_tiempo.place(relx=0.3, rely=self.y_axis+0.06, anchor=ctk.W)

            label_resultado_operacion = ctk.CTkLabel(self, text=f"Resultado de operación: {self.evaluar_operacion(proceso.operacion)}", fg_color="transparent")
            label_resultado_operacion.place(relx=0.3, rely=self.y_axis+0.09, anchor=ctk.W)

            self.y_axis += 0.12

    def actualizar_procesos(self, procesos_borrados):
        if keyboard.is_pressed('p'):
            return
        self.procesos_terminados.append(procesos_borrados)  # Agregar el proceso a la lista
        self.renderizar_procesos()

    def evaluar_operacion(self, operacion):
        try:
            if (operacion == "Error"):
                return "Error"
            resultado = eval(operacion)  # Intenta evaluar la operación
        except Exception as e:
            return False
        return resultado