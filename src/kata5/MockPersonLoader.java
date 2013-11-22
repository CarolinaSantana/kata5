package kata5;

public class MockPersonLoader implements PersonLoader {

    @Override
    public Person[] load() {
        Person[] people = new Person[5];
        people[0] = new Person("Luis", new Mail("luis@gmail.com"), Sex.MALE);
        people[1] = new Person("Alba", new Mail("alba@yahoo.com"), Sex.FEMALE);
        people[2] = new Person("Manuel", new Mail("manue@gmail.com"), Sex.MALE);
        people[3] = new Person("Francisco", new Mail("fran@gmail.com"), Sex.MALE);
        people[4] = new Person("Carolina", new Mail("carolina@outlook.com"), Sex.FEMALE);
        return people;
    }
    
}
