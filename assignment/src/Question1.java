//06WV2Z59
//B.K.

public class Question1 {
    public int getNumber(){
       return (int)(Math.random()*20);
    }
    public static void main(String[] args) {
        int checker = 0;
        int max = 5;

        for(int i = 0; i< max; i++){
            int num = getNumber();
            int calls = i;
            if(num%3!=0){
                checker++;
            }
            if(checker == 4){
                return calls;
            }
        }
        return -1;
    }
}
