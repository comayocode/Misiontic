''' Mostrar  en consola '''
print("Hola Mundo")

'''---------- VARIABLES ---------- '''
#Variables entero
numero = 10
#Camel Case
miVariable = 20
num_1 = 5
#Indicar el tipó de dato se solo se hace para que el código sea LEGIBLE
#pero nolo convierte en un lenguaje fuertemente tipado
num_2: int = 10

#Variables de tipo flotante (números con decimales)
flotante_1 = 3.1415
flotante_2: float = 20.22

#Varibales de tipo String (texto)
anio = "2022"
mensaje = str = "Esto es un mensaje"
dirección = "Cra 100 #21-22"

'''---------- OPERACIONES MATEMÁTICAS ---------- '''

suma = num_1 + num_2
multiplicacion = flotante_1 * flotante_2
division = multiplicacion * num_1
#Elevado a la protencia (Doble multiplicación)
elevado = num_1 ** 2
#Módulo: residuo de una división
modulo = num_1 % 2

#Mostrar los resultados

#Concatenar con coma
print('La suma es: ', suma)
#Formatear la salida limitando el número de flotantes a mostrar #1
print("Multiplicacion  = %.2f" % multiplicacion)

#Dar formato a la salida #2
print(f'Division = {division}')

'''---------- STRING ---------- '''
nombre = "Andres "
apellido = "Quintero"
nombre_completo = nombre + "" + apellido
print(nombre_completo)


