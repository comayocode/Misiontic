rutinaContable= [
    [6589, ("9874", 1, 125698.20), ("88112", 2, 135645.20), ("3218", 4, 13645.20)],
    [6590, ("5236", 8, 11.99), ("7733",11,18.99), ("88112", 5, 390.95)],
    [6591, ("7812", 2, 11.99), ("9652",11,18.99)], 
]
def ordenes(rutinaContable):
    #Importar la funcion "reduce" desde la libreria "functools"
    from functools import reduce

    #Declarar constante "ordenMinima"
    ordenMinima = 600000
    #Primer lambda que suma el total de cada tupla de cada lista
    ordenTotal = list(
        map(lambda x: [x[0]] + list(map(lambda y: y[1]*y[2], x[1:])), rutinaContable))

    #Segundo lambda suma los totales de todas las tuplas de toda la lista
    ordenTotal = list(
        map(lambda x: [x[0]] + [reduce(lambda a, b: round(a + b, 2), x[1:])], ordenTotal))
    #Tercer lambda que suma el incremento si la compra no llega al minimo
    ordenTotal = list(
        map(lambda x: x if x[1] >= ordenMinima else (x[0], x[1] + 25000), ordenTotal))

    print('------------------------ Inicio Registro diario ---------------------------------')
    #Ciclo para imprimir el total de cada compra
    for x in range(len(ordenTotal)):
        print(
            f'La factura {ordenTotal[x][0]} tiene un total en pesos de {ordenTotal[x][1]:,.2f}')
    print('-------------------------- Fin Registro diario ----------------------------------')

ordenes(rutinaContable)