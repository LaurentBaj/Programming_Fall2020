public class RomanConverter {
    public String convert(int number) {
        String romanNum = "";

        if (number > 3999) {
            return "Error";
        }

        String[] romanNumbers = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        Integer[] normalNumbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        for(int i = 0; i < normalNumbers.length; i++) {
            while(number >= normalNumbers[i]) {
                number -= normalNumbers[i];
                romanNum += romanNumbers[i];
            }
        }
        return romanNum;
    }
}
