public class Les1a2 {
    public static void main (String[] args)
    {
        String MyName="Slim Shady Eminemovich";
        String MyName1="SLIM SHADY EMINEMOVICH";
        char[] Surname= new char[12];
        System.out.println("Shady - " + MyName.length());
        System.out.println("Slim - " + MyName.isEmpty());
        System.out.println("Eminemovich - " + MyName.charAt(1) + MyName.charAt(7) + MyName.charAt(11));
        MyName.getChars(0, 7, Surname, 5);
        String Surname2=String.valueOf(Surname);
        System.out.println("Slim - " + Surname2);
        System.out.println("Slim Shady Eminemovich - " + MyName.equals(MyName1));
        System.out.println("My name is? - " + MyName.equalsIgnoreCase(MyName1));
        System.out.println("startsWith - " + MyName.startsWith(Surname2));
        System.out.println("startsWith - " + MyName.endsWith(Surname2));
        String Name1=" Slim";
        System.out.println("concat - " + Surname2.concat(Name1));
        System.out.println("replace - " + MyName1.replace(" ", "_"));
        System.out.println("contains - " + MyName.contains(Name1));
    }
}
