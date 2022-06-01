#Diccionario a recorrer
ventas = {
    'ventas_1': 10,
    'ventas_2': 15,
    'ventas_3': 11
}

#X es una variable creada en la que se guarda el dato obtenido, el dato obtenido es la key
print('----- IMPRIMIR KEY -----')
for x  in ventas:
    print(x)

print('----- IMPRIMIR VALUE OBTENIENDO LA KEY -----')
for x in ventas:
    y = ventas[x]
    print(y)

print('----- IMPRIMIR KEY + VALUE -----')

for x in ventas:
    y = ventas[x]
    print(x, ':', y)

print('----- SUMAR LOS VALORES -----')
suma = 0 #se inicia la suma en 0 afuera el for
for x in ventas:
    y = ventas[x]
    suma += y
    print(suma)

print('----- Obtener sólo los valores -----')
for x in ventas.values():
    print(x)

print('----- Obtener clave & Valor al tiempo -----')
for x, y in ventas.items():
    print(x, ':', y)


print('---------- EJERCICIO UN POCO COMPLEJO ---------- ')
supermercado = {
    'ciudad': 'medellin',
    'belen': {
        'aseo': 120,
        'frutas': 250
    },
    'estadio':{
        'estadio': 80,
        'frutas': 300
    }
}

print('----- Sólo key -----')
for key in supermercado:
    print(key)

print('----- Sólo value -----')
for value in supermercado.values():
    print(value)

print('----- key & value a la vez -----')
for key, value in supermercado.items():
    print(key, ':', value)
