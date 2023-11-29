import static javax.swing.JOptionPane.*;

public class OppgaveO2{
    public static void main(String[] args){
        int elevpoengsum = 0;

        char karakter;

        for(int elev = 1; elev <= 10; ++elev){
            do{
                elevpoengsum = 0;
                elevpoengsum = Integer.parseInt(showInputDialog("Skriv inn elevpoengsum:"));
                if(elevpoengsum >= 0 && elevpoengsum <= 100){
                    
                    

                    if(elevpoengsum <= 39){
                        karakter = 'F';
                    } else if(elevpoengsum <= 49){
                        karakter = 'E';
                    } else if(elevpoengsum <= 59){
                        karakter = 'D';
                    } else if(elevpoengsum <= 79){
                        karakter = 'C';
                    } else if(elevpoengsum <= 89){
                        karakter = 'B';
                    } else if(elevpoengsum <= 100){
                        karakter = 'A';
                    } else{
                        karakter = 'T';
                    }

                    showMessageDialog(null, "Eleven har fått ein " + karakter);
                }else{
                    showMessageDialog(null, "Poengsummen kan ikkje vera negativ eller større enn 100.\nSkriv inn eit anna tal.");
                    karakter = 'T';
                }
            }while(karakter == 'T');
        }
        
    }
}