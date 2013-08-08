package com.evanlily.java.nio;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.util.Set;

/**
 * User: 一米
 * Date: 13-8-3
 * Time: 下午4:09
 * Description:
 */
public class FileSystemS {
     final  static Path path= FileSystems.getDefault().getPath("E:\\WorkSpace\\Study\\java\\src\\main\\resources", "file.txt");
    public static void main(String[] args) {
        createSymbolicLink();

    }

    /**
     * 系统支持的文件属性
     */
    public static void supportedFileAttributeViews(){
        FileSystem fileSystem= FileSystems.getDefault();
        Set<String> views = fileSystem.supportedFileAttributeViews();
        for (String view : views) {
            System.out.println(view);
        }
    }

    /**
     * get basic attribute
     */
    public static void getBasicFileAttributes(){
        try {
            BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
            System.out.println(basicFileAttributes.size());
            //other way to get attribute
            Long size = (Long) Files.getAttribute(path, "basic:size", LinkOption.NOFOLLOW_LINKS);
            System.out.println(size);
            System.out.println(basicFileAttributes.creationTime());
            System.out.println(basicFileAttributes.lastModifiedTime());
            System.out.println(basicFileAttributes.isDirectory());
            System.out.println(basicFileAttributes.isOther());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void updateBasicFileAttributes(){
        try {
            FileTime fileTime = FileTime.fromMillis(System.currentTimeMillis());
            Files.getFileAttributeView(path, BasicFileAttributeView.class).setTimes(fileTime,fileTime,fileTime);
            //other way
            Files.setAttribute(path,"basic:lastModifiedTime",fileTime,LinkOption.NOFOLLOW_LINKS);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void getPosixFileAttributes(){
        try {
            PosixFileAttributes posixFileAttributes = Files.readAttributes(path, PosixFileAttributes.class);
            System.out.println(posixFileAttributes.owner().getName());
            System.out.println(posixFileAttributes.group().getName());
            System.out.println(posixFileAttributes.permissions());
           //
            Set<PosixFilePermission> posixFilePermissions = PosixFilePermissions.fromString("rw-r--r");
            GroupPrincipal group = path.getFileSystem().getUserPrincipalLookupService().lookupPrincipalByGroupName("group");
            UserPrincipal name = path.getFileSystem().getUserPrincipalLookupService().lookupPrincipalByName("name");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getFileStores(){
        try {
            FileSystem fileSystem = FileSystems.getDefault();
            Iterable<FileStore> fileStores = fileSystem.getFileStores();
            for (FileStore fileStore : fileStores) {
                System.out.println(fileStore.name());
                System.out.println(fileStore.getUsableSpace()/1024);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void createSymbolicLink(){
        Path link=FileSystems.getDefault().getPath("link");
        try {
            Files.createSymbolicLink(link,path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
