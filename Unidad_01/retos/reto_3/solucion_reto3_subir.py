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
        mensaje = 'No hay registro de venta de ese producto'
    else:
        for i in resultado:
            mensaje += 'Producto consultado : {}  Descripción  {}  #Parte  {}  Cantidad vendida  {}  Stock  {}  Comprador {}  Documento  {}  Fecha Venta  {}\n'.format(ventas[i][0][0], ventas[i][0][1], ventas[i][0][2], ventas[i][0][3], ventas[i][0][4], ventas[i][0][5], ventas[i][0][6], ventas[i][0][7])
    return print(mensaje)

consultaRegistro(AutoPartes([
    (2001,'rosca', 'PT29872',2,45,'Luis Molero',3456,'12/06/2020'),
    (2010,'bujía', 'MS9512',4,15,'Carlos Rondon',1256,'12/06/2020'),
    (2010,'bujía', 'ER6523',9,36,'Pedro Montes',1243,'12/06/2020'),
    (3578,'tijera', 'QW8523',1,128,'Pedro Faria',1456,'12/06/2020'),
    (9251,'piñón', 'EN5698',2,8,'Juan Peña',565,'12/06/2020')]), 2010)