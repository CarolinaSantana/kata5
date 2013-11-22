package kata5;

public class Person {

        private String name;
        private Mail mail;
        private Sex sex;

    public String getName() {
        return name;
    }

    public Mail getMail() {
        return mail;
    }

    public Sex getSex() {
        return sex;
    }

    public Person(String name, Mail mail, Sex sex) {
        this.name = name;
        this.mail = mail;
        this.sex = sex;
    }

}
