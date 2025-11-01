import java.util.ArrayList;

class Ballet extends MusicalShow {
    private Person choreographer;

    public Ballet(String title, int duration, Director director, ArrayList<Actor> listOfActors, Person musicAuthor,
                  String librettoText, Person choreographer) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    public Person getChoreographer() {
        return choreographer;
    }

    @Override
    public String toString() {
        return "Балет: " + getTitle() +
                "\nДлительность: " + getDuration() + " мин" +
                "\nРежиссер: " + getDirector() +
                "\nАвтор музыки: " + getMusicAuthor() +
                "\nХореограф: " + getChoreographer() +
                "\nАктёры: " + getListOfActors() +
                "\nЛибретто: " + getLibrettoText() +
                "\n ";
    }

}