''' informacion = {
    'id_cliente': 0,
    'nombre': '',
    'edad': 0,
    'primer_ingreso':
} '''

from numpy import conjugate
from sqlalchemy import intersect
from sympy import intersection


informacion = {
    'id_cliente': 1,
    'nombre': 'Tatiana Ruiz',
    'edad': 17,
    'primer_ingreso': False
}

def cliente (informacion:dict):
    edad = informacion['edad']
    atraccion = 'N/A'
    total_boleta = 'N/A'
    primerIngreso = informacion['primer_ingreso']
    apto = False

    if edad>18:
        total_boleta = 20000
        atraccion = 'X-Treme'
        apto = True
        if primerIngreso:
            total_boleta -= total_boleta * 0.05
    elif edad >=15 and edad <=18:
        total_boleta = 5000
        atraccion = 'Carros chocones'
        apto = True
        if primerIngreso:
            total_boleta -= total_boleta * 0.07
    elif edad >= 7 and edad < 15:
        total_boleta = 10000
        atraccion = 'Sillas voladoras'
        apto = True
        if primerIngreso:
            total_boleta -= total_boleta * 0.05

    retornoDatos = {
        'nombre': informacion['nombre'],
        'edad': informacion['edad'],
        'atraccion': atraccion,
        'apto': apto,
        'primer_ingreso': informacion['primer_ingreso'],
        'total_boleta': total_boleta
    }
    return retornoDatos

print(cliente(informacion))

#DICCIONARIO PARA TUS PRUEBAS (NO SE SUBE AL RETO)
informacion = {
    'id_cliente': 1,
    'nombre': 'Tatiana Ruiz',
    'edad': 17,
    'primer_ingreso': False
}

#SÓLO SE SUBE ESTA FUNCIÓN AL RETO
def cliente (informacion:dict):
    #RESTO DEL CÓDIGO
    pass

#IMPRIMIR EL DATO QUE RETORNE
print(cliente(informacion))


