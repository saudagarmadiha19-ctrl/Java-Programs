/*
Insert and Delete using StringBuilder
*/

class InsertDeleteSB {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.insert(5, " World");   // insert
        System.out.println(sb);
        sb.delete(5, 11);         // delete
        System.out.println(sb);
    }
}
