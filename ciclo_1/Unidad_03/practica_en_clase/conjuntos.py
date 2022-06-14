conjunto_nombres ={"juan","juan","Maria","pedro"}
print(conjunto_nombres)

conjunto_vacio = set()

conjunto_a = {10,20,30,40,50}
conjunto_b = {5,10,15,20,25,35}
""" print(conjunto_a)
print(conjunto_b) """

interseccion = conjunto_a.intersection(conjunto_b)
print(interseccion)

diferencia_a_b = conjunto_a.difference(conjunto_b)
print(diferencia_a_b)

conjunto_nombres = {'Juan', 'Juan', 'María', 'Juan', 'Jose'}
print(conjunto_nombres)

lista_placas = ['ABC-230', 'RJH-555', 'ABC-230', 'ABC-230', 'QRT-532']
#Castear/convertir a conjunto
conjunto_placas = set(lista_placas)
print(conjunto_placas)
