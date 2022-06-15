#Ejercicio1
promedio = lambda lista_num: sum(lista_num) / len(lista_num)
print(promedio([1,10]))

#Ejercicio 2
retorno = lambda texto: texto[0]
print(retorno('Misiontic'))

#Ejercicio 3
ultimo_caracter = lambda texto: texto[-1]
print(ultimo_caracter('Misiontic'))

#Ejercicio 4
lista = [0,1,2,3,4,5,6,7,8,9]
rebanado = lambda lista : lista[5:]
print(rebanado([0,1,2,3,4,5,6,7,8,9]))