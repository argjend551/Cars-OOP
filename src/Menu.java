import java.util.Scanner;

public class Menu {
    Scanner scan = new Scanner(System.in);

    public void Main() {


        System.out.println("Hello Welcome to the Garage!");
        System.out.println("Choose what car you want to take out for a spin!");
        System.out.println("1. Audi A4\n2. Audi A6\n3. Bmw 320d\n4. Bmw 520i\n5. Mercedes C200\n6. Mercedes S500\n7. Show info of an specific car \n8. Display all cars inside the garage");
        int car = scan.nextInt();

        // skapar ett object av garage klassen
        Garage garage = new Garage();

        //while loopen körs så länge användaren anger en siffra under 8
        while (car < 9) {

            // switch case som meny
            // när du gjort ditt val te.x Audi A4 så skickas värdet till garage klassen där getCar metoden är
            switch (car) {
                case 1:
                    garage.getCar("Audi A4");

                    break;
            case 2:
                garage.getCar("Audi A6");
                break;

            case 3:
                garage.getCar("Bmw 320d");
                break;
            case 4:
                garage.getCar("Bmw 520i");
                break;

            case 5:
                garage.getCar("Mercedes C200");
                break;

            case 6:
                garage.getCar("Mercedes S500");
                break;

                case 7:
                    // här kan du se detaljerad information om en bil
                    // värdet skickas till klassen garage där det finns en metod Car info.

                    System.out.println("Which car do you want info about?");
                    System.out.println("1. Audi A4\n2. Audi A6\n3. Bmw 320d\n4. Bmw 520i\n5. Mercedes C200\n6. Mercedes S500");
                    car = scan.nextInt();
                    if (car == 1){
                        garage.CarInfo("Audi A4");
                    }
                    if (car == 2){
                        garage.CarInfo("Audi A6");
                    }
                    if (car == 3){
                        garage.CarInfo("Bmw 320d");
                    }
                    if (car == 4){
                        garage.CarInfo("Bmw 520i");
                    }
                    if (car == 5){
                        garage.CarInfo("Mercedes C200");
                    }
                    if (car == 6){
                        garage.CarInfo("Mercedes S500");
                    }

                    break;

                case 8:

                    // metod som skriver ut alla fordon i garaget.

                    garage.DisplayGarage();
                    break;

            default:
                System.out.println("Choose a car between 1-6 please.");
                break;

        }
            System.out.println("-----------Menu---------------");
            System.out.println("1. Audi A4\n2. Audi A6\n3. Bmw 320d\n4. Bmw 520i\n5. Mercedes C200\n6. Mercedes S500\n7. Show info of an specific car \n8. Display all cars inside the garage");
            System.out.println("------------------------------");
            car = scan.nextInt();
    }


        }



}
