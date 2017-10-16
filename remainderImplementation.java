public class BaseConvert{
    public static String baseConvert(int input, int base) {
        char[36] digit = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B',
        'C', 'D', 'E', 'F', 'G' ,'H', 'I', 'J', 'K', 'L', 'M', 'N',
        'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        // Special Cases
        if(base < 2){
            //return error message
        }
        if(base > 37){
            //return error message
        }
        if(input == 0){
            return 0;
        }

        int temp;
        boolean sign;
        if(input < 0){
            temp = -input;
            sign = false;
        } else{
            temp = input;
            sign = true;
        }

        //Numerical Reconstruction
        int r;
        String in;
        while (temp > 0){
            r = temp % base;
            in = digit[r] + in
            temp -= r
            temp /= n
        }
        if(!sign)
            in = "-" + in;
        return in
    }
}
