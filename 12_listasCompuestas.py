hijo_1 = ['Maria', 'Juan']
hijo_2 = ['Alejandra', 'Luiz']

padre = [hijo_1, hijo_2]

#ACCEDER A MARIA
nombre_1 = padre[0][0]
print(nombre_1)

nombre_2 = padre[0][1]
print(nombre_2, "\n")

print("----- RECORRER LISTA COMPUESTA -----")

#For principal itera a la lista padre
#For anidado itera a la lista hijo

for hijo in padre:
    print("padre: ",hijo)
    #ITERAR LISTA HIJO
    for j in hijo:
        print("hijo:",j)