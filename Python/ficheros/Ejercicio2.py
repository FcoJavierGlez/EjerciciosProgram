'''
Created on 3 abr. 2019

 * Ejercicio 2
 * 
 * Realiza un programa que lea el fichero creado en el ejercicio anterior y que
 * muestre los números por pantalla.
 * 
 * 
 * @author Francisco Javier González Sabariego

@author: FJGS_
'''

import sys

try:
    r = open('Ejercicio1.txt','r');
    
    linea = r.readline()
    
    while (True):
        print(linea, end="")
        linea = r.readline()
        if linea == '':
            break
    
    r.close()

except OSError:
    sys.stderr.write("No se ha podido leer el fichero.")