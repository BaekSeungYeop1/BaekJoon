import java.util.HashMap;
import java.util.ArrayList;
class Solution {
    public static int[] solution(String today, String[] terms, String[] privacies) {

        ArrayList<Integer> result = new ArrayList<>();
        HashMap<String,Integer> term = new HashMap<>();

        // 약관의 유효기간
        for(int i= 0; i<terms.length; i++){
            String[] period = terms[i].split(" ");
            term.put(period[0],Integer.parseInt(period[1]));
        }

        //
        for(int i = 0; i<privacies.length; i++){
            String[] startDay = privacies[i].split(" ");
            String[] day = startDay[0].split("\\.");
            int year = Integer.parseInt(day[0]);
            int month = Integer.parseInt(day[1]) + term.get(startDay[1]);
            int dday = Integer.parseInt(day[2]) -1;

            if(month>12){
                if ((month%12) == 0){
                    year += (month/12)-1;
                    month = 12;
                }else {
                    year += (month/12);
                    month = month%12;
                }
            }

            if(dday<1){
                dday = 28;
                month -= 1;
                if (month==0){
                    year -= 1;
                    month = 12;
                }
            }
            if (getPastPeriod(today, year, month, dday)){
                result.add(i+1);
            }

        }
        int[] answer = new int[result.size()];
        for (int i = 0 ; i < result.size() ; i++) {
            answer[i] = result.get(i).intValue();
        }

        return answer;
    }

    public static boolean getPastPeriod(String today,int year, int month, int day){
        String[] todayArr = today.split("\\.");
        if(Integer.parseInt(todayArr[0]) > year){
            return true;
        }
        if(Integer.parseInt(todayArr[0]) == year && Integer.parseInt(todayArr[1]) > month){
            return true;
        }
        if(Integer.parseInt(todayArr[0]) == year && Integer.parseInt(todayArr[1]) == month && Integer.parseInt(todayArr[2]) > day){
            return true;
        }
        return false;
    }
}