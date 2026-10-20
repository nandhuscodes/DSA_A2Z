public class ReportCard {
    public int findAverage(int a, int b, int c){
        return  (a+b+c) / 3;
    }
    public String isPass(int score){
        return score>=40?"Pass":"Fail";
    }
}
