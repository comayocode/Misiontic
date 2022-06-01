
'''
diccionario_CRUD =
    '12345': {
        'nombre': 'apellido',
        'apellido': '',
        'telefono': 0,
        'vehiculos': {'PLACA1', 'PLACA2'}
    }
}
'''

'''
----- CRUD -----
1) Registrar propietario
2) Registrar vehiculo
3) Actualizar informacion del propietario
4) Consultar propietario
5) Consultar todos los propietarios
6) Eliminar vehiculo
7) Eliminar propietario
8) Eliminar todos los datos
9) Salir
'''


from distutils.log import info


def validar_cedula(informacion: dict):
    # Solicitar la cédula al usuario
    cedula = input('Ingrese la cédula del usuario: ')
    # Inicializar tupla de respuesta
    respuesta = (False, cedula)
    if cedula in informacion:
        respuesta = (True, cedula)
    # Retornar la tupla
    return respuesta


def registrar_propietario(informacion: dict):
    print('----------------REGISTRAR PROPIETARIO---------')
    # Desempaquetar la tupla de respuesta
    existe, cedula = validar_cedula(informacion)
    if existe:
        print(
            f'El propietario con cédula {cedula} ya existe en la base de datos')
    else:
        nombre = input('Nombre: ')
        informacion[cedula] = {
            'nombre': nombre,
            'apellido': input('Apellido: '),
            'telefono': input('Teléfono: '),
            'vehiculos': set()
        }
        print('\n¡Propietario registrado con éxito!\n')


def registrar_vehiculo(informacion: dict):
    existe, cedula = validar_cedula(informacion)
    if existe:
        placa = input("Placa: ")
    else:
        print(f"\nEl propietario con cedula {cedula}")


def actualizar_info_propietario(informacion: dict):
    print('----------------ACTUALIZAR INFORMACIÓN DEL PROPIETARIO--------------------')
    existe, cedula = validar_cedula(informacion)
    if existe:
        # Solución de Jorge Antonio
        informacion[cedula]['nombre'] = input('Ingrese el nuevo nombre: ')
        informacion[cedula]['apellido'] = input('Ingrese el nuevo apellido: ')
        informacion[cedula]['telefono'] = input('Ingrese el nuevo teléfono: ')
        print('\n ¡Informacion actualizada con éxito! \n')
    else:
        print(
            f'\nEl propietario con cédula {cedula} no existe en la base de datos\n')


def consultar_propietario(informacion: dict):
    print('----------------CONSULTAR INFORMACIÓN DEL PROPIETARIO--------------------')
    existe, cedula = validar_cedula(informacion)
    if existe:
        info_propietario = informacion[cedula]
        print('\n--------------PROPIETARIO-------------')
        print('Nombre: ', info_propietario['nombre'])
        print('Apellido: ', info_propietario['apellido'])
        print('Teléfono: ', info_propietario['telefono'])
        print('Vehículos: ')
        # Ite rar todas las placas de los vehiculos
        for placa in info_propietario['vehiculos']:
            print('\t*', placa)
        print('\n')
    else:
        print(
            f'\nEl propietario con cédula {cedula} no existe en la base de datos\n')


def visualizar_info_propietarios(informacion: dict):
    for cedula, info_propietario in informacion.items():
        print('\n--------------PROPIETARIO-------------')
        print('Cédula: ', cedula)
        print('Nombre: ', info_propietario['nombre'])
        print('Apellido: ', info_propietario['apellido'])
        print('Teléfono: ', info_propietario['telefono'])
        print('Vehículos: ')
        #Iterar todas las placas de los vehiculos
        for placa in info_propietario['vehiculos']:
            print('\t*', placa)
        print('\n')

def eliminar_vehiculo(informacion: dict):
    print('----------------ELIMINAR VEHÍCULO--------------------')
    existe, cedula = validar_cedula(informacion)
    if existe:
        placa = input('Placa: ')
        info_propietario = informacion[cedula]
        vehiculos: set = info_propietario['vehiculos']
        vehiculos.remove(placa)
        print('\nVehículo eliminado con éxito\n')
    else:
        print(f'\nEl propietario con cédula {cedula} no existe en la base de datos\n')

def eliminar_propietario(informacion: dict):
    print("----------------ELIMINAR PROPIETARIO----------------")
    existe,cedula = validar_cedula(informacion)
    if existe:
        informacion.pop(cedula)
        print("\nPropietario eliminado con éxito\n")
    else:
        print(f"\El propietario con {cedula} no existe en la base de datos \n")


def menu():
    informacion = {
        '12345': {
            'nombre': 'Andres',
            'apellido': 'Cardona',
            'telefono': 31546987120,
            'vehiculos': {'ABC335', 'LIF548'}
        }
    }
    print(informacion)
    mensaje_menu = '--------------CRUD---------\n'
    mensaje_menu += '1) Registrar propietario\n'
    mensaje_menu += '2) Registrar vehiculo\n'
    mensaje_menu += '3) Actualizar información del propietario\n'
    mensaje_menu += '4) Consultar propietario\n'
    mensaje_menu += '5) Consultar todos los propietarios\n'
    mensaje_menu += '6) Eliminar vehiculo\n'
    mensaje_menu += '7) Eliminar propietario\n'
    mensaje_menu += '8) Eliminar todos los datos\n'
    mensaje_menu += '9) Salir\n'
    mensaje_menu += '>>>'

    opcion = 0
    while opcion != 9:
        opcion = int(input(mensaje_menu))
        # Evaluar opcion ingresada
        if opcion == 1:
            registrar_propietario(informacion)
        elif opcion == 2:
            print('Registrar vehiculo')
        elif opcion == 3:
            actualizar_info_propietario(informacion)
        elif opcion == 4:
            consultar_propietario(informacion)
        elif opcion == 5:
            visualizar_info_propietarios(informacion)
        elif opcion == 6:
            eliminar_vehiculo(informacion)
        elif opcion == 7:
            eliminar_propietario(informacion)
        elif opcion == 8:
            pass
        elif opcion == 9:
            print('Salir')


menu()
