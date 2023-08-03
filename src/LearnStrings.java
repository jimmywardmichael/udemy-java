public class LearnStrings {
    public static void main(String[] args) {
//        String fruit = "apple";
//        String anotherFruit = "apple";
//        String vegetable = new String("broccoli");
//        String anotherVegetable = new String("broccoli");
//
//        System.out.println(fruit == anotherFruit);//prints true because same part of memory
//        System.out.println(vegetable == anotherVegetable);//prints false because different part of memory location

//        String myText ="abcdefg";
//        System.out.println(myText.toUpperCase());
//
//        String myText2 = "ABCDEFG";
//        System.out.println(myText2.toLowerCase());

//        String myText = "";
//        System.out.println(myText.isEmpty());//prints true
//        System.out.println(myText.isBlank());//prints true
//
//        String myText2 = "";
//        System.out.println(myText2.isEmpty());
//        System.out.println(myText2.isBlank());

//        String myText = "here's my awesome firf text";
//        System.out.println(myText.replace("firf", "nice"));

//        String firstName = "  Jake  ";
//        System.out.format("'%s'", firstName.stripIndent());

//        String firstName = "       John     ";
//        System.out.format("'%s'", firstName.trim()); //.trim removes whitespace from John leading and trailing
        //prints out 'John'

//        String myText = "Apples";
//        System.out.println(myText.charAt(3));

//        String firstWord = "Dad";
//        String secondWord = "dad";
//
//        System.out.println(compareToIgnoreCase(firstWord, secondWord));
//
//    }
//
//    public static int compareToIgnoreCase(String text1, String text2) {
//        String lowerText1 = text1.toLowerCase();
//        String lowerText2 = text2.toLowerCase();
//        return lowerText1.compareTo(lowerText2);
//    }//this prints out 0 when comparing firstWord to secondWord because they are both lowercase and equal.

//        String myText = "Four score and seven years ago";
//        System.out.println(myText.contains());
//        String text1 = "this is my text1";
//        String text2 = " this is my text2";
//        System.out.println(text1 + text2); //this is my text1 this is my text2
//        System.out.println(text1.concat(text2)); //this is my text1 this is my text2

//        String phoneNumber = "(234) 333-5551";
//        String areaCode = parseAreaCode(phoneNumber);
//        String exchange = parseExchange(phoneNumber);
//        String lineNumber = parseLineNumber(phoneNumber);
//
//        System.out.println(areaCode);
//        System.out.println(exchange);
//        System.out.println(lineNumber);
//    }
//
//    public static String parseAreaCode(String phoneNumber) {
//        int openParens = phoneNumber.indexOf("(");
//        int closeParens = phoneNumber.indexOf(")");
//        String areaCode = phoneNumber.substring(openParens + 1, closeParens);
//        return areaCode;
//    }
//
//    public static String parseExchange(String phoneNumber) {
//        int spaceIdx = phoneNumber.indexOf(" ");
//        int hypenIdx = phoneNumber.indexOf("-");
//        String exchange = phoneNumber.substring(spaceIdx + 1, hypenIdx);
//        return exchange;
//    }
//
//    public static String parseLineNumber(String phoneNumber) {
//        int hyphenIdx = phoneNumber.indexOf("-");
//        String lineNumber = phoneNumber.substring(hyphenIdx + 1);
//        return lineNumber;



        //////////////*******.split() Method below showing how to use a multiline String using the """  """***********



//        String text = """
//                Smith,Fred,1/1/79,1111 ABC St.,Apple,CA
//                McGuire,Jerry,2/2/80,2222 DEF St.,Orange,NV
//                Flintstone,Fred,3/3/81,3333 GHI St.,Pear,MO
//                Rubble,Barney,4/4/82,4444 JKL St.,Pineapple,IL
//                Jetson,George,5/5/83,5555 MNO St.,Grapefruit,TX
//                """;
//        String[] people = text.split("\n");
//        System.out.println(people.length);
//        //prints out 5 by parsing String into rows
//        System.out.println(people[2]);
//        //prints out the string in the array which is Flintstone,Fred
//        String[] split = people[4].split(",");
//        System.out.println(split[4]);//Grapefruit
//        System.out.println(split[0]);//Jetson
//        System.out.println(split[1]);//George
        String fileName = "myfile.txt";
        System.out.println(fileName.startsWith("myfile.txt"));
        System.out.println(fileName.endsWith(".txt"));


    }
}
