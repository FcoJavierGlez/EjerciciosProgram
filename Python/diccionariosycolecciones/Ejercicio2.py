'''
Created on 23 mar. 2019

 * Ejercicio 2:
 * 
 * Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
 * ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de esos
 * números. El tamaño de la lista también será aleatorio y podrá oscilar entre 10
 * y 20 elementos ambos inclusive.

@author: Francisco Javier González Sabariego
'''

import random

lista = list()
aleatorio = int((random.random()*10)+11)
suma = 0
minimo=1000
maximo=0

for i in range(aleatorio+1):
    a=int(random.random()*101)
    lista.append(a)

lista.sort(key=None, reverse=False)

for i in range (aleatorio+1):
    print(lista[i])
    suma += lista[i]
    if minimo>lista[i]:
        minimo=lista[i]
    if maximo<lista[i]:
        maximo=lista[i]

print("\nLa suma es: ", end="")
print(suma)
print("La media es: ", end="")
print(suma/len(lista))
print("El mínimo es: ", end="")
print(minimo)
print("El máximo es: ", end="")
print(maximo)

