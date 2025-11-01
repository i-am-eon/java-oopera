import java.util.ArrayList;
import java.util.Scanner;

public class MusicalShow extends Show {
    Person musicAuthor;
    String librettoText;

    public MusicalShow(String title, int duration, Director director, ArrayList<Actor> listOfActors,
                       Person musicAuthor, String librettoText) {
        super(title, duration, director, listOfActors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    void printLibrettoText() {
        System.out.println(librettoText);
    }


    void printAllActor() {
        for (Actor actor : listOfActors) {
            System.out.println(actor.getName() + " " + actor.getSurname() + " (" + actor.getHeight() + " см)");
        }
    }

    @Override
    public String toString() {
        return "Музыкальное шоу: " + title +
                "\nДлительность: " + duration + " мин" +
                "\nРежиссер: " + director +
                "\nАвтор музыки: " + musicAuthor +
                "\nАктёры: " + listOfActors +
                "\nЛибретто: " + librettoText +
                "\n ";
    }
}
