package com.Diana.work;

import java.io.IOException;

/**
 * Created by Diana on 20.02.2017.
 */
public interface IFileCount {
    /**
     * This method must find new folder inside main folder. If result is true method must call himself.
     */
    public void searchFile(String path) throws IOException;

}
