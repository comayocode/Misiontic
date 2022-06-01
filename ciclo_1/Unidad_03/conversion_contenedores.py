listaNumeros1 = {10,20,30,40,60,10,10,10,20,30,40}
listaNumeros2 = {5,10,15,20,30,40,45,64,70,80}

#Convertir la listaa un conjunto
conjuntoNumeros1 = set(listaNumeros1)
conjuntoNumeros2 = set(listaNumeros2)

#Capturar datos que tienen en común
datosComun = conjuntoNumeros1.intersection(listaNumeros2)
print(datosComun)

#Volver a convertir un conjunto a lista
listaDatosComun = list(datosComun)

#Ordenar de menor a mayor sort()
listaDatosComun.sort()
print(listaDatosComun)
#Ordenar de mayor a menor reverse=True
listaDatosComun.sort(reverse=True)
print(listaDatosComun)

print("----- CADENA DE CARACTERES A CONJUNTOS -----")

mensaje = "Hola mundo desde MIsion Tic 2022 - UTP"
conjunto = set(mensaje)
print(conjunto)

print("----- TUPLAS A CONJUNTOS -----")
tupla = ("Juan", "Pedro", "María", "Juliana")
conjunto = set(tupla)
print(conjunto)

print("----- DICCIONARIO A CONJUNTOS -----")
dictPersona = {
    'nombre': 'Maria',
    'apellido': 'Ureña',
    'edad': '25',
    'telefono': '1234567'
}

#Obtener las keys
conjunto = set(dictPersona.keys())
print(conjunto)
#Obtener los Values
conjunto = set(dictPersona.values())
print(conjunto)

#Eliminar un dato del conjunto
conjunto.remove(25) #Se selecciona directamente el dato que se quiere borrar

#Añadir un dato
conjunto = set()
conjunto.add(10)
conjunto.add(12)