import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int[] solution(String[] wallpaper) {
        
        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();
        for(int i = 0; i<wallpaper.length; i++){
            for(int j=0; j<wallpaper[0].length(); j++){
                if(wallpaper[i].charAt(j) == '#'){
                    x.add(i);
                    y.add(j);
                }
            }
        }
        Collections.sort(x);
        Collections.sort(y);
        
        return new int[]{x.get(0),y.get(0),x.get(x.size()-1)+1,y.get(y.size()-1)+1};
    }
}