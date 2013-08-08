package com.evanlily.java.nio;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

/**
 * User: 一米
 * Date: 13-7-29
 * Time: 上午9:20
 * Description:
 */
public class PathS {
    public static void main(String[] args) {
        Path path= Paths.get("E:\\WorkSpace\\Study\\java\\src\\main\\resources","file.txt");
        Path path2= Paths.get("E:\\WorkSpace\\Study\\java\\src\\main\\resources","object.txt");
        System.out.println(path.relativize(path2));
        System.out.println(path.getFileName());
        System.out.println(path.getRoot());
        Iterator<Path> iterator = path.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().getFileName());
        }
        Path base=Paths.get("E:","WorkSpace\\Study\\java\\src\\main\\resources");
        System.out.println(base.resolve("file.txt").toAbsolutePath());
    }
}
