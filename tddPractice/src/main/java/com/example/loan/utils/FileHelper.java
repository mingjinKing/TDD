package com.example.loan.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;


public class FileHelper {
    public static String getAbsolutePath(String filePath) {
        String absolutePath = FileHelper.class.getClassLoader().getResource(filePath).getPath();
        return convertToUtf8(absolutePath);
    }

    public static String convertToUtf8(String absolutePath) {
        try {
            absolutePath = URLDecoder.decode(absolutePath, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return absolutePath;
    }
}
