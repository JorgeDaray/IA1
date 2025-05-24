import numpy as np
import matplotlib.pyplot as plt

# Función 1: f(x, y)
def func1(x, y):
    return x * np.exp(-x**2 - y**2)

# Gradiente de la función 1
def grad_func1(x, y):
    df_dx = (1 - 2*x**2) * np.exp(-x**2 - y**2)
    df_dy = 2 * x * y * np.exp(-x**2 - y**2)
    return np.array([df_dx, df_dy])

# Función 2: f(x)
def func2(x):
    return np.sum((x - 2)**2)

# Gradiente de la función 2
def grad_func2(x):
    return 2 * (x - 2)

# Método del Gradiente Descendiente
def gradient_descent(func1, grad_func, initial_x, learning_rate, num_iterations):
    x = initial_x
    history = [x]
    for _ in range(num_iterations):
        gradient = grad_func(x)  # Corregido aquí
        x -= learning_rate * gradient
        history.append(x)
    return x, history

# Método del Gradiente Descendiente
def gradient_descenty(func1, grad_func, initial_y,initial_x, learning_rate, num_iterations):
    x = initial_x
    history = [x]
    y = initial_y
    history = [y]
    for _ in range(num_iterations):
        gradient = grad_func(*x)  # Corregido aquí
        y -= learning_rate * gradient
        x -= learning_rate * gradient
        history.append(x)
        history.append(y)
    return x,history

# Parámetros
initial_x1 = np.array([-0.42888, -0.70711])  # Inicialización para función 1
initial_y1 = np.array([-0.42888, -0.70711])  # Inicialización para función 1
initial_x2 = np.array([1.5, 1.5])  # Inicialización para función 2
learning_rate = 0.1
num_iterations = 100

# Aplicar Gradiente Descendiente
x_min1, history1 = gradient_descenty(func1, grad_func1, initial_x1, initial_y1, learning_rate, num_iterations)
x_min2, history2 = gradient_descent(func2, grad_func2, initial_x2, learning_rate, num_iterations)

# Gráficas funcion 1
plt.plot(*zip(*history1), label="Función 1")
plt.scatter(*x_min1, color='red', marker='o', label="Mínimo global (Función 1)")
plt.xlabel("x")
plt.title("Gradiente Descendiente")
plt.legend()
plt.show()

# Gráfica para Función 2
plt.subplot(2, 1, 2)
plt.plot(history2, label='x')
plt.xlabel('Iteraciones')
plt.ylabel('Valor')
plt.title('Convergencia para Función 2')
plt.legend()

plt.tight_layout()
plt.show()

