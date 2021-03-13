import java.util.Random;
import java.util.stream.IntStream;

import static java.lang.Math.random;

public class URLRandomizer {
    Random random = new Random();
    public String UrlMaker (){
        String Url = "https://prnt.sc/";
        String UrlEdit = "";

        UrlEdit = UrlEdit + getRandomCharacter() + getRandomNumber() + getRandomCharacter() + getRandomCharacter() + getRandomCharacter() + getRandomNumber();

        Url = Url + UrlEdit;
        return Url;
    }
    private char getRandomCharacter(){
        return (char) ('a' + random() * ('z'-'a' + 1));
    }
    private Integer getRandomNumber(){
        Integer randomNumber = random.nextInt(10);
        return randomNumber;
    }
}
