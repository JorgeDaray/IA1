import customtkinter as ctk

#Simualación de Procesos
class SimulacionLote(ctk.CTk):
    def __init__(self,procesos):
        super().__init__()

        self.title("LOTE EN EJECUCIÓN")
        self.geometry("400x400")
        self.procesos = procesos
        self.y_axis = 0.2

        self.renderizar_procesos()

    def renderizar_procesos(self):
        # Eliminar etiquetas anteriores
        for widget in self.winfo_children():
            widget.destroy()

        # Renderizar etiquetas de proceso
        self.y_axis = 0.1
        for i, proceso in enumerate(self.procesos):
            label_proceso = ctk.CTkLabel(self, text=f"Proceso {i+1}:", fg_color="transparent")
            label_proceso.place(relx=0.1, rely=self.y_axis, anchor=ctk.CENTER)

            label_programa = ctk.CTkLabel(self, text=f"Número de Programa: {proceso.numero_programa}", fg_color="transparent")
            label_programa.place(relx=0.3, rely=self.y_axis+0.05, anchor=ctk.W)

            label_tiempo = ctk.CTkLabel(self, text=f"Tiempo Máximo Estimado: {proceso.tiempo_maximo}", fg_color="transparent")
            label_tiempo.place(relx=0.3, rely=self.y_axis+0.1, anchor=ctk.W)
            
            self.y_axis += 0.2

    def actualizar_procesos(self, nuevos_procesos):
        self.procesos = nuevos_procesos
        self.renderizar_procesos()