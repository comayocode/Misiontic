
repetir = True
while repetir:
    try:
        n1 = float(input("Ingrese un número: "))
        n2 = float(input("Ingrese otro número: "))
        sum = n1 + n2
        print(f"La suma es {sum}")
        repetir = False
    except:
        print("Dato incorrecto, intenta de nuevo")