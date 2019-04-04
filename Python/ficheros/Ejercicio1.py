'''
Created on 3 abr. 2019

 * Ejercicio 1
 * 
 * Escribe un programa que guarde en un fichero con nombre primos.dat los
 * números primos que hay entre 1 y 500.
 * 
 * 
 * @author Francisco Javier González Sabariego


@author: FJGS_
'''

import sys
import math


def esPrimo(entrada):
    '''
    * Determina si el número introducido es o no primo.
    *
    * @param entrada Número entero a comprobar si es primo
    * @return        True si el número de entrada es primo, False si no lo es
    '''
    divisor = 2
  
    while (divisor<=math.sqrt(entrada) or entrada==0 or entrada==1):
        if (entrada%divisor==0 or entrada==1):
            return False
        
        divisor += 1
    
    return True


try:
    w = open('ejercicio1.txt','w');
    
    for i in range (2, 501):
        if esPrimo(i):
            print(i)
            w.write(str(i) + "\n")
    
    w.close()

except OSError:
    sys.stderr.write("No se ha podido escribir en el fichero.")