package CommonPacks.FilesControl;

import java.io.*;

public class FileWriter {
    private String fileName;
    private File operateFile;

    FileWriter(String name) {
        changeFile(name);
    }

    /**
     * @param name: 文件名
     * @return
     */
    public boolean changeFile(String name) {
        if (name.equals(fileName)) {
            return false;
        } else {
            fileName = name;
            operateFile = new File(fileName);
            return true;
        }
    }

    /**
     * @param strings: 字符串数组
     */
    public void write(String[] strings) {
        String buffer = String.join("\n", strings);
        write(buffer);
    }


    /**
     * @param str: 字符串
     * @return boolean
     */
    public boolean write(String str) {
        try (
                PrintWriter output = new PrintWriter(operateFile);
        ) {
            output.write(str);
        } catch (IOException e) {
            return false;
        }
        return true;
    }

    /**
     * @return String
     */
    public String getFileName() {
        return fileName;
    }
}