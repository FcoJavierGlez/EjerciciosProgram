'''
Created on 17 ene. 2019

@author: FJGS_
'''

class Fraccion:
    
    #Atributos:
    numerador=int(1)
    denominador=int(2)
    
    
    #Constructor
    def __init__(self, entrada1, entrada2):
    
        numerador=entrada1
    
        denominador=entrada2
    
    
    
    #Métodos:
    def __str__(self):
    
        return self.numerador, "/", self.denominador
    
    
    
    def obtenerNumerador(self):
    
        return self.numerador
    
    
    
    def cambiarNumerador(self, valor):
    
        self.numerador = valor
    
        
    
    def obtenerDenominador(self):
    
        return self.denominador
    
    
    
    def cambiarDenominador(self, valor):
        
        self.denominador = valor
      
        while self.denominador==0:
            self.denominador=int(input("\n\nLo siento el denominador no puede ser igual a cero. Introduzca otro número."))
            
            
    
    def obtenerResultadoFraccion(self):
    
        return self.numerador/self.denominador
    
    
    
    def multiplicaPorNumero(self, valor):
    
        return (self.numerador*valor, "/", self.denominador)
    
    
    
    def simplificaFraccion(self, valorNumerador, valorDenominador):
    
        numeroDivisor=2
    
        while (valorNumerador!=1 and valorDenominador!=1 and not(numeroDivisor>valorNumerador or numeroDivisor>valorDenominador)):
      
            if valorNumerador%numeroDivisor==0 and valorDenominador%numeroDivisor==0:
                
                valorNumerador/=numeroDivisor
                valorDenominador/=numeroDivisor
                
            else:
                
                numeroDivisor+=1
    
    
    
    def sumaFraccion(self, fraccion):
    
        denominadorComun = self.denominador*fraccion.denominador
    
        if self.denominador==fraccion.denominador:
      
            return "Resultado suma: ", (self.numerador+fraccion.numerador), "/", self.denominador
      
        else:
            
            #Realizando cambios:
            self.cambiarNumerador((self.numerador*(self.denominador/denominadorComun)) + (fraccion.numerador*(fraccion.denominador/denominadorComun)))
            self.cambiarDenominador(denominadorComun)
            
            simplificaFraccion(self.numerador, self.denominador)
            
        print("Resultado suma: " + self.__str__())
    
    
    
    def restaFraccion(self, fraccion):
    
        denominadorComun = self.denominador*fraccion.denominador
    
        if self.denominador==fraccion.denominador:
      
            return "Resultado resta: ", (self.numerador-fraccion.numerador), "/", self.denominador
      
        else:
        
            #Realizando cambios:
            self.cambiarNumerador((self.numerador*(self.denominador/denominadorComun)) - (fraccion.numerador*(fraccion.denominador/denominadorComun)))
            self.cambiarDenominador(denominadorComun)
            
            print("Resultado suma: ", simplificaFraccion(self.numerador, self.denominador)
    
    
    
    def simplificar(self):
    
        numeroDivisor=2
    
        while (self.numerador!=1 and self.denominador!=1 and not(numeroDivisor>self.numerador or numeroDivisor>self.denominador)):
      
            if self.numerador%numeroDivisor==0 and self.denominador%numeroDivisor==0:
                self.numerador/=numeroDivisor;
                self.denominador/=numeroDivisor;
            else:
                numeroDivisor+=1
    
        return self.numerador, "/", self.denominador
    
    
    
    def multiplicaFraccion(self, fraccion):
        
        return "Resultado multiplicación: ", simplificaFraccion(self.numerador*fraccion.numerador, self.denominador*fraccion.denominador)
    
    
    
    def divideFraccion(self, fraccion):
    
        return "Resultado división: ", simplificaFraccion(self.numerador*fraccion.denominador, self.denominador*fraccion.numerador)
    
    
    

  
  

  
  
  
  
  
  
  
  
  
  
  
  
