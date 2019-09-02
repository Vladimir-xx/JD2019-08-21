package by.it.zavadski.jd01_06;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskA {
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder(Poem.text);
        Pattern pattern = Pattern.compile("[а-яёФ-яЁ]{4,}");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            int start=matcher.start();
            text.setCharAt(start+3,'#');
            if(matcher.group().length()>=7){
                text.setCharAt(start+6,'#');
            }
        }
        System.out.println(text);
    }
}

