/**
 * Manusia
 */
public class Manusia {

    public void nyalakanPerangkat(Elektronik perangkat) {
        if (perangkat instanceof TelevisiJadul) {
            System.out.println("Nyalakan televisi dengan input : " + ((TelevisiJadul) perangkat).getModelInput());
            System.out.println("Voltase Televisi: " + ((TelevisiJadul) perangkat).getVoltase());
        } else if (perangkat instanceof TelevisiModern) {
            System.out.println("Nyalakan televisi dengan input : " + ((TelevisiModern) perangkat).getModelInput());
            System.out.println("Voltase Televisi: " + ((TelevisiModern) perangkat).getVoltase());
        }

    }
}