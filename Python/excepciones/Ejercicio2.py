'''
Created on 23 mar. 2019

* Ejercicio 2
 * 
 * Modifica la clase Gato vista anteriormente añadiendo el método apareaCon.
 * Este método debe comprobar que los gatos son de distinto sexo, tras lo
 * cual, genera un nuevo gato. Por ejemplo, sería válido algo como Gato cria
 * = garfield.apareaCon(lisa). En caso de que los gatos sean del mismo sexo,
 * el método debe generar la excepción ExcepcionApareamientoImposible. Crea un
 * programa desde el que se pruebe el método.
 
@author: Francisco Javier González Sabariego
'''

from excepciones.GatoSimple import GatoSimple, ExcepcionApareamientoImposible


garfield = GatoSimple("macho")
lisa = GatoSimple("hembra")
tom = GatoSimple("macho")


print("Garfield va a intentar aparearse con Tom:")
try:
    garfield.apareaCon(tom)
except ExcepcionApareamientoImposible:
    print("No se pueden aparear dos gatos del mismo sexo")


print("Garfield va a intentar aparearse con Lisa:")
try:
    garfield.apareaCon(lisa)
except ExcepcionApareamientoImposible:
    print("No se pueden aparear dos gatos del mismo sexo")




