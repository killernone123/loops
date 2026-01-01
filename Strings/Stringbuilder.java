public class Stringbuilder {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("");
        sb.append("Piyush");

        // sb.insert(2, "hi");

        // sb.delete(2, 4);


        // sb.deleteCharAt(1);

        // sb.replace(2, 3, "HI");


        // sb.reverse();

        // System.out.println(sb.charAt(0));

        //  System.out.println(sb.length());

        // System.out.println(sb.substring(2, 4));

        // System.out.println(sb.toString());

        // System.out.println(sb.indexOf("P"));

        // System.out.println(sb.lastIndexOf("P"));

        sb.setCharAt(1, 'x');
        
        System.out.println(sb);
    }
}  