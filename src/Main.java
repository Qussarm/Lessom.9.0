public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog ("Dog","Alabay", Color.GRAY, new Shelter("Linda", "Lenina"));
        Dog dog1 = new Dog();
        Dog dog2 = new Dog("Lena", "Ovcharka", "sidet'", Color.BROWN, new Shelter("Kendi", "Gamburh"));


        System.out.println( dog.getInfo());
        System.out.println(dog1.getInfo());
        System.out.println(dog2.getInfo());

dog.makeVoice();
dog1.makeVoice();
dog2.makeVoice();

    }
}
