package com.tmall.service.impl;

import com.google.common.collect.Lists;
import com.tmall.service.IFileService;
import com.tmall.util.FTPUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Service("iFileService")
public class FileServiceImpl implements IFileService {

    private Logger logger = LoggerFactory.getLogger(FileServiceImpl.class);

    public String upload(MultipartFile file, String path) {
        String fileName = file.getOriginalFilename();
        // 扩展名
        String fileExtensionName = fileName.substring(fileName.lastIndexOf(".")+1);
        String uploadFileName = UUID.randomUUID().toString() + "." + fileExtensionName;
        logger.info("开始上传文件，上传文件的文件名:{}，上传的路径:{}，新文件名:{}", fileName, path, uploadFileName);

        File fileDir = new File(path);
        if (!fileDir.exists()) {
            // 启用写权限
            fileDir.setWritable(true);
            fileDir.mkdirs();
        }
        // 文件
        File targetFile = new File(path, uploadFileName);

        try {
            // 文件上传成功
            file.transferTo(targetFile);
            // 已经上传到ftp服务器上
            FTPUtil.uploadFile(Lists.newArrayList(targetFile));
            // 删除upload下的文件
            targetFile.delete();
        } catch (IOException e) {
            logger.error("文件上传异常", e);
            return null;
        }

        return targetFile.getName();
    }

}
