package hours_logger;

import java.util.Arrays;

/**
 *
 * @author jayia
 */
public class Hours_Logger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // People information
        String data = """
                       Professor Isaac Newton Physics 6
                       TA Marie Curie Physics 6
                       Professor Isaac Newton Calculus 4
                       Student Amy Adams Calculus 4
                       Student Will Smith Calculus 4
                       Student Brad Pitt Physics 6
                       Student Will Smith Physics 6
                       Professor Dmitri Mendeleev Chemistry 6
                       TA Carl Gauss Calculus 4
                       Student Amy Adams Economics 3
                       Professor Adam Smith Economics 3
                       TA Marie Curie Chemistry 6
                       Student Brad Pitt Chemistry 6
                       Student Will Smith Chemistry 6
                       """;

        // Separate data and store into array
        String[] records = data.split("\n");

        Person[] people = new Person[8];
        int count = 0;

        for (String record : records) {
            record = record.trim();
            String[] info = record.split(" "); //seperates string to divide data

            Person person = checkExistence(people, info[0], info[1], info[2], count);
//            if person doesn't exist create new object and store into person array
            if (person == null) {
//                upcasting based on title
                if (info[0].equals("Student")) {
                    person = new Student(info[1], info[2]);
                } else if (info[0].equals("Professor")) {
                    person = new Professor(info[1], info[2]);
                } else if (info[0].equals("TA")) {
                    person = new TA(info[1], info[2]);
                }
                people[count]=person; //add to array of persons
                person.addHours(Integer.parseInt(info[4])); //calculates and adds hours
                count++;
            }else{
                person.addHours(Integer.parseInt(info[4]));
            }
        }
        
//        printing results
        for (Person person : people){
            System.out.println("--");
            System.out.println("Title: " + person.getTitle() + " Full Name: " + person.getFullName() + " Total Hours: " + person.getHours());
        }
        
    }

    //checks if person exists
    private static Person checkExistence(Person[] people, String title, String fName, String lName, int count) {
//        compares information throughout array and returns if exists and null if not
        for (int i = 0; i < count; i++) {
            if (people[i].getFullName().equals(fName + " " + lName) & people[i].getTitle().equals(title)) {
                return people[i];
            }
        }
        return null;

    }
}
