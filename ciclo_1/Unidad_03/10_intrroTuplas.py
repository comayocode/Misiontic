#Tipo de dato que nos permite almacenar varios tipos de datos, se usan los (). Las tuplas son inmutables
#Sería como un contenedor de constantes

print("----- Crear tupla -----")
#Tupla 1 solo elemento
miTupla=("Juan",)
#Tupla +1 elementos
miTupla = ("Andres", 1, 2)
#Imprimir un dato de la tupla
print(miTupla[0])
#Imprimir más de un dato
print(miTupla[0], miTupla[2])


print("----- Tupla de diccionarios -----")
tuplaDiccionarios =({'nombre': 'juan'}, {'nombre': 'Maria'})
print(tuplaDiccionarios)

#Poner un diccionario existente dentro de la tupla
persona1 ={
    'nombre': 'juan'
}
persona2 ={
    'nombre': 'Maria'
}
tuplaDiccionarios =(persona1, persona2)

#Modificar los valores del diccionario
persona1['apellido'] = 'Quintero'
print(tuplaDiccionarios)

print("----- Tupla de listas -----")
tuplaListas = ([1,2], [3,4])
print(tuplaListas)
