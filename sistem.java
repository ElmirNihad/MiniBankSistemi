import java.util.Scanner;

public class sistem {
    String ad;
    String soyad;
    String parol;
    String ad2;
    String soyad2;
    String parol2;
    int secim;
    boolean flag = true;
    boolean flag2 = true;
    int secim2;
    double balans = 0.0;
    public sistem() {
        Scanner input = new Scanner(System.in);
        while (flag) {
            System.out.println("\n1. Qeydiyyat");
            System.out.println("2. Daxil ol");
            System.out.println("3. Çıxış");
            System.out.print("Seçim edin: ");
            secim = input.nextInt();
            if (secim == 1) {
                qeydiyyat();
            }
            else if (secim == 3) {
                cixis();
                //break;
                flag = false;
            }
            else if (secim == 2) {
                giris();
            }
        }
    }
    private void qeydiyyat(){
        Scanner input = new Scanner(System.in);
        System.out.print("Adinizi daxil edin : ");
        ad = input.next();
        System.out.print("Soyadinizi daxil edin : ");
        soyad = input.next();
        System.out.print("Parolunuzu daxil edin : ");
        parol = input.next();
        System.out.println(ad +" " +  soyad + " qeydiyyatiniz ugurla tamamlandi");
    }
    private void cixis(){
        System.out.println("Proqram baglanir....");
    }
    private void giris(){
        Scanner input = new Scanner(System.in);
        System.out.print("Adinizi daxil edin : ");
        ad2 = input.next();
        System.out.print("Soyadinizi daxil edin : ");
        soyad2 = input.next();
        System.out.print("Parolunuzu daxil edin : ");
        parol2 = input.next();
        if(ad2.equals(ad) && soyad2.equals(soyad) && parol2.equals(parol)){
            System.out.println("Giriş uğurludur!");
            while (flag2){
                System.out.println("\n1. Pul yatır");
                System.out.println("2. Pul çıxar");
                System.out.println("3. Balansı yoxla");
                System.out.println("4. Çıxış");
                System.out.print("Seçim edin: ");
                secim2 = input.nextInt();
                switch (secim2) {
                    case 1:
                        System.out.print("Yatirmaq istediyiniz meblegi daxil edin : ");
                        double mebleg = input.nextInt();
                        balans = balans + mebleg;
                        System.out.println("Hazirki balansiniz : " + balans);
                        break;
                    case 2:
                        System.out.println("Elde etmek istediyiniz meblegi daxil edin : ");
                        double mebleg2 = input.nextInt();
                        if(balans >= mebleg2){
                            balans = balans - mebleg2;
                            System.out.println("Hazirki balansiniz : " + balans);
                        }else {
                            System.out.println("Teessuf ki, balansinizda kifayet qeder vesait yoxdur");
                            System.out.println("Hazirki balansiniz : " + balans);
                        }
                        break;
                    case 3:
                        System.out.println("Hazirki balansiniz : " + balans);
                        break;
                    case 4:
                        System.out.println("Esas sehifeden cixilir....");
                        flag2 = false;
                }
            }
        }else {
            System.out.println("Yanlış istifadəçi adı və ya şifrə!");
        }

    }

}
