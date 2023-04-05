package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int sum = 0;
        for(int i=t; i!=0; i=i/10) {
            sum = sum+i%10;
        }
        if(t > 0){
            System.out.println(sum);
        } else{
            System.out.println(Math.abs(sum));
        }
    }
}
