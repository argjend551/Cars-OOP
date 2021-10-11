import java.util.ArrayList;
public class Garage {


    // skapat en arraylista där vi lagrar all object från Car

    public ArrayList<Car> Cars = new ArrayList<>();



    // Konstruktorn skapar ett object av klasserna och lägger till bilarna i arraylistan Cars


    public Garage() {

        Cars.add(new Audi("Audi A4", 2021, 220, "Red", 4));
        Cars.add(new Audi("Audi A6", 2008, 205, "Black", 4));
        Cars.add(new BMW("Bmw 320d", 1990, 190, "Black", 2));
        Cars.add(new BMW("Bmw 520i", 2002, 250, "White", 4));
        Cars.add(new Mercedes("Mercedes C200", 2009, 177, "Silver", 2));
        Cars.add(new Mercedes("Mercedes S500", 1996, 660, "Black", 2));


    }



    // metoden loopar genom för varje car object i arraylistan Cars

    public Car getCar(String name) {



        //om name som är i parameter matchar en bil så körs koden.
        for (Car car : Cars) {
            if (name.equals(car.getModel())) {
                System.out.println("--------------------------------------------");
                System.out.println("Driving out the " + name + " from the garage");
                System.out.println("vroom vroom...");
                System.out.println("");
                return car;
            }

        }

        // om bilen inte finns skrivs detta ut och returnerar ingenting.
        System.out.println("could not found car in garage");
        return null;
    }

    // här skrivs alla object i arraylistan ut

    public void DisplayGarage() {
        System.out.println("-------------------------");
        System.out.println("Cars in the garage:");
        System.out.println("");
        for (Car cars : Cars) {

            System.out.println("Model: " + cars.getModel() + " | Year: " + cars.getYear() + " | Color: " + cars.getColor());

        }


        System.out.println("");


    }


    // metoden loopar genom för varje car object i arraylistan Cars.

    public Car CarInfo(String car) {

        //om name som är i parameter matchar en bil så körs koden.

            for (Car cars : Cars) {
                if (car.equals(cars.getModel())) {
                    System.out.println("-------------------------");
                    System.out.println("Model: " + cars.getModel() + "\n" + "Year: " + cars.getYear() + "\n" + "BHP: " + cars.getBhp() + "\n" + "Color: " + cars.getColor() + "\n" + "Doors: " + cars.getDoor());
                    return cars;
                }

            }

        // om bilen inte finns skrivs detta ut och returnerar ingenting.

        System.out.println("could not found car in garage");




        return null;
    }
}