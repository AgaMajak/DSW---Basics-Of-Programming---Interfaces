package ExerciseB2;

public class MojaKlasa implements PierwszyInterfejs, DrugiInterfejs {
    @Override
    public void f(int number) {
        System.out.println("f");
    }

    @Override
    public void f(double number) {
        System.out.println("f");
    }
}

//Klasa wymagała zaimplementowania dwóch osobnych metod z obu interfejsów.