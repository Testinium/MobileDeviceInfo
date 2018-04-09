package com.deviceinformation.deviceinfo.helper;

import java.io.IOException;

public class ProcessHelper {

    private ProcessHelper() {
    }

    public static Process runTimeExec(String runTimeExec) throws IOException {
        return Runtime.getRuntime().exec(runTimeExec);
    }
}
