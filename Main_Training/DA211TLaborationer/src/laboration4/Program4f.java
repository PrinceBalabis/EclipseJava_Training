package laboration4;

public class Program4f {

    public void club() {
        System.out.println("Klubbens namn är Landskrona BOIS.");
    }

    public void supporter() {
        System.out.println("BOIS är bäst.");
    }

    public void league() {
        System.out.println("Klubben ligger i Superettan");
    }

    public void coach() {
        System.out.println("Tränare är Henrik Larsson");
    }

    public void expert() {
        System.out.println("Det blir nog inte Allsvenskan nästa år");
    }

    public static void main(String[] args) {
        Program4f p4f = new Program4f();
        p4f.club();
        p4f.coach();
        p4f.league(); 
        p4f.supporter();
        p4f.expert();
    }
}
