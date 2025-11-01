import java.util.ArrayList;

class Opera extends MusicalShow {
    private int choirSize;

    public Opera(String title, int duration, Director director, ArrayList<Actor> listOfActors, Person musicAuthor,
                 String librettoText, int choirSize) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    public int getChoirSize() {
        return choirSize;
    }

    @Override
    public String toString() {
        return "Опера: " + getTitle() +
                "\nДлительность: " + getDuration() + " мин" +
                "\nРежиссер: " + getDirector() +
                "\nАвтор музыки: " + getMusicAuthor() +
                "\nРазмер хора: " + getChoirSize() +
                "\nАктёры: " + getListOfActors() +
                "\nЛибретто: " + getLibrettoText() +
                "\n ";
    }

}
