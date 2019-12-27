package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class SaveContentOfCatalogInList {
    public static List readFiles(File baseDirectory){
        List list = new ArrayList();
        int counter = 0;
        if (baseDirectory.isDirectory()){
            for (File file : baseDirectory.listFiles()) {
                if(!file.isFile() && counter < 5){
                    list.add(file);
                    counter++;
                    readFiles(file);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        List list = readFiles(new File("C:\\Users\\Давид\\IdeaProjects"));
        System.out.println("Первые 5 каталогов");
        for(Object element: list){
            System.out.println(element);
        }
    }
}
