'''---------- FUNCIONES ---------- '''
#Bloque de código que ejecutan instrucciones

''' def suma(num1, num2):
    resultado = num1 + num2
    print(resultado)

suma(1, 2)
suma(10, 5) '''

#def -> palabra reservada para crear una función

#Función para mostrar un mensaje

from unittest import result


def miFuncion():
    mensaje = "Hola mundo, esta es mi primera función"
    print(mensaje)

def sumar():
    num_1 = 10
    num_2 = 20
    resultado = num_1 + num_2
    #concatenar
    print(f"{num_1} + {num_2} = {resultado}")

#Llamar la función
''' miFuncion() '''
sumar()

#Sumar con parámetros

def sumar_con_parametros(num1: float, num2: float, num3: float):
    resultado = num1 + num2 + num3
    print("Resultado = %.2f" %resultado)

#llamdao de la función
sumar_con_parametros(1, 1, 1)

#----- FUNCIONES CON RETURN -----

def suma(n1, n2, n3):
    #Variable local de la función
    sum = n1 + n2 + n3
    return sum

resultado = suma(10, 20, 30)
resultado_2 = suma (resultado, 50, 60)
print(resultado_2)

def saludar(nombre: str, ciudad: str):
    return f"Hola {nombre}, nos alegra que nos visites desde {ciudad}"

print( saludar('Juan', 'Medellín') )

'''
1) Desarrolle una función que determine si un número es par o impar
2) Desarrolle una función que retorne si una persona es mayor de edad o no
3) Desarrolle una función que retorne el resultado de la siguiente fórmula:
    valor_interes = (cantidad * valor_interes * tiempo) / 12

#https://paste.ofcode.org/X69c9RsL8Ugqyj2VfnrutZ
'''


#Punto 1
def esPar(numero):
    par = False
    if numero % 2 == 0:
        par = True
    return par

if esPar(4):
    print("Ejecuto un proceso")

#Punto 2
def deternar_mayor_edad(edad):
    mensaje = ''
    if edad >= 18:
        mensaje = 'Es mayor de edad'
    else:
        mensaje = 'Es menor de edad'
    return mensaje
