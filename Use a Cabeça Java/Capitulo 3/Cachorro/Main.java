class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Bart";

        Dog[] myDogs = new Dog[3];

        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        myDogs[0].name = "Fred";
        myDogs[1] = "Marge";

    }
