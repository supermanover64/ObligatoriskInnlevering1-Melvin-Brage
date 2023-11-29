import static javax.swing.JOptionPane.*;

public class OppgaveO1 {

	public static void main(String[] args) {
        //Leser inn brukaren sin bruttoinntekt
        //Reknar ut trinnskatten
        //Viser kva trinnskatten er i inntekt

        //Skattetrinn:
        double skattetrinn0 = 0.000;
        double skattetrinn1 = 0.017;
        double skattetrinn2 = 0.04;
        double skattetrinn3 = 0.134;
        double skattetrinn4 = 0.164;
        double skattetrinn5 = 0.174;

        double brukartrinn = 0;

        double brukarbrutto = Double.parseDouble(showInputDialog("Finn ut kor mykje du må betala i trinnskatt!\nSkriv inn bruttolønn her:"));

        if(brukarbrutto < 190350)
            brukartrinn = skattetrinn0;
        else if(brukarbrutto < 267900)
            brukartrinn = skattetrinn1;
        else if(brukarbrutto < 643800)
            brukartrinn = skattetrinn2;
        else if(brukarbrutto < 969200)
            brukartrinn = skattetrinn3;
        else if(brukarbrutto < 2000000)
            brukartrinn = skattetrinn4;
        else
            brukartrinn = skattetrinn5;

        double trinnskattebelop = brukarbrutto * brukartrinn;

        showMessageDialog(null, "Beløpet du skal betala i trinnskatt er: " + trinnskattebelop);
	}

}