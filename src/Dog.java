public final class Dog extends Pet {
    private String name;
    private String dreed;
    private String commands;
    private String voice;
    private int number;

    public Dog() {
        super(new Shelter("Luse", "Sal"), Color.GRAY);
    }

    public Dog(String name, String dreed, Color color, Shelter shelter) {
        super(shelter, color);
        this.name = name;
        this.dreed = dreed;

    }

    public Dog(String name, String dreed, String commands, Color color, Shelter shelter) {
        super(shelter, color);
        this.name = name;
        this.dreed = dreed;
        this.commands = commands;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDreed() {
        return dreed;
    }

    public void setDreed(String dreed) {
        this.dreed = dreed;
    }

    public String getCommands() {
        return commands;
    }

    public void setCommands(String commands) {
        this.commands = commands;
    }

    public void makeVoice() {
        System.out.println("Гав-гав");
    }

    public void makeVoice(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("Гав-гав ");
        }
        System.out.println();
    }

    public void makeVoice(String voice) {
        System.out.println(voice);
    }

    public void makeVoice(String voice, int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(voice + " ");
        }
        System.out.println();
    }

    public final String getInfo() {

        return  " Age: " + getAge()
                + " name: " + getName()
                + " dreed: " + dreed +
                " color: " + getColor();

    }
}
