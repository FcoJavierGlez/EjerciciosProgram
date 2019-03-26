'''
Created on 23 mar. 2019

 * Ejercicio 3
 * 
 * Escribe un programa que ordene 10 números enteros introducidos por teclado
 * y almacenados en un objeto de la clase ArrayList.
 
@author: Francisco Javier González Sabariego
'''

import random

lista = list()
aleatorio = int((random.random()*10)+11)
numero = 0
minimo=1000
maximo=0

for i in range(0, 10):
    numero = int(input("Introduzca un número entero."))
    lista.append(numero)

lista.sort(key=None, reverse=False)

for i in range (0, 10):
    print(lista[i])






