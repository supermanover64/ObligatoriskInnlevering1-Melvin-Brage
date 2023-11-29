import static javax.swing.JOptionPane.*;

public class OppgaveO3{
    public static void main(String[] args){
        int n = -1;

        int fakultet = 1;

        do{
            n = Integer.parseInt(showInputDialog("Velkomen til fakultetsreknaren! Skriv inn talet ditt:"));

            if(n > 0){
                for(int i = 1; i <= n; ++i){
                    fakultet *= i;
                }
            }else{
                showMessageDialog(null, "Ugyldig! Talet må vera større enn 0!");
            }

        }while(n < 0);
        
        showMessageDialog(null, n + "! er " + fakultet);

    }
}