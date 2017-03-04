import java.io.*;

/**
 * reated by Asus on 19.02.2017.C
 */
public class Runner {

    public static void main(String[] args) {

        String name = "src/input.txt";

        //write(name, " aaaaaaaaaaa ffbfb");

        StringBuilder sb = new StringBuilder();
        String oldFile = null;
        try {
            oldFile = read(name);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        sb.append(oldFile);

        String newText = "bbbbb";
        sb.append(newText);
        write(name, sb.toString());

    }

    public static void write(String fileName, String text) {
        //Определяем файл
        File file = new File(fileName);

        try {//проверяем, что если файл не существует то создаем его
            if (!file.exists()) {
                file.createNewFile();
            }

            //PrintWriter обеспечит возможности записи в файл
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());
            try {
                //Записываем текст в файл
                out.print(text);
            } finally {
                //После чего мы должны закрыть файл, иначе файл не запишется
                out.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String read(String fileName) throws FileNotFoundException {
        StringBuilder sb = new StringBuilder();
        try {
//Объект для чтения файла в буфер
            File file = new File("src/input.txt");
            BufferedReader in = new BufferedReader(new FileReader(file.getAbsoluteFile()));
            try {//В цикле построчно считываем файл
                String s;
                while ((s = in.readLine()) != null) {
                    sb.append(s);
                    sb.append("\n");
                }
            } finally {
                in.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }     //Возвращаем полученный текст с файла
        return sb.toString();
    }


}
