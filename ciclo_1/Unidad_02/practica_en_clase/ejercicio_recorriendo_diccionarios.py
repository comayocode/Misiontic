curso = {
    '1234': {
        'nombre': 'Natalia',
        'apellido': 'Quintana',
        'notas':{
            'nota_1': 4.0,
            'nota_2': 5.0,
            'nota_3': 3.2,
            'nota_4': 4.1
        }
    },

    '4321':{
        'nombre': 'Manuel',
        'apellido': 'Cruz',
        'notas':{
            'nota_1': 2.2,
            'nota_2': 5.0,
            'nota_3': 4.3,
            'nota_4': 2.0
        }
    },
    '7890': {
        'nombre': 'Juan',
        'apellido': 'Alvarez',
        'notas': {
            'nota_1': 5,
            'nota_2': 2.8,
            'nota_3': 3.1,
            'nota_4': 4.9
        }
    },
    '5678': {
        'nombre': 'Sandy',
        'apellido': 'Medina',
        'notas': {
            'nota_1': 4.6,
            'nota_2': 4.8,
            'nota_3': 3.7,
            'nota_4': 4.2
        }
    },
    '1594': {
        'nombre': 'Mario',
        'apellido': 'Castaño',
        'notas': {
            'nota_1': 1.2,
            'nota_2': 3.5,
            'nota_3': 3.7,
            'nota_4': 1.0
        }
    },
}

def calcularPromedioNotas(dictCurso: dict):
    ''' Relacionar el promedio con la CC del estudiante y almacenarlo en un diccinoario '''
    #Primero se crea un diccinoario vacio afuera del for
    dictPromedioNotas = dict()

    ''' ---------- Recorrer el diccinoario sin saber el No. de notas o estudiantes y sacar promedio ---------- '''
    for cedula, datosEst in curso.items():
        #print('ID Estudiante: ', cedula)
        #print ('Datos el estudiante: ', datosEst)

        ''' ----- Acceder a notas ----- '''
        notas = datosEst['notas']
        #print(notas)

        ''' ----- Recorrer diccionario "notas" ----- '''
        #Primera forma para sacar promedio (entendible)
        sumaNotas = 0
        for n in notas.values():
            sumaNotas += n
        cantidadNotas = len(notas)
        #Primera forma para sacar promedio
        promedio = sumaNotas / cantidadNotas
        #print("Promedio del estudiante", cedula, "es = %.1f " %promedio)

            #Segunda forma para sacar promedio (enrredado)
        #Forma abreviada para sacar promedio
        ''' promedioEstudiante = 0
        for n in notas.values():
            promedioEstudiante += n
        cantidadNotas = len(notas)
        #Primera forma para sacar promedio
        promedioEstudiante /= cantidadNotas
        print("Promedio del estudiante", cedula, "es = %.1f " %promedioEstudiante) '''

        ''' ----- Añadir el promedio al diccionario vacio 'dictPromedioNotas' ----- '''
        #round(): redondea un número. uso: round(numero_a_redondear, cantidad_decimales)
        dictPromedioNotas[cedula] = round(promedio, 1)
    #Retorno del diccionario que contiene el promedio de notas
    return dictPromedioNotas

respuestaFuncion = calcularPromedioNotas(curso)
print(respuestaFuncion)


''' ---------- Sacar el promedio de los promedios de los estudiantes '''
def promedioGlobal():
    suma = 0
    cantidadCC = len(curso)
    for x in respuestaFuncion.values():
        suma += x
    promedioGlobalNotas = suma / cantidadCC
    roundPromedioNotas = round(promedioGlobalNotas, 1)
    return f"El promedio global del curso es: {roundPromedioNotas}"

print(promedioGlobal())






