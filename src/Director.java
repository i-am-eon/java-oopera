class Director extends Person {
    int numberOfShows;

    public Director(String name, String surname, int numberOfShows) {
        super(name, surname);
        this.numberOfShows = numberOfShows;
    }

    @Override
    public String toString() {
        return super.toString() + " (Количество постановок: " + numberOfShows + ")";
    }

}