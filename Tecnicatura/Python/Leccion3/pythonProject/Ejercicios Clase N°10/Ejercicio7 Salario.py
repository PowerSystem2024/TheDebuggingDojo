# Clase 10 Ejercicios y mucha práctica Lunes 10/06/2024

# Ejercicio N°7:
'''Dadas las horas trabajadas de 5 personas y la tarifa de pago.
Calcular el salario y la sumatoria de todos los salarios.'''

suma = 0

for i in range(5):
    print(f'Salario del empleado N°{i + 1}')
    horas = int(input("Digite las horas trabajadas: "))
    tarifa = float(input("Digite la tarifa $ "))
    salario = horas * tarifa
    print(f'El salario del empleado N°{i + 1} es $ {salario}')
    print('')
    suma += salario

print(f'La sumatoria de todos los salarios es $ {suma}')