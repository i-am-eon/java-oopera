import java.util.ArrayList;
import java.util.Scanner;

class MusicalShow extends Show {
    private Person musicAuthor;
    private String librettoText;

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
        for (Actor actor : getListOfActors()) {
            System.out.println(actor.getName() + " " + actor.getSurname() + " (" + actor.getHeight() + " см)");
        }
    }

    public Person getMusicAuthor() {
        return musicAuthor;
    }

    public String getLibrettoText() {
        return librettoText;
    }

    @Override
    public String toString() {
        return "Музыкальное шоу: " + getTitle() +
                "\nДлительность: " + getDuration() + " мин" +
                "\nРежиссер: " + getDirector() +
                "\nАвтор музыки: " + getMusicAuthor() +
                "\nАктёры: " + getListOfActors() +
                "\nЛибретто: " + getLibrettoText() +
                "\n ";
    }

}
