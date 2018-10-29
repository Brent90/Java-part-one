
public class Main {

    public static void main(String[] args) {
        // write here test code 
        Reformatory eastHelsinkiReformatory = new Reformatory();
        Person brian = new Person("Brian", 1, 110, 7);
        Person pekka = new Person("Pekka", 33, 176, 85);
        
        System.out.println(eastHelsinkiReformatory.weight(brian));

    }
}
