import pandas as pd
import os

# ruta file csv
rutaFileCsv = 'https://github.com/luisguillermomolero/MisionTIC2022_2/blob/master/Modulo1_Python_MisionTIC2022_Main/Semana_5/Reto/movies.csv?raw=true'

#Dividir nombre y extensión del archivo
root, extension = os.path.splitext("movies.csv")

def listaPeliculas(rutaFileCsv: str):
    #Validar extensión
    if extension == ".csv":
        try:
            #Cargar archivo/ruta csv
            moviesCsv = pd.read_csv(rutaFileCsv)
            #Crear subconjunto/Subdataframe
            subDataframe = moviesCsv.loc[:, ['Country','Language','Gross Earnings']]
            #Creación pivot table
            tablaDinámica = pd.pivot_table(subDataframe, index=['Country','Language'])

            return tablaDinámica.head(10)
        except:
            return "Error al leer el archivo de datos."
    else:
        return "Extensión  inválida."

print(listaPeliculas(rutaFileCsv))

