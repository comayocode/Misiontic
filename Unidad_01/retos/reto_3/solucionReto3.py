#Lista de tuplas para la entrada de datos a la función AutoPartes
#Pocisiones = 0: idProducto, 1:Descripción, 2: Numero de parte, 3: cantidad vendida, 4: stock
a = [
    (0, 'camisa', 'ABC123', 2, 10),
    (1, 'pantalon', 'DEF954', 5, 15),
    (0, 'camisa', 'ABC123', 3, 7),
    (2, 'calcetines', 'HIJ625', 10, 100)
    ]

def AutoPartes (ventas):
    resultado={}
    for x in range(len(ventas)):
        resultado[x]=[ventas[x]]
    return resultado


def consultaRegistro(ventas, idProducto):
    resultado={}
    for i in ventas:
        if idProducto == ventas[i][0][0]:
            resultado[i]=ventas[i]
    mensaje=""
    if len(resultado) == 0:
        mensaje = 'No hay registro de ventas de ese producto'
    else:
        #Iterar el resultado del filtro
        for i in resultado:
            mensaje += 'codigo: {}, Descripción: {}, Referencia: {}, Piezas vendidad: {}, Stock: {} \n'.format(ventas[i][0][0], ventas[i][0][1], ventas[i][0][2], ventas[i][0][3], ventas[i][0][4])
    return mensaje
    #return print(mensaje)


#print(AutoPartes(a))
print(consultaRegistro(AutoPartes(a), 0))

#print(AutoPartes(a))