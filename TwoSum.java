//Kate Walker
import java.util.*;

public class TwoSum {
    public List<Integer> twosum(int[]arr,int sum ){//function to check if any 2 ints in the array are equal to the target sum
        sort(arr);//calling sort function to sort the array
        int left = 0;//setting the left value to the first int in the array at index 0
        int right = arr.length -1;//setting left value to the last value in the array
        List<Integer> sumlist = new ArrayList<Integer>();//making a new arraylist to put the values in
        while(left < right){//loop to go through all the values in the array
            if (arr[left] + arr[right] == sum && arr[left] != arr[right]){//check if the two values add up to the target sum and aren't equal
                sumlist.add(left);//add left index to the sum arraylist
                sumlist.add(right);//add right index to the sum arraylist
                return sumlist;//return the sum arraylist
            }
            else if(arr[left] + arr[right] < sum){//if two values add up to less than the target sum
                left++;//increase left value
            }
            else {//if the two values add up to greater than the target sum
                right--;//decrease the right value
            }
        }

        sumlist.add(-1);//add -1 to the arraylist since no values add up to the target value
        return sumlist;//return the arraylist

    }
    public void sort(int arr[]){//function to sort the array
        int l = arr.length;//int to stroe the length of the array
        for(int i=0; i<l -1; ++i){//loop to go through all the values in the array
            int min = i;//set min to value of i
            for(int j=i+1; j <l; j++){//loop to go through the values from i=1 to the end of the array
                if(arr[j]< arr[min]){//if the value at j is greater than the value at min
                    min = j;//set min to equal j
                }
            }
            int temp = arr[min];//make a temp int and set it to the value of min
            arr[min] = arr[i];//set the value of at min to the value at i
            arr[i] = temp;// set the value at i to the temp
        }
        System.out.println("Sorted array:" +  Arrays.toString(arr));//print the sorted array
    }


    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        TwoSum s= new TwoSum();//making an object of twoSum
        int sumarr1[] =new int[]{2, 12, 8, 7};//declaring the first array
        int tsum1 = 9;//setting the first target sum
        int sumarr2[] =new int[]{1, 13, 18, 20, 20, 30};//declaring the second array
        int tsum2 = 40;//setting the second traget sum

        System.out.println("Array 1:");
        System.out.println("Array:" + Arrays.toString(sumarr1));//printing the first unsorted array
        System.out.println("Target: " + tsum1);//printing the value of the first target sum
        System.out.println(s.twosum(sumarr1,tsum1) + "\n");//print the first sorted array and the results using the twosum function

        System.out.println("Array 2:");
        System.out.println("Array:" + Arrays.toString(sumarr2));//printing the second unsorted array
        System.out.println("Target: " + tsum2);//printing the value of the second target sum
        System.out.println(s.twosum(sumarr2,tsum2));//print the second sorted array and the results using the twosum function
    }


}
