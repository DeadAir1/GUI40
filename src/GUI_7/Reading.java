package GUI_7;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reading {
    public static void main(String[] args) {
        try {
            Stream<String> lines= Files.lines(Paths.get("students.txt"), StandardCharsets.UTF_8);
                lines.filter(s-> Integer.parseInt(Arrays.stream(s.split(" +"))
                        .sorted(
                                Comparator.comparing(String::length)
                          )
                        .toList()
                        .get(0))>50)
                        .forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
//new Comparator<String>() {
//                            @Override
//                            public int compare(String o1, String o2) {
//                                if(o1.length()>o2.length()) return 1;
//                                if(o1.length()==o2.length()) return 0;
//                                return -1;
//                            }
//                        }