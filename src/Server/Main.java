package Server;

public class Main {
    public static void main(String[] args) {
        Student ahmed = new Student();

        Student sune = new Student();

        ahmed.setName("Ahmed Hassan");
        sune.setName("Sune Bro");
        ahmed.setYearOfBirth(1997);
        sune.setYearOfBirth(1998);
        sune.setHometown("Slagelse");

        System.out.println("Sunes alder er " + sune.getAge());
        System.out.println("Ahmeds alder er " + ahmed.getAge());
        int averageAge = (sune.getAge() + ahmed.getAge()) / 2;
        System.out.println("Gennemsnitsalderen er " + averageAge);

        System.out.println("Studerende i klassen er " + ahmed.getName() + ", " + sune.getName());
    }
}
