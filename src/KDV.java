import java.util.Scanner;
public class KDV {

    public static void main(String[] args){
        double tutar, kdvOran = 0.18, kdvTutar, kdvliTutar;


        Scanner input = new Scanner(System.in);
        System.out.print("Ücret Tutarını Giriniz : ");
        tutar = input.nextDouble();
        if (tutar > 1000) {
            kdvOran = 0.08;
        } else {
            kdvOran = 0.18;
        }
        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;


        System.out.println("Kdv'siz tutar :"+ tutar);
        System.out.println("KDV Oranı :" + kdvOran );
        System.out.println("KDV Tutar :" + kdvTutar);
        System.out.println("KDV'Li Tutarı :" + kdvliTutar);
    }

}
