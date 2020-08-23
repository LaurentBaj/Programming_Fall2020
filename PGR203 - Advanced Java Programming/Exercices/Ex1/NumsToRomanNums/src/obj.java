public class obj {
    public String toRoman(int number) {
        String res = "";


        while (number >= 10 && number < 40) {
            res += "X";
            number -= 10;
        }

        if (number == 9) {
            number -= 9;
            res += "IX";
        }
        if (number >= 5) {
            number -= 5;
            res += "V";
        }
        if (number == 4) {
            number -= 4;
            res += "IV";
        }
        for (int i = 0; i < number; number--) {
            res += "I";
        }
        return res;
    }

    public String decaKill(int num){
        String r = "";

        while (num >= 10 && num < 40) {
            r += "X";
            num -= 10;
        }
        return r;
    }
}


