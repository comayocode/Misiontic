''' 
----- Calculadora -----
1) Sumar
2) Restar
3) Salir
>>>
'''

def solicitarNumeros():
    #Convertir el input a float
    n1 = float(input("Ingrese el primer número: "))
    n2 = float(input("Ingrese el segundo número: "))
    #Encapsular las vasriables en una tupla
    return (n1, n2)

def menu():
    mensaje_menu = '----- Calculadora -----\n'
    mensaje_menu += "1) Sumar\n"
    mensaje_menu += "2) Restar\n"
    mensaje_menu += "3) Multiplicar\n"
    mensaje_menu += "4) Dividir\n"
    mensaje_menu += "5) Potencia\n"
    mensaje_menu += "6) Salir\n"
    mensaje_menu += " >>> "

    opcion = 0
    while opcion != 6:
        #Obtener la opcion ingresada por el usuario y convertirla enentero
        opcion = int(input(mensaje_menu))
        #Evaluar la opcion ingresada
        if opcion == 1:
            #Desempaquetar tupla
            n1, n2 = solicitarNumeros()
            print(f"\nLa suma es: {n1+n2}\n")
        elif opcion == 2:
            n1, n2 = solicitarNumeros()
            print(f"\nLa resta es: {n1-n2}\n")
        elif opcion == 3:
            n1, n2 = solicitarNumeros()
            print(f"\nLa multiplicación es: {n1*n2}\n")
        elif opcion == 4:
            n1, n2 = solicitarNumeros()
            print(f"\nLa división es: {n1/n2}\n")
        elif opcion == 5:
            n1, n2 = solicitarNumeros()
            print(f"\nLa multiplicación es: {n1**n2}\n")
        elif opcion != 6:
            print("Ingrese una opcion valida")


menu()
