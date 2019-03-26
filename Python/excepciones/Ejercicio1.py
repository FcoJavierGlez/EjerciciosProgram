'''
Created on 23 mar. 2019

* Ejercicio 1
 * 
 * Realiza un programa que pida 6 números por teclado y nos diga cuál es el
 * máximo. Si el usuario introduce un dato erróneo (algo que no sea un número
 * entero) el programa debe indicarlo y debe pedir de nuevo el número.

@author: Francisco Javier González Sabariego
'''

#Variables:
numero = 0
minimo = 999999999
maximo = -999999999

#ArrayList:
numeros = list()


for i in range (0,6):    
    try:
        numero = int(input("Inserte un número entero: "))
        numeros.append(numero);
    except ValueError:
        print("ERROR. Debe insertar un número entero.")
        i-=1


print("\nEstos son los números que ha insertado:")

for i in range (0, len(numeros)):
    if minimo>numeros[i]:
        minimo = numeros[i]
    else:
        maximo = numeros[i]
  
    print(numeros[i])

print("\nEl mínimo es:", minimo)
print("El máximo es:", maximo)

