rutinaContable= [
    [1201, ("5464", 4, 25842.99), ("7854",18,23254.99), ("8521", 9, 48951.95)],
    [1202, ("8756", 3, 115362.58),("1112",18,2354.99)],
    [1203, ("2547", 1, 125698.20), ("2635", 2, 135645.20), ("1254", 1, 13645.20),("9965", 5, 1645.20)],
    [1204, ("9635", 7, 11.99), ("7733",11,18.99), ("88112", 5, 390.95)]
]

from functools import reduce as rd

def ordenes(rutinaContable):

    # Multiplicar la cantidad de productos [1] * por el precio unitario[2]
    # var lt: lista
    # var tp: tupla
    multiplicar_tuplas = list(map(lambda lt: [lt[0]] + list(map(lambda tp: tp[1]*tp[2], lt[1:])), rutinaContable))
    #print(multiplicar_tuplas)

    #Segundo requerimiento: Sumar los totales
    suma_tupla = list(map(lambda lt: [lt[0]]+ [rd(lambda ac, e: round(ac+e,2), lt[1:])], multiplicar_tuplas))
    #print(suma_tupla)

    #Tercer requerimiento: incrementar 25k si la compra < 600k
    compra_minima = 600000
    incremento_total = list(map(lambda lt: lt if lt[1]>=compra_minima else (lt[0], lt[1]+25000), suma_tupla))
    #print(incremento_total)

    #Salida de str
    print('------------------------ Inicio Registro diario ---------------------------------')
    for lt in range(len(incremento_total)):
        #{incremento_total[lt][1]:,.2f}: ,.2f es para formatear los decimales
        print(f"La factura {incremento_total[lt][0]} tiene un total en pesos de {incremento_total[lt][1]:,.2f}")
    print('-------------------------- Fin Registro diario ----------------------------------')

print(ordenes(rutinaContable))
