'''
Registro de ventas de partes
consulta de registro de ventas por producto

---

Entrada de datos: lista de tuplas = entrada = [(1,2)], cada tupla representa una venta
Salida de datos (diccionario con lista de tuplas): String = Producto consultado : {idProducto} Descripción {dProducto}
#Parte {pnProducto} Cantidad vendida {cvProducto} Stock
{sProducto} Comprador {nComprador} Documento
{cComprador} Fecha Venta {fVenta

---

Esqueleto de la función:

def AutoPartes(ventas: list):
    pass

def consultaRegistro(ventas, idProducto):
    pass

---

Explicación Dario Andrés


Desarrollar función que reciba como parámetro una lista de tuplas:
[
    (id_producto: int, desc_produ cto: str, num_producto: str,
    cant_vendida: int, stock: int, nombre_comprador: str, doc_comprador: int,
    fecha_venta: str),()]

La función debe retornar un String con la siguiente estructura:
* Producto consultado : 2010 Descripción bujía #Parte MS9512 Cantidad vendida 4 Stock 15 Comprador Carlos Rondon Documento 1256 Fecha Venta 12/06/2020
* “No hay registro de venta de ese producto”

NOTA:
    *Permitir introducir ventas a la lista de tuplas que se recibe como parámetro,
    posteriormente convertirlo a un diccionario
'''

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
    if len(resultado) == 0:
        resultado = 'No hay registro de ventas de ese producto'
    else:
        for i in resultado:
            pass
    return resultado


print(consultaRegistro(AutoPartes(a), 0))

#print(AutoPartes(a))

{0: [(0, 'camisa', 'ABC123', 2, 10)], 2: [(0, 'camisa', 'ABC123', 3, 7)]}