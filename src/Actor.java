class Actor extends Person {
    private int height;

    public Actor(String name, String surname, int height) {
        super(name, surname);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return getName() + " " + getSurname() + " (" + height + " см)";
    }

}