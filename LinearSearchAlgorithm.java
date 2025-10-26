
//Their is method inside java's Collections class and also into Arrays-->Arrays is static 
//so methods inside it also static --->Arrays.binarySearch()
//java.util.Collections.binarySearch(); 
//public static <T> int binarySearch(List<? extends Comparable<? super T>> list,T key)

//java.util.Collections.binarySearch()
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class LinearSearchAlgorithm
{
	public static void main(String[] args) {
	    List<String>fruits=Arrays.asList("banana","Mango","Kiwi","papaya","Guava","Lichi");
	     try{
	   
	    String target="Lichi";
	          
	    int index=Collections.binarySearch(fruits,target);
	    if(index>=0){
	        System.out.println("key is found at index : "+index);
	    }else{
	        System.out.println("key is not found");

	    }
	    }catch(Exception e){
	        System.out.println("UnsupportedOperationException");
	    }
	}
}
/*
Linear Search Algorithm->find an element by traversing through an array and return index at
which it found otherwise o/p=-1; 

class LinearSearch{
    public static int search(int[]arr,int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x) return i;
        }
        return -1;
    }
    public static void main(String[] args){
        int[]arr={10,21,31,41,51,111,178,191,229,237};
        int x=191;//key which we need to find
        int result=search(arr,x);

        if(result==-1){
            System.out.println("The element is not found into the array");
        }else{
            System.out.println("The element is found at index :"+result);//7 -->at 7th index it found.
        }
    }
}

*/