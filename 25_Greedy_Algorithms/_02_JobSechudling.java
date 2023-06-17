import java.util.ArrayList;
import java.util.Collections;

public class _02_JobSechudling {

    char id ;
    int deadline, profit ;

    public _02_JobSechudling(){}

    public _02_JobSechudling(char id, int deadline, int profit){
        this.id = id ;
        this.deadline = deadline ;
        this.profit = profit ;
    }


    //  function Defination -> Greedy Approach..
    void printJobSequence(ArrayList<_02_JobSechudling> arr , int maxDeadline){

        int n = arr.size() ;

        // 1. Sort the jobs int the decreasing order of their profit .. 
        // lambda expression.. 
        // O(nlogn)
        Collections.sort(arr, (a,b) -> b.profit - a.profit) ;

        // Keep the track of the booked slot.. 
        boolean result[] = new boolean[maxDeadline] ;

        // To store the job ids.. 
        char jobs[] = new char[maxDeadline] ;

        // 2. to store the jobs ids according to the given deadline.. 
        // O(n^2)
        for(int i = 0 ; i < n ; i++){
            for(int j= Math.min(maxDeadline-1, arr.get(i).deadline -1); j>= 0; j--){
                if(result[j] == false){
                    result[j] = true ;
                    jobs[j] = arr.get(i).id ;
                    break ;
                }
            }
        }

        for(char id : jobs){
            System.out.print(id + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        ArrayList<_02_JobSechudling> arr = new ArrayList<>();

        arr.add(new _02_JobSechudling('1', 5, 55));
        arr.add(new _02_JobSechudling('2', 2, 65));
        arr.add(new _02_JobSechudling('3', 7, 75));
        arr.add(new _02_JobSechudling('4', 3, 60));
        arr.add(new _02_JobSechudling('5', 2, 70));
        arr.add(new _02_JobSechudling('6', 1, 50));
        arr.add(new _02_JobSechudling('7', 4, 85));
        arr.add(new _02_JobSechudling('8', 5, 68));
        arr.add(new _02_JobSechudling('9', 3, 45));

        System.out.print("Job Sequence to get the maximum profit is : ");

        _02_JobSechudling job = new _02_JobSechudling();
        
        job.printJobSequence(arr, 7);
    }
  }