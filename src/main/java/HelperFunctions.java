public class HelperFunctions {

    // Funkcija pakuria random skaičių nuo min iki max.
    public static int generateNewId(){
        int min = 1;
        int max = 1000;
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        return random_int;
    }
}
