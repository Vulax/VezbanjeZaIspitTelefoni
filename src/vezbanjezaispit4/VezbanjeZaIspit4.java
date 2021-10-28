
package vezbanjezaispit4;

import java.util.Scanner;

public class VezbanjeZaIspit4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Unesi duzinu niza telefona: ");
        int n = s.nextInt();
        s.nextLine();
        if (n==0){
            System.out.println("Nije validna duzina!");
            System.exit(0);
        }
            
        MobilniTelefon[] nizTelefona = new MobilniTelefon[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Unesi proizvodjaca: ");
            String proizvodjac = s.nextLine().trim();
            System.out.print("Unesi model: ");
            String model = s.nextLine();
            System.out.print("Unesi godinu: ");
            int godinu = s.nextInt();
            System.out.print("Unesi radnu memoriju: ");
            double radnaMemorija = s.nextDouble();
            System.out.print("Unesi prostor: ");
            double prostor = s.nextDouble();
            System.out.print("Unesi visinu ekrana: ");
            double visinaEkrana = s.nextDouble();
            System.out.print("Unesi sirinu ekrana: ");
            double sirinaEkrana = s.nextDouble();
            
            EkranTelefona et = new EkranTelefona(sirinaEkrana,visinaEkrana);
            nizTelefona[i] = new MobilniTelefon(proizvodjac, model, godinu, radnaMemorija, prostor, et);
            s.nextLine();
        }
        
        for (int i = 0; i < n; i++) {
            System.out.println(nizTelefona[i]);
        }
        
        for(int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++) {
                if (nizTelefona[j].ocenaPodobnosti()>nizTelefona[j+1].ocenaPodobnosti()){
                    MobilniTelefon pom = nizTelefona[j];
                    nizTelefona[j] = nizTelefona[j+1];
                    nizTelefona[j+1] = pom;
                }
            }
        }
        
        System.out.println("sortiran niz po podobnosti: ");
        for (int i = 0; i < n; i++) {
           
            System.out.println(nizTelefona[i]);
            System.out.println(nizTelefona[i].ocenaPodobnosti());
            
        }
        
    }
    
}
