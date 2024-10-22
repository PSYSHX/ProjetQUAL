import isen.library.Person;

public class Main {
    public static void main(String[] args) {
        // Créer un objet Person
        Person person = new Person();
        System.out.println("Nom : " + person.getName());
        System.out.println("Âge : " + person.getYears());

        // Modifier les valeurs de l'objet
        person.setName("John");
        person.setYears(30);
        System.out.println("Nouveau nom : " + person.getName());
        System.out.println("Nouvel âge : " + person.getYears());
    }
}
