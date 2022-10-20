import java.io.*;
import java.util.*;
public class runner {
    public static void main(String [] args) throws FileNotFoundException{
        File mushrooms = new File("mushrooms.txt");
        Table fungi = new Table(mushrooms);
        Fungus mysteryFungus = new Fungus();
        boolean cont = true;
        Scanner kb = new Scanner(System.in);
        while(cont){
            System.out.println("Fungal Identification Tool 1.0");
            System.out.println("Enter \'1\' to create a new mushroom to identify *will lose progress on previous*");
            System.out.println("Enter \'2\' to view trait options");
            System.out.println("Enter \'3\' to assign traits");
            System.out.println("Enter \'4\' to find possible species");
            System.out.println("Enter \'5\' to see your mushroom's traits");
            System.out.println("Enter \'6\' to exit");
            switch(kb.nextInt()){
                case 1:
                    fungi.Reset(mushrooms);
                    mysteryFungus.Reset();
                    System.out.println("Enter a name for your mushroom");
                    mysteryFungus.Enter(0,kb.next());
                break;
                case 2:
                    fungi.DisplayTraits();
                    System.out.println("Enter the index of the trait to see its options.");
                    System.out.println(traitInfo.getInfo(kb.nextInt()));
                break;
                case 3:
                    System.out.println("Enter the index and data for the trait you are entering (You can enter multiple datapoints for non-quantitative traits)");
                    mysteryFungus.Enter(kb.nextInt(), kb.next());
                break;
                case 4:
                    fungi.Check(mysteryFungus);
                break;
                case 5:
                    System.out.println(mysteryFungus.toString());
                break;
                case 6:
                    cont = false;
                break;
            }
        }
        kb.close();
    }
}
