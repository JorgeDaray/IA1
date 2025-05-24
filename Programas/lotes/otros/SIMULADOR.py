import time
import tkinter as tk
from tkinter import messagebox, simpledialog

class Proceso:
    def __init__(self, nombre_programador, operacion, datos, tiempo_maximo, num_programa):
        # Constructor de la clase Proceso
        self.nombre_programador = nombre_programador
        self.operacion = operacion
        self.datos = datos
        self.tiempo_maximo = tiempo_maximo
        self.num_programa = num_programa
        self.tiempo_transcurrido = 0

    def ejecutar(self):
        # Método para ejecutar el proceso
        try:
            resultado = eval(self.operacion)  # Intenta evaluar la operación
            print(f"Proceso {self.num_programa}: Resultado de {self.operacion}: {resultado}")
        except Exception as e:
            print(f"Proceso {self.num_programa}: Error al ejecutar la operación: {e}")

class Lote:
    def __init__(self):
        # Constructor de la clase Lote
        self.procesos = [1]

    def agregar_proceso(self, proceso):
        # Método para agregar un proceso al lote
        self.procesos.append(proceso)

    def ejecutar(self):
        # Método para ejecutar todos los procesos en el lote
        for proceso in self.procesos:
            proceso.ejecutar()

class Simulador:
    def __init__(self, root):
        # Constructor de la clase Simulador
        self.root = root
        self.root.title("Simulador de Procesos")
        self.lotes_pendientes = []  # Lista para almacenar lotes pendientes
        self.lote_en_ejecucion = None  # Lote en ejecución actual
        self.procesos_terminados = []  # Lista para almacenar procesos terminados
        self.contador_global = 0  # Contador global para el tiempo

        self.label_info = tk.Label(root, text="", justify=tk.LEFT)  # Etiqueta para mostrar información
        self.label_info.pack()

        self.capturar_procesos_btn = tk.Button(root, text="Capturar Procesos", command=self.capturar_procesos)
        self.capturar_procesos_btn.pack()

        self.iniciar_simulacion_btn = tk.Button(root, text="Iniciar Simulación", command=self.ejecutar_simulacion)
        self.iniciar_simulacion_btn.pack()

    def capturar_procesos(self):
        # Método para capturar la información de los procesos desde el usuario
        n_procesos = int(simpledialog.askstring("Capturar Procesos", "Introduce el número de procesos:"))
        for _ in range(n_procesos):
            nombre_programador = simpledialog.askstring("Capturar Proceso", "Nombre de Programador:")
            operacion = simpledialog.askstring("Capturar Proceso", "Operación (+, -, *, /, residuo, potencia):")
            datos = simpledialog.askstring("Capturar Proceso", "Datos para la operación:")
            tiempo_maximo = float(simpledialog.askstring("Capturar Proceso", "Tiempo Máximo Estimado (mayor a 0):"))
            num_programa = int(simpledialog.askstring("Capturar Proceso", "Número de Programa (único):"))
            proceso = Proceso(nombre_programador, operacion, datos, tiempo_maximo, num_programa)
            self.agregar_proceso(proceso)

    def agregar_proceso(self, proceso):
        # Método para agregar un proceso al lote en ejecución
        if not self.lote_en_ejecucion or len(self.lote_en_ejecucion.procesos) == 4:
            # Si no hay lote en ejecución o el lote actual está lleno, crea un nuevo lote
            self.lote_en_ejecucion = Lote()
            self.lotes_pendientes.append(self.lote_en_ejecucion)

        self.lote_en_ejecucion.agregar_proceso(proceso)

    def ejecutar_simulacion(self):
        # Método para ejecutar la simulación
        if not self.lotes_pendientes and not (self.lote_en_ejecucion and self.lote_en_ejecucion.procesos):
            messagebox.showinfo("Simulador de Procesos", "No hay procesos para simular.")
            return

        while self.lotes_pendientes or (self.lote_en_ejecucion and self.lote_en_ejecucion.procesos):
            if not self.lote_en_ejecucion or not self.lote_en_ejecucion.procesos:
                # Si no hay lote en ejecución o el lote actual no tiene procesos, toma el siguiente lote pendiente
                self.lote_en_ejecucion = self.lotes_pendientes.pop(0)

            self.mostrar_informacion()

            proceso_actual = self.lote_en_ejecucion.procesos[0]
            tiempo_restante = proceso_actual.tiempo_maximo - proceso_actual.tiempo_transcurrido

            while proceso_actual.tiempo_transcurrido < proceso_actual.tiempo_maximo:
                # Simula el paso del tiempo
                time.sleep(1)
                proceso_actual.tiempo_transcurrido += 1
                self.contador_global += 1
                self.mostrar_informacion()

            proceso_actual.ejecutar()
            self.procesos_terminados.append(proceso_actual)

        messagebox.showinfo("Simulador de Procesos", "Simulación completada.")

    def mostrar_informacion(self):
        # Método para mostrar información en la interfaz de usuario
        info = f"\nNúmero de lotes pendientes: {len(self.lotes_pendientes)}"

        if self.lote_en_ejecucion and self.lote_en_ejecucion.procesos:
            info += f"\nLote en Ejecución - Procesos:"
            for proceso in self.lote_en_ejecucion.procesos:
                info += f"\n  - Proceso {proceso.num_programa}: Tiempo Máximo Estimado: {proceso.tiempo_maximo}"

            proceso_actual = self.lote_en_ejecucion.procesos[0]
            info += f"\nProceso en Ejecución:"
            info += f"\n  - Proceso {proceso_actual.num_programa}"
            info += f"\n    - Nombre: {proceso_actual.nombre_programador}"
            info += f"\n    - Operación: {proceso_actual.operacion}"
            info += f"\n    - Tiempo Máximo Estimado: {proceso_actual.tiempo_maximo}"
            info += f"\n    - Número de Programa: {proceso_actual.num_programa}"
            info += f"\n    - Tiempo transcurrido: {proceso_actual.tiempo_transcurrido}"
            info += f"\n    - Tiempo restante: {proceso_actual.tiempo_maximo - proceso_actual.tiempo_transcurrido}"

        info += f"\nProcesos Terminados:"
        for proceso_terminado in self.procesos_terminados:
            info += f"\n  - Proceso {proceso_terminado.num_programa}"
            info += f"\n    - Operación: {proceso_terminado.operacion}"
            info += f"\n    - Resultado: {eval(proceso_terminado.operacion)}"

        info += f"\nContador Global: {self.contador_global}"

        self.label_info.config(text=info)

# Crear la ventana principal
root = tk.Tk()
simulador = Simulador(root)
root.mainloop()
