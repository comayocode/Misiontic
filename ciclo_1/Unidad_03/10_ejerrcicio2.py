numPar = []
numImpar = []

for x in range(1, 1000):
    if x%2 == 0:
        #Añadir el resultado a la lista con .append(x)
        numPar.append(x)
    else:
        numImpar.append(x)

print(numPar)