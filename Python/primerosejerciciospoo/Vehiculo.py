
'''
* Clase Vehiculo, superclase de las clases Coche y Bicicleta.<br><br>
* 
* Hace uso de los siguientes métodos:<br><br>
* 
* <ul>
* <li>Vehiculo()</li>
* <li>setKilometrajeTotal()</li>
* <li>setAnda()</li>
* <li>getKilometraje()</li>
* <li>getKilometrajeTotal()</li>
* <li>setTotalVehiculos()</li>
* </ul>
*
* Created on 6 feb. 2019
* 
* __author__ = Francisco Javier González Sabariego
*
*'''


class Vehiculo:    
    
    #Variables de clase:  
    
    __kilometrajeTotal = 0  #Atributo privado
  
    __totalVehiculos = 0    #Atributo privado
    
    #Constructor:
    def __init__(self, marca, modelo):
        
        Vehiculo.__totalVehiculos += 1      #Incrementa el número de vehículos
        
        self.marcaVehiculo = marca          #Marca de la instancia
        
        self.modeloVehiculo = modelo        #Modelo de la instancia
        
        self.kilometros = 0                 #Kilómetros iniciales
        
    
    
    '''
    * Añade cantidad de km que recorre una instancia de las subclases Coche CocheiclBicicleta *  
    * @param km  Introduce (double) cantidad de km recorridos por todos la instancia.
    *'''
    def setAnda(self, km):
    
        self.kilometros += km;              #Incrementa los kilómetros de la instancia
    
        Vehiculo.__kilometrajeTotal+=km     #Incrementa los kilómetros totales
    
        
    '''
    * Muestra la cantidad de km que ha recorrido una instancia de la subclase Coche y CocheletBicicleta 
    * @return Devuelve (double) cantidad de km recorridos por todos la instancia.
    *'''
    def getKilometraje(self):
    
        return self.kilometros
        
    
    '''
    * Muestra el kilometraje total (suma de todos los km recorridos por cada vehículo).
    * 
    * @return Devuelve (double) con la cantidad de vehículos creados. 
    *
    '''
    def getKilometrajeTotal(self):
        
        return Vehiculo.__kilometrajeTotal


    '''
    *  Cada instancia que se crea de la superclase Vehiculo incrementa la cantidad total 
    *  de vehículos existentes.
    *  
    * @return  Devuelve (entero) con la cantidad de vehículos creados.
    *'''
    def getTotalVehiculos(self):
    
        return self.totalVehiculos;


    



