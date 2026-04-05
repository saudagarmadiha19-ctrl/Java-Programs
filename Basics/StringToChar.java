/*
Convert string to char array
*/

class StringToChar {
    public static void main(String[] args) {
        String str = "hello";
        char[] arr = str.toCharArray();
        for(char c : arr) {
            System.out.print(c + " ");
        }
    }
}
