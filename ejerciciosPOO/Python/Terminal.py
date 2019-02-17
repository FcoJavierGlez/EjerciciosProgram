'''
Created on 9 feb. 2019

__author__ = Francisco Javier González Sabariego
'''


class Terminal:
  
    def __init__(self, numero):
    
        self.numeroTlf = numero    
        self.tiempoLlamada = 0              #Tiempo de llamada tanto si la realizada como si la recibe.
        self.tiempoLlamadaRealizada = 0     #Tiempo de llamada si la realiza.

    
    """
    Constructor
    """
    def __str__(self):
    
        return "Nº " + self.numeroTlf + " - " + str(self.tiempoLlamada) + "s de conversación"
    
    
    """
    * Método que cuenta la duración de una llamada desde una instancia de la
    * Clase Terminal a otra instancia de la misma (el tiempo de llamada, se 
    * suma para ambas instancias, tanto para el llamado como para el llamante).
    * 
    * @param tlf     Instancia que recibe la llamada.
    * @param tiempo  Cantidad de segundos (int) que dura la llamada.
    """
    def llama(self, tlf, tiempo):
    
        self.tiempoLlamada += tiempo                            
        self.tiempoLlamadaRealizada = self.tiempoLlamada        #Almaceno duración de llamada para el llamante
        tlf.tiempoLlamada += tiempo
  
    
    """
    * Devuelve el tiempo que ha durado la llamda.
    * 
    * @return  segundos (int) de llamada.
    """
    def getTiempoLlamada(self):
    
        return self.tiempoLlamada
  
    
    """
    * Devuelve el tiempo acumulado de llamadas realizadas.
    * 
    * @return  Segundos (int) llamadas realizadas.
    """
    def getTiempoLlamadaRealizada(self):  
    
        return self.tiempoLlamadaRealizada



if __name__ == "__main__":
    
    t1 = Terminal("667 90 46 22")
    t2 = Terminal("667 50 12 73")
    t3 = Terminal("670 51 02 30")  
    t4 = Terminal("697 20 91 57")
    
    print(t1.__str__())
    print(t2.__str__())
    
    t1.llama(t2, 320)
    t1.llama(t3, 200)
    
    print(t1.__str__())
    print(t2.__str__())
    print(t3.__str__())
    print(t4.__str__())
    