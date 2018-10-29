public class Main {
    public static void main(String[] args) {
        // write testcode here
        Counter count = new Counter(3, true);
        
        System.out.println(count.value());
        count.decrease(2);
        count.decrease(2);
        count.decrease(2);
        System.out.println(count.value());
               
        
    }
}
