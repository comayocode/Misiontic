#Sumar tuplas de una lista de listas
lista = [
    [(205, 0.005), (323, 0.010), (325, 0.005), (332, 0.005)],
    [(205, 0.005), (323, 0.002), (325, 0.007), (332, 0.002)]
]

''' print(lista) '''

total=[]
for z in lista:
    total[z] = [lista[z]]
    for x in zip(*lista):
        cod = x[z][1]
        print(cod)
    ''' suma = sum(valor[1] for valor in x)
    total.append((cod, suma)) '''

print(total)