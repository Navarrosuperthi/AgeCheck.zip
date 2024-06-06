public class AgeCheck {
   
    public static void main(String[] args) {
        int myAge = 15;   // idade para ver se tenho ou não a idade para ter uma carteira de motorista
        
        if (myAge >= 16) {
            System.out.println("Ja tenho idade para ter minha carteira de motorista!");
        }
        if (myAge <= 16) {
            System.out.println("Nao tenho idade o suficiente... :*(");
        }
    }
}