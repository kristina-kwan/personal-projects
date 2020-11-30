public class EmailApp {
    
    public static void main (String [] args){
        Email em1 = new Email("Kristina" , "Kwan");

        em1.setAlternateEmail("@gmail.com");

        em1.showInfo();
        System.out.println(em1.showInfo());

        

    }
}
