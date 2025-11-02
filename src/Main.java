import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Актеры;
        // Представленным ниже людям указал гендер. При добавлении нового человека гендер будет по умолчанию "UNKNOWN"
        Actor actor1 = new Actor("Владислав", "Васильев", Gender.MALE, 190);
        Actor actor2 = new Actor("Марта", "Матвеева", Gender.FEMALE, 174);
        Actor actor3 = new Actor("Евгения", "Мельникова", Gender.FEMALE, 181);

        // Режиссеры
        Director director1 = new Director("Максим", "Выприцкий", Gender.MALE, 2);
        Director director2 = new Director("Полина", "Симахина", Gender.FEMALE, 1);

        // Прочие сотрудники
        Person choreographer = new Person("Дарья", "Белобородова", Gender.FEMALE);
        Person musicAuthor = new Person("Денис", "Алешин", Gender.MALE);

        // Изначальный список актеров театра
        ArrayList<Actor> allActors = new ArrayList<>();
        allActors.add(actor1);
        allActors.add(actor2);
        allActors.add(actor3);

        // Список актеров Музыкального шоу
        ArrayList<Actor> actorMusicalShow = new ArrayList<>();
        actorMusicalShow.add(actor1);
        actorMusicalShow.add(actor2);

        // Список актеров Балета
        ArrayList<Actor> actorBallet = new ArrayList<>();
        actorBallet.add(actor1);
        actorBallet.add(actor3);

        // Список актеров Оперы
        ArrayList<Actor> actorOpera = new ArrayList<>();
        actorOpera.add(actor2);
        actorOpera.add(actor3);

        // Спектакли
        MusicalShow musicalShow = new MusicalShow("Светлячки", 90, director1, actorMusicalShow, musicAuthor, "Красивая история о светлячках...");
        Ballet ballet = new Ballet("Лебединое озеро", 120, director1, actorBallet, musicAuthor, "Знаменитый и всеми любимый балет...", choreographer);
        Opera opera = new Opera("Ромео и Джульетта", 180, director2, actorOpera, musicAuthor, "Знаменитый роман в виде оперы...", 7);

        while (true) {
            System.out.println("\nВыберите действие:");
            System.out.println("1 - Информация о спектаклях");
            System.out.println("2 - Списки актеров");
            System.out.println("3 - Добавить актера");
            System.out.println("4 - Заменить актера");
            System.out.println("5 - Выйти из программы");

            int cmd = scanner.nextInt();
            scanner.nextLine();

            if (cmd == 1) { // Информация по каждому спектаклю
                System.out.println(" ");
                System.out.println(musicalShow);
                System.out.println(ballet);
                System.out.println(opera);
            } else if (cmd == 2) { // Списки актеров
                System.out.println("\nВсе актеры театра:");
                for (Actor actor : allActors) {
                    System.out.println(actor);
                }

                System.out.println("\nАктеры Музыкального шоу:");
                musicalShow.printAllActor();

                System.out.println("\nАктеры Балета:");
                ballet.printAllActor();

                System.out.println("\nАктеры Оперы:");
                opera.printAllActor();
            } else if (cmd == 3) { // Добавление актера
                addActorToAll(scanner, allActors, musicalShow, ballet, opera);
            } else if (cmd == 4) { // Замена актера
                replaceActorInShow(scanner, allActors, musicalShow, ballet, opera);
            } else if (cmd == 5) { // Выход
                break;
            } else {
                System.out.println("Неизвестная команда");
            }
        }
    }

    private static void addActorToAll(Scanner scanner, ArrayList<Actor> allActors, MusicalShow musicalShow,
                                      Ballet ballet, Opera opera) {
        System.out.println("Добавление нового актера в общий список:");

        System.out.println("Введите имя актера:");
        String name = scanner.nextLine();

        System.out.println("Введите фамилию актера:");
        String surname = scanner.nextLine();

        System.out.println("Введите рост актера:");
        int height = scanner.nextInt();
        scanner.nextLine();

        Actor newActor = new Actor(name, surname, Gender.UNKNOWN, height); // Гендер по умолчанию не определен

        if (allActors.contains(newActor)) {
            System.out.println("Этот актер уже есть в общем списке");
        } else {
            allActors.add(newActor);
            System.out.println("Актер добавлен в общий список");
            System.out.println("Теперь в общем списке " + allActors.size() + " актеров");
        }

        System.out.println("\nВ какой спектакль добавить актера?");
        System.out.println("1 - Музыкальное шоу");
        System.out.println("2 - Балет");
        System.out.println("3 - Опера");
        System.out.println("4 - Не добавлять никуда");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                musicalShow.addActor(newActor);
                break;
            case 2:
                ballet.addActor(newActor);
                break;
            case 3:
                opera.addActor(newActor);
                break;
            case 4:
                System.out.println("Актер не был добавлен ни в один спектакль");
                break;
            default:
                System.out.println("Неизвестная команда. Актер не добавлен в спектакль");
                break;
        }

    }

    private static void replaceActorInShow(Scanner scanner, ArrayList<Actor> allActors, MusicalShow musicalShow,
                                           Ballet ballet, Opera opera) {
        System.out.println("Выберите спектакль для замены актера:");
        System.out.println("1 - Музыкальное шоу");
        System.out.println("2 - Балет");
        System.out.println("3 - Опера");

        int showChoice = scanner.nextInt();
        scanner.nextLine();

        Show selectedShow = null;

        switch (showChoice) {
            case 1:
                selectedShow = musicalShow;
                break;
            case 2:
                selectedShow = ballet;
                break;
            case 3:
                selectedShow = opera;
                break;
            default:
                System.out.println("Неизвестная команда");
                break;
        }

        System.out.println("Введите фамилию актера, которого нужно заменить:");
        String surnameToReplace = scanner.nextLine();

        System.out.println("Введите имя нового актера:");
        String newName = scanner.nextLine();

        System.out.println("Введите фамилию нового актера:");
        String newSurname = scanner.nextLine();

        System.out.println("Введите рост нового актера:");
        int newHeight = scanner.nextInt();
        scanner.nextLine();

        Actor newActor = new Actor(newName, newSurname, Gender.UNKNOWN, newHeight); // Гендер по умолчанию не определен

        assert selectedShow != null;
        selectedShow.actorReplacement(surnameToReplace, newActor);

        if (!allActors.contains(newActor)) {
            allActors.add(newActor);
            System.out.println("Новый актер добавлен в общий список");
        }

    }
}