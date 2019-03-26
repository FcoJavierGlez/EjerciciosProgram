'''
Created on 23 mar. 2019

 * Ejercicio 11
 * 
 * Realiza un programa que escoja al azar 5 palabras en español del minidiccionario
 * del ejercicio anterior. El programa irá pidiendo que el usuario
 * teclee la traducción al inglés de cada una de las palabras y comprobará si
 * son correctas. Al final, el programa deberá mostrar cuántas respuestas son
 * válidas y cuántas erróneas.
 
@author: Francisco Javier González Sabariego
'''

import random

d=dict(casa='house', agua='water', fuego='fire', tierra='dirt', aire='air', camino='path',
        rojo='red', azul='blue', verde='green', morado='purple', naranja='orange', negro='black', 
        blanco='white', amarillo='yellow', papel='paper', radio='radio', noticias='news', coche='car', 
        perro='dog', gato='cat')

lista = list()

lista.append("casa");
lista.append("agua");
lista.append("fuego");
lista.append("tierra");
lista.append("aire");
lista.append("camino");
lista.append("rojo");
lista.append("azul");
lista.append("verde");
lista.append("morado");
lista.append("naranja");
lista.append("negro");
lista.append("blanco");
lista.append("amarillo");
lista.append("papel");
lista.append("radio");
lista.append("noticias");
lista.append("coche");
lista.append("perro");
lista.append("gato");

azar = 0
aciertos = 0


for i in range (5,0,-1):
    print("Tienes", i, "intentos")
    azar = int(random.random()*21)
    print(lista[azar])
    palabra=input("\nIntroduce la palabra correspondiente en inglés:")
    if palabra==d.get(lista[azar], 0):
        print("\nCorrecto\n\n")
        aciertos += 1
    else:
        print("\nIncorrecto\n\n")

print("\nRecuento final:", aciertos, "aciertos.")





