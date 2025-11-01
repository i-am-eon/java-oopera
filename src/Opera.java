import java.util.ArrayList;

public class Opera extends MusicalShow {
    int choirSize;

    public Opera(String title, int duration, Director director, ArrayList<Actor> listOfActors, Person musicAuthor,
                 String librettoText, int choirSize) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    @Override
    public String toString() {
        return "Опера: " + title +
                "\nДлительность: " + duration + " мин" +
                "\nРежиссер: " + director +
                "\nАвтор музыки: " + musicAuthor +
                "\nРазмер хора: " + choirSize +
                "\nАктёры: " + listOfActors +
                "\nЛибретто: " + librettoText +
                "\n ";
    }

}
