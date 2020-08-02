package arrays;

import java.util.ArrayList;
import java.util.List;

public class Arrays {

    /**
     * Array lista de n elementos
     * Matriz tabela n x m elementos
     * Matriz == Array de Array - Basicamente uma tabela de excel
     */

    public void verifyFirstRepetition(ArrayList a){
        List<String> newList = new ArrayList<>();


        for(int i=0; i<a.size(); i++){
            if(newList.isEmpty()){
                newList.add(a.get(i).toString());
            }

            else if(!newList.contains(a.get(i).toString())){
                newList.add(a.get(i).toString());
            }

            else if(newList.contains(a.get(i).toString())) {
                System.out.println("We have a match " + a.get(i).toString());
                break;
            }


        }
    }
}
