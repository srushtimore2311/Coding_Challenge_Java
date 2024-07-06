package day10_arraylist;
// Question 3 :Most Frequent Number following Key(EASY)YouaregivenanintegerArraylistnums.Youarealsogivenanintegerkey,whichispresentinnums.Foreveryuniqueintegertargetinnums,countthenumberoftimestargetimmediatelyfollowsan occurrence of key in nums. In other words, count the number of indices i such that:0 <= i <= nums.size() - 2,nums.get(i) == key and,nums.get(i+1) == target.Return the target with the maximum count.(Assumption- that the target with maximum count isunique.)Sample Input 1:nums = [1,100,200,1,100], key = 1Sample Output 1:  100Explanation :For target = 100, there are 2 occurrences at indices 1 and 4 which follow an occurrence of key.No other integers follow an occurrence of key, so we return 100.techtrionms11@gmail.com
// Sample Input 2: nums = [2,2,2,2,3], key = 2Sample Output 2:  2Explanation :For target = 2, there are 3 occurrences at indices 1, 2, and 3 which follow an occurrence of key.For target = 3, there is only one occurrence at index 4 which follows an occurrence of key.target=2hasthemaximumnumberofoccurrencesfollowinganoccurrenceofkey,sowereturn 2.Constraints:●2 <= nums.size() <= 1000●1 <= nums.get(i) <= 1000●Assume that the answer is unique.Hints: Count the number of times each target valuefollows the key in the arraylist.Choose the target with the maximum count and return it
import java.util.*;
import java.util.ArrayList;
import java.lang.Integer;
public class Most_frequent_number_key {
    public static int mostFrequent(ArrayList<Integer>nums,int key){

        int maxvalue=0;
        int target=0;
        for(int i=0;i<count.length;i++){
            
        }
    }
    public static void main(String[] args) {
        
    }
}