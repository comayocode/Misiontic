from functools import reduce


rutinaContable= [
    [6589, ("9874", 1, 125698.20), ("88112", 2, 135645.20), ("3218", 4, 13645.20)],
    [6590, ("5236", 8, 11.99), ("7733",11,18.99), ("88112", 5, 390.95)],
    [6591, ("7812", 2, 11.99), ("9652",11,18.99)], 
]

def total(rutinaContable):
    ordenMinima = 600000

    resultado = []
    for n in range(len(rutinaContable)):
        resultado+=[rutinaContable[n]]
    return resultado

def multiplicar(total):
    id_venta = []
    resultado=[]
    for i in total:
        id_venta+=total[0]
    return print(id_venta)


referencia = total(rutinaContable)
multiplicar(referencia)