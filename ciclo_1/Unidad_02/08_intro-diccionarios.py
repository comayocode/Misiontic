#Diccionario vacio
from msilib.schema import Registry


miDiccionario = {}
print(miDiccionario)

#Diccionario con datos
estudiante = {
    'nombre': 'Isaac',
    'apellido': 'Vallejo',
    'edad': 25,
    'promedio_notas': 4.2,
    'activo': True
}
''' #Imprimir un valor de una clave
x = estudiante['apellido']
print(x)
#Imprimir todo el diccionario
print(estudiante) '''

print('---------- DICCIONARIOS DE DICCIONARIOS ---------')

estudiante_1 = {
    'nombre': 'Isaac',
    'apellido': 'Vallejo',
    'edad': 25,
    'promedio_notas': 4.2,
    'activo': True
}

estudiante_2 = {
    'nombre': 'Marlon',
    'apellido': 'Moreno',
    'edad': 20,
    'promedio_notas': 4.0,
    'activo': True
}

estudiantes = {
    '12345': estudiante_1,
    '54321': estudiante_2
}

print(estudiantes)

print('---------- AGREGAR DATO POR DATO CON EL PASAR DEL TIEMPO ---------')

registro = {}
print(registro)

registro ['nombre'] = 'Andres'
registro ['apellido'] = 'Marulanda'
registro ['email'] = 'andres@gmail.com'
registro ['password'] = '123456'
registro ['celular'] = '3124567890'

print(registro)