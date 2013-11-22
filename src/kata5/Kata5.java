package kata5;

public class Kata5 {

    public static void main(String[] args) {
        PersonLoader loader = new MockPersonLoader();
        HistogramBuilder<Person> builder = new HistogramBuilder<>(loader.load());
        HistogramViewer<String> viewer = new GraphicalHistogramViewer<>(builder.build(createAttributeExtractor()));
        viewer.show();
    }
    
    public static AttributeExtractor<Person, String> createAttributeExtractor() {
        return new AttributeExtractor<Person,String>() {
            @Override
            public String extract (Person person) {
                return person.getMail().getDomain();
            }
        };
    }
}
