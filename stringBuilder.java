public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Apna college");
        System.out.println(sb);

        // char at index 0
        System.out.println(sb.charAt(0));

        //set char at index 0
        sb.setCharAt(0, 'S');
        System.out.println(sb);
        sb.setCharAt(0, 'A');

        //insert 
        sb.insert(1,'a');
        System.out.println(sb);

        //Delete 
        sb.delete(1, 2);
        System.out.println(sb);
        sb.delete(12, 12);
        System.out.println("Delete : " + sb);

        //Append
        sb.append("e");
        System.out.println(sb);

        //length
        System.out.println(sb.length());

        // reverse
        for(int i=0; i<sb.length()/2; i++){
            int front = i;
            int back = sb.length() - 1 - i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }

        System.out.println(sb);

    }
}
