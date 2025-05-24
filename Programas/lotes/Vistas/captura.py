import customtkinter as ctk
import tkinter as tk
from utils import validateEntero

#Captura de Procesos Programa
class Captura(ctk.CTk):
    def __init__(self):
        super().__init__()

        self.title("ADMINISTRADOR DE LOTES")
        self.geometry("500x350")
        self.captura = {}

        self.titulo = ctk.CTkLabel(self, text="CAPTURA DE PROCESOS", font=ctk.CTkFont(size=20, weight="bold"))
        self.titulo.place(relx=0.5, rely=0.1, anchor=ctk.CENTER)

        self.labelOperacion = ctk.CTkLabel(self, text="Operación a realizar:", fg_color="transparent")
        self.labelOperacion.place(relx=0.3, rely=0.45, anchor=ctk.CENTER)
        self.inputOperacion = ctk.CTkEntry(self, placeholder_text="Operación...",width=200)
        self.inputOperacion.place(relx=0.7, rely=0.45, anchor=ctk.CENTER)

        self.labelTiempo = ctk.CTkLabel(self, text="Tiempo máximo de espera:", fg_color="transparent")
        self.labelTiempo.place(relx=0.3, rely=0.6, anchor=ctk.CENTER)
        self.inputTiempo = ctk.CTkEntry(self, placeholder_text="Tiempo...",width=200)
        self.inputTiempo.place(relx=0.7, rely=0.6, anchor=ctk.CENTER)

        self.btnCapturar = ctk.CTkButton(self, text="Capturar", command=lambda: self.validateCampos())
        self.btnCapturar.place(relx=0.5, rely=0.90, anchor=ctk.CENTER)

    def validateCampos(self):
        operadores = ['+', '-', '*', '/', '%', '^']
        if not any(op in self.inputOperacion.get() for op in operadores):
            tk.messagebox.showerror("ERROR", "Operación inválida.")
            self.inputOperacion.delete(0,"end")
            return
        if not validateEntero(self.inputTiempo.get()):
            self.inputTiempo.delete(0,"end")
            return
        if self.inputTiempo.get() == '0':
            tk.messagebox.showerror("ERROR", "El tiempo debe ser mayor a 0.")
            self.inputTiempo.delete(0,"end")
            return
        self.getCapturaData()
        
    def getCapturaData(self):
        captura = {
            'operacion' : self.inputOperacion.get().replace(" ",""),
            'tiempo_maximo' : int(self.inputTiempo.get())
        }
        self.captura = captura
        self.destroy()



    

