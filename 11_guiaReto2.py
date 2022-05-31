'''
1. Sacar info necesaria/apuntes de los requerimientos

Función que reciba como parámetro un diccinoario.
    Estructura del diccionario:
    diccionario = {
        'id_cliente: 0
        'nombre': ''
        'edad': 0
        'primer_ingreso': True
    }

La función debe retornar diccionario con la siguiente estructura:
    respuesta = {
        'nombre': ''
        'edad': 0
        'atraccion': ''
        'primer_ingreso': True
        'total_boleta': 0
        'apto': False
    }
    "Apto será TURE sólo si está dentro del rango de edad de la tabla"
    "Atracción y total_boleta N/A si no está en el rango de edad de la boleta"
'''

informacion = {
    'id_cliente': 1,
    'nombre': '',
    'edad': 0,
    'primer_ingreso': True
}

def cliente (informacion:dict):
    #Variables inicializadas
    edad = informacion['edad']
    valor_boleta = 'N/A'
    atraccion = 'N/A'
    apto = False
    if edad > 18: #Evaluar edad
        valor_boleta = 20000
        atraccion = 'X-Treme'
        apto = True
        #No hay necesidad de poner: informacion['primer_ingreso'] == True, ya que una condicional if siempre da como primer resultado TRUE
        if informacion['primer_ingreso']:
            valor_boleta -= (valor_boleta * 0.05)
    elif edad >= 15 & edad <= 18:
        pass

    respuesta = { #Retornar un diccionario vacio
        'nombre': informacion['nombre'],
        'edad': edad,
        'atraccion': atraccion,
        'primer_ingreso': informacion['primer_ingreso'],
        'total_boleta': apto,
        'apto': valor_boleta,
    }

    return respuesta