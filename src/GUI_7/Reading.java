package GUI_7;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reading {
    public static void main(String[] args) throws IOException {
        //Zadanie A
        /*try {
            Stream<String> lines= Files.lines(Paths.get("students.txt"), StandardCharsets.UTF_8);
                lines.filter(s-> Integer.parseInt(Arrays.stream(s.split(" +"))
                        .sorted(
                                Comparator.comparing(String::length)
                          )
                        .toList()
                        .get(0))>50)
                        .sorted(Comparator.reverseOrder())
                        .forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/
        //Zadanie C
        try {
            Stream<String> lines= Files.lines(Paths.get("students.txt"), StandardCharsets.UTF_8);
            lines.filter(s-> Integer.parseInt(Arrays.stream(s.split(" +"))
                            .sorted(
                                    Comparator.comparing(String::length)
                            )
                            .toList()
                            .getFirst())>50)
                    .sorted(Comparator.reverseOrder())
                    .map(s-> s.split(" +"))
                    .collect(Collectors.toMap(arr-> Arrays.stream(arr).filter(s->s.matches("\\d{2}\\w")).findFirst(),
                            arr->Arrays.asList(Arrays.stream(arr).filter(s-> s.matches("\\w+")), Arrays.stream(arr).filter(s->s.matches("\\d{2}")))))
                    .forEach((key,value)-> System.out.println(key+ " " + value));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
