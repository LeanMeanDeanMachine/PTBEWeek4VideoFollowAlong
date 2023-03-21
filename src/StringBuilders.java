public class StringBuilders {

    public static void main(String[] args) {

        String firstName = "Sally";
        String lastName = "Smith";
        System.out.println(firstName + " " + lastName);

        //multiply string by int method
        String tripleHi = multiplyString("Hi", 3);
        System.out.println(tripleHi);

        //concat function
        System.out.println(firstName.concat(lastName));

        //concat function does not change the values of variables themselves:
        System.out.println(firstName);

        //unless you reassign the value of the variable like so:
        firstName = firstName.concat(lastName);
        System.out.println(firstName);

        //this is because Strings are immutable. Once you assign a value to a String, it cannot be changed.
        //When you reassign a value to a String variable, the original value still remains in memory
        //when you concat Strings, it creates new Strings in memory with no refs in the console(?)
        //all these different strings remain in the memory, and this is called a memory leak.
        //You should only use immutable Strings with values that will not change much, if at all in the program.
        //For Strings that will change values, you instead want to use "String builders"

        //String Builder example:

        StringBuilder fullName = new StringBuilder("Sam");
        fullName.append(" Smith");
        System.out.println(fullName.toString());

        //StringBuilders are mutable, meaning that they can be changed in the code, stopping memory leaks

        System.out.println(fullName.charAt(5));
        //System.out.println(fullName.deleteCharAt(5));
        //System.out.println(fullName.delete(3,7));
        System.out.println(" ");    //Peace of Mind
        System.out.println(fullName.indexOf("it"));
        System.out.println(fullName.replace(4, 9, "Dean"));
        //System.out.println(fullName.reverse());
        System.out.println(fullName.replace(0, 3, "Robert"));

        // Use a StringBuilder when the String needs to be dynamic and changeable, use String
        //for Strings that will be constant in value.
    }



    //multiply string by int method
    public static String multiplyString(String str, int num) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < num; i++) {
            result.append(str);
        }
        return result.toString();
    }
}
