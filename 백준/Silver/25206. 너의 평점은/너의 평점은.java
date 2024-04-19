import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        double sum = 0.0;
        double creditSum = 0.0;

        for (int i = 0; i<20; i++){
            st = new StringTokenizer(br.readLine(), " ");
            st.nextToken();
            double credit = Double.parseDouble(st.nextToken());
            double grade = gradeToNum(st.nextToken());
            if (!(grade == -1)){
                sum += (credit * grade);
                creditSum += credit;
            }
        }
        double avg = sum / creditSum;
        System.out.printf("%.6f\n", avg);

    }

    private static double gradeToNum(String grade) {
        switch (grade){
            case "A+" :
                return 4.5;
            case "A0" :
                return 4.0;
            case  "B+" :
                return 3.5;
            case "B0" :
                return 3.0;
            case "C+" :
                return 2.5;
            case  "C0" :
                return 2.0;
            case  "D+" :
                return 1.5;
            case  "D0" :
                return 1.0;
            case "F" :
                return 0.0;
            default:
                return -1;
        }
    }
}