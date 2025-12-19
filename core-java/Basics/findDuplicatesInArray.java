import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
class findDuplicatesInArray {
public static void main (String [] args){
    int [] arr ={1, 2, 3, 4, 2, 7, 8, 8, 3};
    
    Set<Integer> set =new HashSet<>();
    List<Integer> duplicates = new ArrayList<>();
    
    for(int i =0; i< arr.length; i++){
        if(!set.add(arr[i])){   // if element is already present in set it will return false
        duplicates.add(arr[i]);
    }
    }
    System.out.print(duplicates);
}

}


