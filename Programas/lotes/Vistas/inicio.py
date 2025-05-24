import customtkinter as ctk
from utils import validateEntero


#Inicio Programa (Procesos)
class Inicio(ctk.CTk):
    def __init__(self):
        super().__init__()

        self.title("ADMINISTRADOR DE LOTES")
        self.geometry("300x200")
        self.procesos = 0

        self.labelProcesos = ctk.CTkLabel(self, text="Ingrese el número total de procesos:", fg_color="transparent")
        self.labelProcesos.place(relx=0.5, rely=0.25, anchor=ctk.CENTER)

        self.inputProcesos = ctk.CTkEntry(self, placeholder_text="",width=60)
        self.inputProcesos.place(relx=0.5, rely=0.4, anchor=ctk.CENTER)

        self.btnProcesos = ctk.CTkButton(self, text="Ingresar", command=lambda: self.setProcesos())
        self.btnProcesos.place(relx=0.5, rely=0.6, anchor=ctk.CENTER)

    def setProcesos(self):
        if validateEntero(self.inputProcesos.get()):
            self.procesos = int(self.inputProcesos.get())
            self.destroy()
        else:
            self.inputProcesos.delete(0,"end")
