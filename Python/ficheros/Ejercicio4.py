'''
Created on 4 abr. 2019

 * Ejercicio 4
 * 
 * Realiza un programa que sea capaz de ordenar alfabéticamente las palabras
 * contenidas en un fichero de texto. El nombre del fichero que contiene las
 * palabras se debe pasar como argumento en la línea de comandos. El nombre
 * del fichero resultado debe ser el mismo que el original añadiendo la coletilla
 * sort, por ejemplo palabras_sort.txt. Suponemos que cada palabra ocupa una
 * línea.

__author__ Francisco Javier González Sabariego
'''

import sys

lista=list()

try:
    r = open('palabras.txt','r');
    
    linea = r.readline().rstrip('\n')
    
    while (True):
        lista.append(linea)
        linea = r.readline().rstrip('\n')
        if linea == '':
            break
    
    r.close()

except OSError:
    sys.stderr.write("No se ha podido leer el fichero.")
    

lista.sort(key=None, reverse=False)


try:
    w = open('palabras_sort.txt','w');
    
    for i in lista:
        w.write(i+"\n")
    
    w.close()

except OSError:
    sys.stderr.write("No se ha podido escribir en el fichero.")
