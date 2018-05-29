package pl.sdacademy.pp.part1;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exercise4 {
    public void inputSum(String file) {
        Integer numb = 0;
        Integer sum = 0;
        Path filePath = Paths.get(file);
        try (BufferedReader reader = Files.newBufferedReader(filePath, StandardCharsets.UTF_8)){
            String line = null;
            while ((line = reader.readLine()) != null) {
                numb = Integer.parseInt(line);
                sum += numb;
                System.out.println(sum);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
