import java.util.ArrayList;

class Ballet extends MusicalShow {
    Person choreographer;

    public Ballet(String title, int duration, Director director, ArrayList<Actor> listOfActors, Person musicAuthor,
                  String librettoText, Person choreographer) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    @Override
    public String toString() {
        return "Балет: " + title +
                "\nДлительность: " + duration + " мин" +
                "\nРежиссер: " + director +
                "\nАвтор музыки: " + musicAuthor +
                "\nХореограф: " + choreographer +
                "\nАктёры: " + listOfActors +
                "\nЛибретто: " + librettoText +
                "\n ";
    }

}