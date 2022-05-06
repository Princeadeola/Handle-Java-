package Week3.Meet;

public class WordScramble {
    private String solution;  // -solution : String
    //constructor
    public WordScramble() { // +WordScramble()
        solution = "NA";
    }
    //Setter
    public void setSolution(String str){ // +setSolution(str : String) : void
        solution = str.toUpperCase();
    }
    //Scrambles the solution String
    public String scramble(String str){ // +scramble(str : String) : String
        setSolution(str);
        String mix = "";
        int a = solution.indexOf("A");
        if (a >= 0) {
            mix = solution.substring(a).concat(solution.substring(0,a));
        }
        int e = solution.indexOf("E");
        if (e >= 0) {
            mix = solution.substring(e).concat(solution.substring(0,e));
        }
        int i = solution.indexOf("I");
        if (i >= 0) {
            mix = solution.substring(i).concat(solution.substring(0,i));
        }
        int oh = solution.indexOf("O");
        if (oh >= 0) {
            mix = solution.substring(oh).concat(solution.substring(0,oh));
        }
        int u = solution.indexOf("U");
        if (u >= 0) {
            mix = solution.substring(u).concat(solution.substring(0,u));
        }
        //reverse it in case it still looks like the original word
        System.out.println(mix);
        if (mix.equals(solution)){ // Error3: NO condition to check if it looks like original word
            return reverse(mix); // Error 2:- mix variable is not initialized -- initialized it to empty string
        }
         return mix;
    }
    //helper method to reverse the scrambled string
    private String reverse(String str){
        //base case
        if (str.isEmpty()){
            return str;
        }
        //Recursive call
        return reverse(str.substring(1)) + str.charAt(0);
        // Error 1: reverseString method not created -- replaced with reverse
    }
}
