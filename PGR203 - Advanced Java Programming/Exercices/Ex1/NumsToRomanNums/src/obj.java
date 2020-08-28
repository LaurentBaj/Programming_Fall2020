public class obj {
    public String toRoman(int number) {
        String res = "";

        // Loops from Dante's Inferno
        while (number >= 1000) {
            res += "M";
            number -= 1000;
        }

        while (number >= 999) {
            res += "IM";
            number -= 999;
        }

        while (number >= 995) {
            res += "VM";
            number -= 995;
        }

        while (number >= 990) {
            res += "XM";
            number -= 990;
        }

        while (number >= 950) {
            res += "LM";
            number -= 950;
        }

        while (number >= 900) {
            res += "CM";
            number -= 900;
        }

        while (number >= 500) {
            res += "D";
            number -= 500;
        }

        while (number >= 499) {
            res += "ID";
            number -= 499;
        }

        while (number >= 495) {
            res += "VD";
            number -= 495;
        }

        while (number >= 490) {
            res += "XD";
            number -= 490;
        }

        while (number >= 450) {
            res += "LD";
            number -= 450;
        }

        while (number >= 400) {
            res += "CD";
            number -= 400;
        }

        while (number >= 100) {
            res += "C";
            number -= 100;
        }

        while (number >= 99) {
            res += "IC";
            number -= 99;
        }

        while (number >= 95) {
            res += "VC";
            number -= 95;
        }

        while (number >= 90) {
            res += "XC";
            number -= 90;
        }

        while (number >= 50) {
            res += "L";
            number -= 50;
        }

        while (number >= 49) {
            res += "IL";
            number -= 49;
        }

        while (number >= 45) {
            res += "VL";
            number -= 45;
        }

        while (number >= 40) {
            res += "XL";
            number -= 40;
        }

        while (number >= 10) {
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
}


