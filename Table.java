/**
 * @author Nikhil Sathisha
 * Table class, hontrols arrayList of Fungi objects and narrows it down with traits
 */
import java.util.*;
import java.io.*;
public class Table{
    ArrayList <Fungus> fungiList = new ArrayList <Fungus>();
    ArrayList <String> traitList = new ArrayList <String>();
    /**
     * Constructor for table with file input.
     * @param input
     * @throws FileNotFoundException
     */
    public Table(File input) throws FileNotFoundException{
        Reset(input);
    }
    /**
     * Resets fungiList with given file (.txt file)
     * @param input
     * @throws FileNotFoundException
     */
    public void Reset(File input) throws FileNotFoundException{
        fungiList.clear();
        traitList.clear();
        Scanner s1 = new Scanner(input);
        File traitFile = new File("traits.txt");
        Scanner s2 = new Scanner(traitFile);
        if(s2.hasNextLine()){
            String scan = s2.next();
            Scanner sc2 = new Scanner(scan);
            sc2.useDelimiter(";");
            while(sc2.hasNext()){
                traitList.add(sc2.next());
            }
            sc2.close();
        }
        while(s1.hasNextLine()){
            Fungus temp = new Fungus(s1.nextLine());
            fungiList.add(temp);
        }
        s1.close();
        s2.close();

    }
    public void Display(){
        for(Fungus temp : fungiList){
            System.out.println(temp.toString());
            System.out.println();
        }
    }
    public void DisplayTraits(){
        for(int i = 0; i < traitList.size();i++){
            System.out.println(i + "\t" + traitList.get(i));
        }
    }
    public void Check(Fungus input){
        for(int j = 0; j< fungiList.size(); j++){
            boolean possible = true;
            for(int i = 1; i< input.traits.size();i++){
                if(!input.traits.get(i).isEmpty()){
                    boolean temp = traitCompare(fungiList.get(j).traits.get(i),input.traits.get(i));
                    if(temp == false){
                    }
                    possible = temp && possible;
                }
            }
            if(possible == false){
                fungiList.remove(j);
                j--;
            }
        }
        Display();
    }
    private boolean traitCompare(ArrayList<String> traits1, ArrayList<String> traits2){
        try {
            int v1 = Integer.parseInt(traits1.get(0));
            int v2 = Integer.parseInt(traits1.get(1));
            int v3 = Integer.parseInt(traits2.get(0));
            if (v3 >= v1 && v3 <= v2){
                return true;
            }
        }
        catch (NumberFormatException nfe) {
            for(String temp: traits1){
                for(String temp2:traits2){
                    if(temp.equals(temp2) || temp.equals("?")){
                        return true;
                    }
                    
                }
            }
        }
        return false;
    }
}
