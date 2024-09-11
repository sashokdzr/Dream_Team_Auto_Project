package IO;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WriteToFile {
    public static void main(String[] args) {
        String pathName = "d:/example.txt";
        createFile(pathName);
        writeToFile(pathName, getCurrentDateTime() + " Write to file");
        System.out.println(getCurrentDateTime());
    }

    public static void createFile(String path){
        try {
            File file = new File(path);
            if (file.createNewFile()) {
                System.out.println("Файл создан");
            } else {
                System.out.println("Файл уже существует");
            }
        } catch (IOException e) {
            System.out.println("Ошибка при создании файла");
            e.printStackTrace();
        }
    }

    public static void writeToFile(String path, String text){
        try {
            FileWriter writer = new FileWriter(path, true);
            writer.append(text + "\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл");
            e.printStackTrace();
        }
    }

    public static String getCurrentDateTime(){
         return new SimpleDateFormat("yyyy-MM-dd[kk:mm:ss]").format(new Date());
    }

}
