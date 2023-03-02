/**
 * @author Nikhil Sathisha
 * Fungus class, contains a fungus object and its traits
 */
import java.util.*;
import java.io.*;
class Fungus{
    //name;class;cap-size;cap-shape;Cap-suriace;cap-color;has-bruises;gill-attachment;gill-spacing;gill-color;stem-height;stem-width;stem-root;stem-surface;stem-color;veil-type;veil-color;has-ring;ring-type;ring-color;spore-print;habitat;season;enrichable
    public ArrayList <ArrayList<String>> traits = new ArrayList<ArrayList<String>>(23);
    public Fungus(){
        ArrayList<String> temp = new ArrayList<String>();
        for(int i = 0;i<24;i++){
            traits.add(temp);
        }
    }
    /**
     * Fungus constructor with string parameter
     * @param input //Input string contains the 23 traits of each fungus object
     * @throws FileNotFoundException
     */
    public Fungus(String input) throws FileNotFoundException{
        Scanner sc1 = new Scanner(input);
        sc1.useDelimiter(";");
        while(sc1.hasNext()){
            String scan = sc1.next();
            Scanner sc2 = new Scanner(scan);
            sc2.useDelimiter(",");
            ArrayList <String> temp = new ArrayList<String>();
            while(sc2.hasNext()){
                temp.add(sc2.next());
            }
            traits.add(temp);
            sc2.close();
        }
        sc1.close();
    }
    /**
     * Allows client to enter a trait for a given fungus object. 
     * @param ind index of trait
     * @param input trait string
     */
    public void Enter(int ind, String input){
        ArrayList<String> temp = new ArrayList<String>();
        ArrayList<String> temp2 = traits.get(ind);
        for(String a : temp2){
            temp.add(a);
        }
        temp.add(input);
        traits.remove(ind);
        traits.add(ind,temp);
    }
    /**
     * Resets the fungus object
     */
    public void Reset(){
        traits.clear();
        ArrayList<String> temp = new ArrayList<String>();
        for(int i = 0;i<24;i++){
            traits.add(temp);
        }
    }
    /**
     * toString method to output each fungus object.
     */
    public String toString(){
        return traits.toString();
    }
}