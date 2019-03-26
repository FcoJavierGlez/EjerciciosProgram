'''
Created on 23 mar. 2019

 * Ejercicio 10
 * 
 * Crea un mini-diccionario español-inglés que contenga, al menos, 20 palabras
 * (con su correspondiente traducción). Utiliza un objeto de la clase HashMap para
 * almacenar las parejas de palabras. El programa pedirá una palabra en español
 * y dará la correspondiente traducción en inglés.
 
@author: Francisco Javier González Sabariego
'''

#Diccionaro con 20 palabras español-inglés:
d=dict(casa='house', agua='water', fuego='fire', tierra='dirt', aire='air', camino='path',
        rojo='red', azul='blue', verde='green', morado='purple', naranja='orange', negro='black', 
        blanco='white', amarillo='yellow', papel='paper', radio='radio', noticias='news', coche='car', 
        perro='dog', gato='cat')

palabra=input("\nIntroduce una palabra en castellano:")

try:
    print(d[palabra])
except KeyError:
    print("No se ha encontrado la palabra solicitada.")
    

#########################   FIN DE PROGRAMA   #########################

'''
print(d["milk"]) #Esto imprime el valor encontrado en la key "milk"
'''
    

#Esto recorre el diccionaro como un bucle for each:
'''
diccionario=d.items() #Variable que almacena todos los valores del diccionario

for espanol, ingles in diccionario:
    print(espanol, '--->', ingles)
'''



