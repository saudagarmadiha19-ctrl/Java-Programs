/*
Concept: StringBuilder (mutable string)
*/

class StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");   // add text
        System.out.println(sb);
    }
}
