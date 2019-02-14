 

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        StringBuilder result = new StringBuilder();
        int count = 0;
        
        while (count < personArray.length) {
            result = result.append(personArray[count].toString());
            count++;
        }
        
        return result.toString();
    }



    public String forLoop() {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < personArray.length; i++) {
            result = result.append(personArray[i].toString());
        }
        
        return result.toString();
    }



    public String forEachLoop() {
        StringBuilder result = new StringBuilder();
        
        for (Person p : personArray) {
            result = result.append(p.toString());
        }
        
        return result.toString();
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
