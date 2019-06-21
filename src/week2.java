import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class week2 {

    public static void main(String args[]) {
        //Week Two Challenge: Chipotle Jr+ (Room 440)
        ArrayList<String> Rice = new ArrayList<>(Arrays.asList("White rice", "brown rice", "no rice"));
        ArrayList<String> Meat = new ArrayList<>(Arrays.asList("Chicken meat", "Steak meat", "Carnidas meat", "chorizo meat", "Sofritas meat", "veggies meat"));
        ArrayList<String> Beans = new ArrayList<>(Arrays.asList("pinto beans", "black beans", "no beans"));
        ArrayList<String> Salsa = new ArrayList<>(Arrays.asList("mild salsa", "Medium salsa", "hot salsa", "no salsa"));
        ArrayList<String> veggies = new ArrayList<>(Arrays.asList("lettuce veggies", "fajita veggies", "no veggies"));

        ArrayList<String> cheese = new ArrayList<>(Arrays.asList("yes_cheese", "No cheese"));
        ArrayList<String> Guac = new ArrayList<>(Arrays.asList("yes_Guac", "No Guac"));
        ArrayList<String> Queso = new ArrayList<>(Arrays.asList("Yes Queso", "No Queso"));
        ArrayList<String> Sour_cream = new ArrayList<>(Arrays.asList("yes sourcream", "No sourcream"));
        Random rand = new Random();
        Scanner ss = new Scanner(System.in);
        int i = 1;
        int rice_index, Meat_index, Beans_index, Salsa_index, veggies_index, cheese_index = 0, Guac_index = 0;
        int Queso_index = 0, sour_index = 0;
        System.out.println("*********THE ASSEMBLED BURRITOS*******");
        do {

            rice_index = rand.nextInt(Rice.size());
            Meat_index = rand.nextInt(Meat.size());
            Beans_index = rand.nextInt(Beans.size());
            Salsa_index = rand.nextInt(Salsa.size());
            veggies_index = rand.nextInt(veggies.size());
            cheese_index=rand.nextInt(cheese.size());
            Guac_index=rand.nextInt(Guac.size());
            Queso_index=rand.nextInt(Queso.size());
            sour_index=rand.nextInt(Sour_cream.size());

            System.out.println(" Burrito " + i + ":[" + Rice.get(rice_index) + "," + Meat.get(Meat_index) + "," + Beans.get(Beans_index) + "," + Salsa.get(Salsa_index) + "," + veggies.get(veggies_index) + "]");
            i++;

        } while (i <= 25);
        int y=1;
        System.out.println("Would you like to add cheese:(yes/No)");
        String choice = ss.nextLine();
        if (choice.equalsIgnoreCase("yes")) {
            cheese_index = cheese.indexOf("yes_cheese");
        }
        System.out.println("Would you like to add Guac(yes/No)");
        choice=ss.nextLine();
        if (choice.equalsIgnoreCase("yes")) {
            Guac_index = Guac.indexOf("yes_Guac");
        }
        System.out.println("Would you like to add Queso(yes/No)");
        choice=ss.nextLine();
        if (choice.equalsIgnoreCase("yes")) {
            Queso_index = Queso.indexOf("Yes Queso");
        }
        System.out.println("Would you like to add sourcream(yes/No)");
        choice=ss.nextLine();
        if (choice.equalsIgnoreCase("yes")) {
            sour_index = Sour_cream.indexOf("yes sourcream");
        }
        do{
            rice_index = rand.nextInt(Rice.size());
            Meat_index = rand.nextInt(Meat.size());
            Beans_index = rand.nextInt(Beans.size());
            Salsa_index = rand.nextInt(Salsa.size());
            veggies_index = rand.nextInt(veggies.size());
            cheese_index=rand.nextInt(cheese.size());
            Guac_index=rand.nextInt(Guac.size());
            Queso_index=rand.nextInt(Queso.size());
            sour_index=rand.nextInt(Sour_cream.size());
            System.out.println(" Burrito " + y + ":[" + Rice.get(rice_index) + "," + Meat.get(Meat_index) + "," + Beans.get(Beans_index) + "," + Salsa.get(Salsa_index) + "," + veggies.get(veggies_index) + "," + cheese.get(cheese_index) + "," + Guac.get(Guac_index) + "," + Queso.get(Queso_index) + "," + Sour_cream.get(sour_index)+" ]");
            y++;
        }while (y<=25);


    }}
