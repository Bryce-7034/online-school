import java.util.ArrayList;

public class Digits {

    /** The list of digits from the number used to construct this object.
     * The digits appear in the list in the same order in which they appear
     * in the original number.
     */
    private ArrayList<Integer> digitList;

    /** Constructs a Digits object that represents num.
     * Precondition: num >= 0
     */
    public Digits(int num) {
        digitList = new ArrayList<Integer>();
        /* to be implemented in part (a) */
        while (num > 0) {
            digitList.add(0, num % 10);
            num = num / 10;
        }
    }

    public ArrayList getDigitList() {
        return digitList;
    }

    /** Returns true if the digits in this Digits object are in
     * strictly increasing order;
     * false otherwise.
     */
    public boolean isStrictlyIncreasing() {
        /* to be implemented in part (b) */
        for(int i = 0;i<digitList.size()-1;i++){
            if(digitList.get(i)>digitList.get(i+1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String [] args){
        Digits d = new Digits(14568);
        System.out.println(d.getDigitList());
        System.out.println(d.isStrictlyIncreasing());
    }
}
