package com.example.mode.visitor;

import java.io.File;

/**
 * @author SimonWang
 * @Description 待访问的数据结构
 * @create 2020-05-12 9:58
 */
public class FileStructure {
    private File file;

    public void  handle(Visitor visitor) {
        scan(this.file, visitor);
    }

    private void scan(File file, Visitor visitor) {
        if (file.isDirectory()) {
            // 访问者处理文件
            visitor.visitDir(file);
            // 递归处理子文件夹:
            for(File sub : file.listFiles()){
                scan(sub, visitor);
            }
        } else if (file.isFile()) {
            // 让访问者处理文件:
            visitor.VisitFile(file);
        }

    }

    public FileStructure(File file) {
        this.file = file;
    }


}
