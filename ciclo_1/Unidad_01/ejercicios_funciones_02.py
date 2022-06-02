''' 

1) Desarrolle una función que calcule y muestre el promedio de 4 notas de un estudiante
2) Desarrolle una función que reciba como parámetro el nombre del usuario y ciudad, muestre
    por consola: "Hola nombre_usuario, nos alegra que nos visites desde nombre_ciudad"


'''

#Desarrollo primer punto

import string


def promedioNotas(nota1, nota2, nota3, nota4):
    suma = nota1 + nota2 + nota3 + nota4
    promedio = suma / 4
    print(promedio)

''' promedioNotas(5, 4, 4, 4) '''

#Desarrollo punto 2
def bienvenida(nombre_usuario: str, nombre_ciudad: str):
    print(f'Hola {nombre_usuario}, nos alegra que nos visites desde {nombre_ciudad}')

''' bienvenida("Goku", "Narnia") '''

def potencia(numero):
    operacionPotencia = numero ** 2
    print(operacionPotencia)

''' potencia(2) '''


#Desarrollo punto 4
def interesCDT(cantidad, porcentaje_interes: float, tiempo):
    formulaInteres = (cantidad * porcentaje_interes * tiempo) / 12
    print(f"Su valor de interés a ganar es: {formulaInteres}")

interesCDT(100, 0.1, 2)

#Solucion punto 5
''' 5) Desarrolle un función que muestre el TOTAL DEL DINERO a retirar en un CDT:
    NOTA: 
        *Utilice la misma fórmula del punto 4
        *El parámetro que representa el PORCENTAJE DEL INTERÉS se debe 
        recibir como entero para que internamente en la función se convierta a float.
        Ejemplo:
            30 -> 0.3
            10 -> 0.1
            50 -> 0.5 '''
            

def totalDineroRetirar(cantidad, porcentaje_interes, tiempo):
    formulaInteres = (cantidad * porcentaje_interes/100 * tiempo) / 12
    print(formulaInteres)

totalDineroRetirar(1000, 50, 2)
