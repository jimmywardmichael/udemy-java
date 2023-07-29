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

        String firstName = "       John     ";
        System.out.format("'%s'", firstName.trim()); //.trim removes whitespace from John leading and trailing
            //prints out 'John'


    }
}
