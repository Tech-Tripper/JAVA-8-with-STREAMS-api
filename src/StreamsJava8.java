import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsJava8 {

    public static void main(String[] args) {

        List<String> letters = Arrays.asList("d","c", "b", "q");

        //Without Java-8 streams
        List<String> uppercaseLetters = new ArrayList<>();
        for(String s : letters){
            uppercaseLetters.add(s.toUpperCase());
        }
        System.out.println(letters);
        System.out.println(uppercaseLetters);

        //With Java 8 Streams
        List<String> lettersUpperCased = letters.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(lettersUpperCased);

        //Java 8 streams working with ints
        List<Integer> numbers = Arrays.asList(10,20,30,40,50,45,25);
        List<Integer> collect = numbers.stream().map(x -> x * 2).collect(Collectors.toList());
        System.out.println(collect);


        //JAVA-8 streams with Objects
        List<CEOs> ceo = Arrays.asList(new CEOs("Sundar Pichai",47,"Google", new BigDecimal(1000000)),
                new CEOs("Jeff Bezos",56,"Amazon", new BigDecimal(1000000)),
                new CEOs("Tim Cook",59,"Apple", new BigDecimal(1000000)),
                new CEOs("Reed Hastings",59,"Netflix", new BigDecimal(1000000)),
                new CEOs("Mark Zuckerberg",36,"FaceBook", new BigDecimal(1000000)),
                new CEOs("Satya Nadella",52,"Microsoft", new BigDecimal(1000000))
        );
// Without Java 8 streams
        List<String> names = new ArrayList<>();
        for(CEOs n : ceo){
            names.add(n.getName());
        }
        System.out.println(names);

        //Using JAVA-8 Streams
        List<Integer> alias = ceo.stream().map(n-> n.getAge()).collect(Collectors.toList());
        List<String> alias2 = ceo.stream().map(n-> n.getCompanyName()).collect(Collectors.toList());
        System.out.println(alias);
        System.out.println(alias2);


    }}

