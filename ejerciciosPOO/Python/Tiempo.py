'''
Created on 9 feb. 2019

__author__ = Francisco Javier González Sabariego
'''

'''
* Crea la clase Tiempo con los métodos suma y resta. Los objetos de la clase Tiempo
* son intervalos de tiempo y se crean de la forma Tiempo t = new Tiempo(1, 20,
* 30) donde los parámetros que se le pasan al constructor son las horas, los
* minutos y los segundos respectivamente. Crea el método toString para ver los
* intervalos de tiempo de la forma 10h 35m 5s. Si se suman por ejemplo 30m 40s y
* 35m 20s el resultado debería ser 1h 6m 0s. Realiza un programa de prueba para
* comprobar que la clase funciona bien.
*
*
* @author Francisco Javier González Sabariego
*
'''

class Tiempo:
    
    '''
    * Constructor de la Clace Tiempo.
    * 
    * @param hor Número de horas (int) [0-23]
    * @param min Número de minutos (int) [0-59]
    * @param seg Número de segundos (int) [0-59]
    '''
    def __init__(self, hor, minut, seg):
      
        self.horas = hor
      
        self.minutos = minut
      
        self.segundos = seg
    
    #Métodos:
    
    '''
    * Método que retorna la instancia en forma de String.
    * 
    * @return Devuelve el valor de la instancia en formato 00h:00m:00s
    '''
    def __str__(self):
      
        hora = ""
      
        minuto = ""
      
        segundo = ""
      
        #Añadimos un 0 delante de cada valor si este es inferior a 10
        #Horas:
        if self.horas<10:
        
            hora = "0" + str(self.horas)
        
        else:
        
            hora = str(self.horas)
        
        
        #Minutos:
        if self.minutos<10:
        
            minuto = "0" + str(self.minutos)
        
        else:
        
            minuto = str(self.minutos)
      
        #Segundos:
        if self.segundos<10:
        
            segundo = "0" + str(self.segundos)
        
        else:
        
            segundo = str(self.segundos)
      
        
        return hora + "h:" + minuto + "m:" + segundo + "s"
    
    '''
    * Suma el tiempo de una instancia de la clase Tiempo a otra instancia.
    * 
    * @param tiempo  Recibe una instancia de la clase tiempo.
    '''
    def suma(self, tiempo):
      
        self.segundos += tiempo.segundos
        
        self.minutos += tiempo.minutos
        
        self.horas += tiempo.horas
        
        self.regulaSuma()
    
    '''
    * Evita que los minutos y/o segundos rebasen el valor de los 59, 
    * además de evitar que las horas rebasen las 23h.
    '''
    def regulaSuma(self):
      
        if self.segundos>59:     
            self.minutos += self.segundos//60
            
            self.segundos %= 60
        
        if self.minutos>59:   
            self.horas += self.minutos//60
            
            self.minutos %= 60
        
        if self.horas>23:    
            self.horas %= 24
    
    
    '''
    * Resta el tiempo de una instancia de la clase Tiempo a otra instancia.
    * 
    * @param tiempo  Recibe una instancia de la clase tiempo.
    '''
    def resta(self, tiempo):
      
        '''
        * Si la cantidad de segundos de la instancia que deseamos modificar es superior 
        * a la de la instancia que le pasamos como parámetro haz una resta normal:
        '''   
        if self.segundos>tiempo.segundos:
        
            self.segundos -= tiempo.segundos
        
        else:       #Si no, haz la resta, suma a los segundos 60" y quita 1 minuto
        
            self.segundos -= tiempo.segundos
        
            self.segundos += 60
        
            self.minutos -= 1
      
        
        """
        * Si la cantidad de minutos de la instancia que deseamos modificar es superior 
        * a la de la instancia que le pasamos como parámetro haz una resta normal:
        """
        if self.minutos>tiempo.minutos:
        
            self.minutos -= tiempo.minutos
        
        else:       #Si no, haz la resta, suma a los minutos 60' y quita 1 hora
        
            self.minutos -= tiempo.minutos
        
            self.minutos += 60
        
            self.horas -= 1
      
        """
        * Si la cantidad de horas de la instancia que deseamos modificar es superior 
        * a la de la instancia que le pasamos como parámetro haz una resta normal:
        """
        if self.horas>tiempo.horas:
        
            self.horas -= tiempo.horas
        
 
        else: #Si no, haz la resta, y suma a las horas de la instancia 24
        
            self.horas -= tiempo.horas
        
            self.horas += 24
    
    

if __name__ == "__main__":
    
    time1 = Tiempo(7,40,50)
    
    time2 = Tiempo(23,22,30)
    
    time3 = Tiempo(0,0,0)
    
    time4 = Tiempo(23,59,59)
    
    time1.suma(time2)
    
    time3.resta(time4)
    
    print(time1.__str__())
    
    print(time2.__str__())
    
    print(time3.__str__())
    
    
    