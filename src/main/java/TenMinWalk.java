public class TenMinWalk {

    public static boolean isValid(char[] walk){
        int northSouth = 0;
        int eastWest = 0;

        if(checkArrayLength(walk,10)){
            for (char c : walk) {
                if (c == 'n') {
                    northSouth++;
                }
                if (c == 's') {
                    northSouth--;
                }
                if (c == 'w') {
                    eastWest++;
                }
                if (c == 'e') {
                    eastWest--;
                }
            }
            return northSouth == 0 && eastWest == 0;
        }

        return false;

    }

    private static boolean checkArrayLength(char[] value,int number) {
        return value.length == number;
    }

}
