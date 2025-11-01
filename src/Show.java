import java.util.ArrayList;

public class Show {
    String title;
    int duration;
    Director director;
    ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void addActor(Actor newActor) {
        if (listOfActors.contains(newActor)) {
            System.out.println("Этот актер уже есть в списке");
        } else {
            listOfActors.add(newActor);
            System.out.println("Новый актер добавлен в спектакль");
        }
    }

    public void actorReplacement(String surnameToReplace, Actor newActor) {
        boolean isActorFound = false;

        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equalsIgnoreCase(surnameToReplace)) {
                listOfActors.set(i, newActor);
                System.out.println("Актер с фамилией " + surnameToReplace + " заменен на " + newActor);
                isActorFound = true;
                break;
            }
        }

        if (!isActorFound) {
            System.out.println("Актер с фамилией " + surnameToReplace + " не найден в спектакле");
        }
    }

}