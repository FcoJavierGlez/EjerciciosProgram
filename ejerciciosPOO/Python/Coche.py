'''
Created on 6 feb. 2019

__author__ = Francisco Javier González Sabariego
'''

from Vehiculo import Vehiculo

'''
* Clase Coche, subclase de Vehiculo.<br><br>
* 
* Hace uso de los siguientes métodos:<br><br>
* 
* <ul>
* <li>Coche()</li>
* <li>getQuemaRueda()</li>
* </ul>
* 
* @author Francisco Javier González Sabariego
*
'''

class Coche (Vehiculo):
    
    def __init__(self, marca, modelo):
    
        Vehiculo.__init__(self, marca, modelo)
    
    '''
    * La instancia de la clase Coche quema rueda.
    * 
    * @return Devuelve String "Estoy quemando rueda."
    *'''
    def quemaRueda(self):
    
        return "\nEstoy quemando rueda."
    
    
    



