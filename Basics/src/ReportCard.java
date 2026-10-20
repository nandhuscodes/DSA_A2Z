public class ReportCard {
    public int findAverage(int a, int b, int c){
        return  (a+b+c) / 3;
    }
    public String isPass(int score){
        return score>=40?"Pass":"Fail";
    }
    public String isSubjectWisePass(int a, int b, int c){
        String report = "";
        if(a<40){
            report += " Fail in a by "+ (40-a);
        }
        if(b<40){
            report+= " Fail in b by "+ (40-b);
        }
        if(c<40){
            report+= " Fail in c by "+ (40-c);
        }
        return report.isEmpty() ?"Pass":report;
    }
}
