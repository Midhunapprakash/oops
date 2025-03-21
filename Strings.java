public class Strings {
       public static void main(String []args){
           String text = "Object Oriented Programming";
           System.out.println("original Text: "+text);
           System.out.println("\nThe given text is empty ->"+text.isEmpty());
           System.out.println("|nLength of the given text:"+text.length());
                  System.out.println("\nTo upper case:"+text.toUpperCase());
                  System.out.println("\nTo lower case:"+text.toLowerCase());
                  System.out.println("\nSubstring:"+text.substring(7));
                  System.out.println("\nsubsequence:"+text.subSequence(7,15));

                  System.out.println("\nreplace 0 with $:"+text.replace('0','$'));
                  System.out.println("\nreplace all text with java lab:"+text.replaceAll(text,"java lab"));
                  System.out.println("\nreplace first word:"+text.replaceFirst("object","java"));
                  System.out.println("\ncharacter at index 8:"+text.charAt(8));
                  int ascii = text.charAt(8);
                  System.out.println("\nascii value of character at index 8:"+ascii);
                  System.out.println("\nfirst index of character '0':"+text.indexOf('0'));
                  System.out.println("\nlast index of character '0':"+text.lastIndexOf('0'));
                  String text1 = "lab";
                  System.out.println("\nconcatination with 'lab':"+text.concat(" ").concat(text1));
                  System.out.println("\n_comparison_");
                  System.out.println("\nif the value is 0,both are equal.otherwise unequal!");
                  System.out.println("\ntext for comparison:oop->:"+ text.compareTo("oop"));
                  System.out.println("text for comparison:oop->"+text.compareTo("oop"));
}
}
