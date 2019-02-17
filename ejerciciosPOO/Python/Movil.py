'''
Created on 9 feb. 2019

__author__ = Francisco Javier González Sabariego
'''

from Terminal import *

class Movil (Terminal):
  
    """
    * Constructor.
    * @param numero  Número (String) del terminal.
    * @param tarif   Tarifa (String) asociada al terminal.
    """
    def __init__(self, numero, tarif):
    
        Terminal.__init__(self, numero)   
        self.__tarifa = tarif  
        self.__factura = 0


    """
    * Obtiene el total de facturación de cada terminal, en función 
    * del tiempo de las llamadas que ha realizado y de la __tarifa 
    * que tenga contratada.
    * 
    * @return Total a pagar (double), en euros, de __factura
    """
    def getFactura(self):
    
        """
        * Si tiene un tipo de __tarifa u otro multiplica el precio por segundos
        * al tiempo de llamada realizado por el móvil y lo divide entre 100 
        * para entregar un valor en euros.
        """
        if self.__tarifa == "rata":
        
            self.__factura += (self.getTiempoLlamadaRealizada()*0.1)/100
        
        elif self.__tarifa == "mono":
        
            self.__factura += (self.getTiempoLlamadaRealizada()*0.2)/100
        
        else:
        
            self.__factura += (self.getTiempoLlamadaRealizada()*0.5)/100
        
        
        return self.__factura
  
    """
    * Método toString, retorna el estado del terminal.
    * 
    * @return Retorna (String) estado del móvil.
    """
    def __str__(self):
    
        return "Nº " + self.numeroTlf + " - " + str(self.tiempoLlamada) + "s de conversación - tarificados " + str(self.getFactura()) + " euros"
    




if __name__ == "__main__":
    
    m1 = Movil("667 20 16 94", "rata")
    m2 = Movil("677 31 54 77", "mono")
    m3 = Movil("670 46 22 12", "bisonte")
    
    print(m1.__str__())
    print(m2.__str__())
    
    m1.llama(m2, 320)
    m1.llama(m3, 200)
    m2.llama(m3, 550)
    
    print(m1.__str__())
    print(m2.__str__())
    print(m3.__str__())