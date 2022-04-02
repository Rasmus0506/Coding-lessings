public enum FruitType {
    APPLE()
    BANANA()
    TOMATO()

   int nutrition;

    public getNutrition();{
        this.nutrition = nutrition;
    }
}



//OPG 17:6
/*
17.6:
Lav en klasse kaldet Fruit med ingen attributter

Lav en enum kaldet FruitType med følgende instanser
APPLE, BANANA, TOMATO

enumen skal have en attribut kaldet nutrition som er typen int
Lav en getNutrition metode der returnere nutrition og som ikke tager imod nogle argumenter

Gå tilbage til Fruit klassen og tilføj FruitType som en attribut som bliver sat via constructoren
Lav en print metode der printer hvilken type det er og hvad nutrition værdien er af den type

Ude i main metoden/en metode i main klassen skal du gøre følgende:
Spørg brugeren hvilken frugt han gerne vil lave
Check om frugten findes ellers spørg igen
Når frugttypen er fundet så lav en instans af Fruit og kald derefter print på instansen
 */