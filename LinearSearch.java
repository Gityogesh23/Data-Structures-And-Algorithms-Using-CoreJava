/*
Linear Search Algorithm->find an element by traversing through an array and return index at
which it found otherwise o/p=-1; 
*/
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