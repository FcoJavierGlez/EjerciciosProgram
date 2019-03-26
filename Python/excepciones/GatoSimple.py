'''
Created on 15 ene. 2019

@author: González Sabariego Francisco Javier
'''

from excepciones.ExcepcionApareamientoImposible import ExcepcionApareamientoImposible

class GatoSimple():
    
    def __init__(self, sexo):
        self.color="negro"
        self.raza="bombay"
        self.sexo=sexo
        self.edad=int(2)
        self.peso=float(4.1)
    
    #Dice el sexo del gato.
    def getSexo(self):
        return self.sexo
    
    #El gato maulla.
    def maulla(self):
        print("Miauuuuu")
    
    #El gato ronronea.
    def ronronea(self):
        print("Mrrrrrrr")
    
    #El gato come.
    def come(self, comida):
        if comida=="pescado":
            print("Hmmmm, gracias.")
        else:
            print("Lo siento, yo solo como pescado.")
    
    #El gato pelea con otro gato.
    def peleaCon(self, contrincante):
        if self.sexo=="hembra":
            print("No me gusta pelear.")
        else:
            if contrincante.getSexo()=="hembra":
                print("No me gusta pelear contra gatitas.")
            else:
                print("Ven aquí que te vas a enterar.")



    def apareaCon(self, gato):
        if self.getSexo()==gato.getSexo():
            raise ExcepcionApareamientoImposible()
        else:
            print("Acaba de nacer una cría.")


if __name__ == "__main__":
    
    #Gato Garfield
    garfield=GatoSimple("macho")
    
    print("hola gatito")
    garfield.maulla()
    print("toma tarta")
    garfield.come("tarta selva negra")
    print("toma pescado, a ver si esto te gusta")
    garfield.come("pescado")
    
    #Gato Tom
    tom=GatoSimple("macho")
    
    print("tom, toma sopita de verduras")
    tom.come("sopa de verduras")
    
    #Gata Lisa
    lisa=GatoSimple("hembra")
    print("gatitos a ver como maullais")
    garfield.maulla()
    tom.maulla()
    lisa.maulla()
    
    garfield.peleaCon(lisa)
    lisa.peleaCon(tom)
    tom.peleaCon(garfield)
    
    
    