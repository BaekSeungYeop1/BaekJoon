class Solution {
    public String solution(String[] id_pw, String[][] db) {
         boolean id = false;
        boolean pass = false;
        boolean id_pass = false;

        for (int i = 0; i<db.length; i++){
            if (id_pw[0].equals(db[i][0])){
                id = true;
                if(id_pw[1].equals(db[i][1])){
                        id_pass = true;
                }
            }else if (id_pw[1].equals(db[i][1])){
                pass = true;
            }
        }
        if (!id){
            return "fail";
        }else if (!pass){
            return "wrong pw";
        }else if (id_pass){
            return "login";
        }

        return "wrong pw";
    }
}