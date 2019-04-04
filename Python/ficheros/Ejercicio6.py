'''
Created on 4 abr. 2019

 * Ejercicio 6
 * 
 * Realiza un programa que diga cuántas ocurrencias de una palabra hay en un
 * fichero. Tanto el nombre del fichero como la palabra se deben pasar como
 * argumentos en la línea de comandos.
 * 
 * 
 * @author Francisco Javier González Sabariego
'''

import sys

contador=0

palabra= input("Dime la palabra que deseas buscar en el archivo:")

try:
    r = open('ejercicio6.txt','r')
    
    linea = r.readline().rstrip('\n')    
    
    while (True):
        if linea.__eq__(palabra):  #si la linea es igual a la palbra buscada aumentamos el contador
            contador+=1
        linea = r.readline().rstrip('\n')
        if linea == '':  #si no hay nada en la línea rompemos el ciclo
            break

    r.close();

except OSError:
    sys.stderr.write("No se ha podido leer el fichero.")

if contador==0:
    print("No se ha encontrado ninguna ocurrencia de la palabra: " + palabra)
else:
    print("Se han encontrado", contador, "ocurrencias de la palabra:", palabra)

