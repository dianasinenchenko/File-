package com.Diana.work;

import java.io.IOException;
import java.io.File;

/**
 * Created by Diana on 20.02.2017.
 */
public class IFileCountImpl implements IFileCount {
    private File currentDirectory;
    private int fileCount = 0;

    /**
     * This method must find new folder inside main folder. If result is true method must call himself.
     *
     * @param path
     */
    @Override
    public void searchFile(String path) throws IOException {
        currentDirectory = new File(path);
        if (!currentDirectory.isDirectory()) {
            throw new IllegalArgumentException("Please specify directory!");
        }
        if (currentDirectory.isDirectory()) {
            File[] files = currentDirectory.listFiles();
            for (File file : files) {
                if (file.isDirectory())
                    searchFile(file.getPath());
            }
            for (File file : files) {
                int n = 0;
                if (file.isFile()) {
                    ++n;
                    System.out.println("File " + n + "   find " + file.getAbsolutePath());
                }
            }
        }
    }

    public int iFileCountImpl(String path) {
        File file = new File(path);
        File[] files = file.listFiles();
        for (int j = 0; j < files.length; j++) {
            if (!files[j].isDirectory())
                fileCount++;
            if (files[j].isDirectory())
                try {
                    searchFile(files[j].getPath());
                } catch (IOException e) {
                    e.printStackTrace();
                }

        }
        return fileCount;

    }
}
