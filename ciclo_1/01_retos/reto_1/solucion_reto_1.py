def CDT(usuario: str, capital: int, tiempo: int):
    if tiempo > 2:
        valor_intereses = capital * 3/100 * tiempo / 12
        valorTotal = capital + valor_intereses
        return f"Para el usuario {usuario} La cantidad de dinero a recibir, según el monto inicial {capital} para un tiempo de {tiempo} meses es: {valorTotal}"
    else:
        valorPerder = capital * 2/100
        valorTotal = capital - valorPerder
        return ("Para el usuario {usuario} La cantidad de dinero a recibir, según el monto inicial {capital} para un tiempo de {tiempo} meses es: {valorTotal}")

print(CDT("AB1012", 1000000, 3))
print(CDT("ER3366", 650000, 2))
