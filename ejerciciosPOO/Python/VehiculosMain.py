'''

 * Ejercicio 2
 * Crea la clase Vehiculo, así como las clases Bicicleta y Coche como subclases de
 * la primera. Para la clase Vehiculo, crea los atributos de clase vehiculosCreadosy
 * kilometrosTotales, así como el atributo de instancia kilometrosRecorridos. Crea
 * también algún método específico para cada una de las subclases. Prueba las
 * clases creadas mediante un programa con un menú como el que se muestra
 * a continuación:<br><br>
 * 
 * VEHÍCULOS<br>
 * =========<br>
 * 1. Anda con la bicicleta<br>
 * 2. Haz el caballito con la bicicleta<br>
 * 3. Anda con el coche<br>
 * 4. Quema rueda con el coche<br>
 * 5. Ver kilometraje de la bicicleta<br>
 * 6. Ver kilometraje del coche<br>
 * 7. Ver kilometraje total<br>
 * 8. Salir<br>
 * Elige una opción (1-8):<br>
 
Created on 6 feb. 2019

__author__ = Francisco Javier González Sabariego

'''

from Coche import *
from Bicicleta import *

    
'''
* Imprime menú, lee la opción elegida y la retorna.
* 
* @return  Retorna (entero) opción del menú.
'''
def menu():
    
    opcionMenu = 0;
    
    while opcionMenu<1 or opcionMenu>8:
  
        print("\n\nVEHÍCULOS")
        print("\n=========")
        print("\n1. Anda con la bicicleta")
        print("\n2. Haz el caballito con la bicicleta")
        print("\n3. Anda con el coche")
        print("\n4. Quema rueda con el coche")
        print("\n5. Ver kilometraje de la bicicleta")
        print("\n6. Ver el kilometraje del coche")
        print("\n7. Ver kilometraje total")
        print("\n8. Salir")
        opcionMenu = int(input("\nElije una opición (1-8):"))

    return opcionMenu



    
    


#Variable selección de menú:
opcionMenu = 0;

km = 0

#Instancias de la clase Coche y Bicicleta, subclases de la superclase Vehiculo:
coche = Coche("Ferrari", "F-40")

bici = Bicicleta("Spinner", "T32-X")


##############     PROGRAMA     ##############


while True:
    
    opcionMenu = menu()
        
    if opcionMenu==1:  
        km = int(input("\n\n¿Cuántos kilómetros recorre?"))
        bici.setAnda(km)
        
    elif opcionMenu==2:
        print("\n\n" + bici.getHazCaballito())
        
    elif opcionMenu==3: 
        km = int(input("\n\n¿Cuántos kilómetros recorre?")) 
        coche.setAnda(km)
        
    elif opcionMenu==4:
        print("\n\n" + coche.quemaRueda())
        
    elif opcionMenu==5:
        print("\n\nLa bicicleta ha recorrido: " + bici.getKilometraje())
        
    elif opcionMenu==6:
        print("\n\nEl coche ha recorrido: " + coche.getKilometraje())
        
    elif opcionMenu==7:
        print(bici.getKilometrajeTotal())
        #print("\n\nEl kilometraje total es: " + Vehiculo.getKilometrajeTotal())
            
    else:
        print("\nFIN DE PROGRAMA")
        exit(0)
