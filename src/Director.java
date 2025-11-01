class Director extends Person {
    private int numberOfShows;

    public Director(String name, String surname, int numberOfShows) {
        super(name, surname);
        this.numberOfShows = numberOfShows;
    }

    public int getNumberOfShows() {
        return numberOfShows;
    }

    @Override
    public String toString() {
        return super.toString() + " (Количество постановок: " + getNumberOfShows() + ")";
    }

}