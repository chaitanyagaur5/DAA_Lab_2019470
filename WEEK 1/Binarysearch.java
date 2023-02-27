import java.util.*;

class Binarysearch{
  public static boolean binarysearch(ArrayList<Integer> A,int key){
    int right = A.size()-1;
    int left = 0;
    while (left<=right){
      int mid = left + ((right-left)/2);
      if (A.get(mid)==key){
        return true;
      }
      else if (A.get(mid)<key){
        left = mid+1;
      }
      else if (A.get(mid)>key){
        right = mid-1;
      }
    }
    return false;
} 
  public static void main(String[] args) {
    ArrayList A = new ArrayList<Integer>();
    
    A.add(1);
    A.add(2);
    A.add(3);
    A.add(4);
    A.add(6);
    A.add(7);
    A.add(8);
    //A.add(9);
    int key = 19;
    System.out.println(binarysearch(A,10));
  }
}
 