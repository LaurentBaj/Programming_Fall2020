public class obj {
    public String toRoman(int number) {
        String res = "";

        do {
            while (number >= 10 && number < 40) {
                number -= 10;
                res += "X";
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

        } while(number > 0);

        return res;
    }
}
