# ----- Antes -----

def cliente(informacion:dict)->dict:
    ed=informacion['edad']
    ping=informacion['primer_ingreso']
    if ed>18:
        atraccion='X-treme'
        apto=True
        if ping==True:
            total_boleta=20000-(20000*0.05)
        else:
            total_boleta=20000    
    elif ed>=15 and ed<=18:
        atraccion='Carros chocones'  
        apto=True
        if ping==True:
            total_boleta=5000-(5000*0.07)
        else:
            total_boleta=5000
    elif ed>=7 and ed<15:
        atraccion='Sillas voladoras'  
        apto=True
        if ping==True:
            total_boleta=10000-(10000*0.05)
        else:
            total_boleta=10000
    else:
        atraccion='N/A' 
        apto=False
        total_boleta='N/A'    


diccionario_respuesta = {'nombre': informacion['nombre'],'edad': ['edad'],'atraccion':['atraccion'],'primer_ingreso': ['primer_ingreso'],'apto': ['apto'], 'total_boleta': ['total_boleta']}

# ----- Después -----

def cliente(informacion:dict):
    ed=informacion['edad']
    ping=informacion['primer_ingreso']
    if ed>18:
        atraccion='X-treme'
        apto=True
        if ping==True:
            total_boleta=20000-(20000*0.05)
        else:
            total_boleta=20000
    elif ed>=15 and ed<=18:
        atraccion='Carros chocones'
        apto=True
        if ping==True:
            total_boleta=5000-(5000*0.07)
        else:
            total_boleta=5000
    elif ed>=7 and ed<15:
        atraccion='Sillas voladoras'
        apto=True
        if ping==True:
            total_boleta=10000-(10000*0.05)
        else:
            total_boleta=10000
    else:
        atraccion='N/A'
        apto=False
        total_boleta='N/A'

    #Mal identado (afuera de la función)
    diccionario_respuesta = {
        'nombre': informacion['nombre'],
        'edad': informacion['edad'],
        #Estaba llamando un item de una lista. Se tenía que pasar la variable atraccion
        'atraccion':atraccion,
        #Apto va antes de primer_ingreso. Se tenía que pasar la variable apto
        'apto': apto,
        'primer_ingreso': informacion['primer_ingreso'],
        #Se tenía que pasar la variable total_boleta
        'total_boleta': total_boleta
        }

    #No estaba retornando el diccionario_respuesta
    return diccionario_respuesta



# ----- Diccionario de prueba -----

informacion = {
    'id_cliente': 1,
    'nombre': 'Tatiana Ruiz',
    'edad': 17,
    'primer_ingreso': False
}


print(cliente(informacion))