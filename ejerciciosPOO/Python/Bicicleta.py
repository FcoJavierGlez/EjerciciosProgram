'''
Created on 6 feb. 2019

__author__ = Francisco Javier González Sabariego
'''

from Vehiculo import Vehiculo

'''
 * Clase Bicicleta, subclase de Vehiculo.<br><br>
 * 
 * Hace uso de los siguientes métodos:<br><br>
 * 
 * <ul>
 * <li>Bicicleta()</li>
 * <li>getHazCaballito()</li>
 * </ul>
 * 
 * @author Francisco Javier González Sabariego
 *
'''

class Bicicleta (Vehiculo):
    
    '''
     * La instancia de la clase Bicicleta hace el caballito.
     * 
     * @return Devuelve String "Estoy haciendo el caballito"
    '''
    def getHazCaballito(self):
  
        return "\n\nEstoy haciendo el caballito"
    
    
    #Constructor
    def __init__(self, marca, modelo):
    
        Vehiculo.__init__(self, marca, modelo)
  
  
    
