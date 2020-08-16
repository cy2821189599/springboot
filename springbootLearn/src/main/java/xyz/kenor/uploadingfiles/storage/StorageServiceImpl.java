package xyz.kenor.uploadingfiles.storage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.stream.Stream;

/**
 * @author ：kenor
 * @date ：Created in 2020/8/16 19:51
 * @description：
 * @version: 1.0
 */

@Service
public class StorageServiceImpl implements StorageService {

    Logger log = LoggerFactory.getLogger(StorageServiceImpl.class);

    @Override
    public void init() {

    }

    @Override
    public String store(MultipartFile file) {
        if (file.isEmpty()) {
            return "please choose a file to upload!";
        }
        String fileName = file.getOriginalFilename();
        String suffixName = fileName.substring(fileName.lastIndexOf("."));
        log.info(String.format("上传文件名为：%s，后缀名为：%s", fileName, suffixName));
        String filePath = "E://temp/data/";
        String path = filePath + fileName;
        File storeFile = new File(path);
        if (!storeFile.getParentFile().exists()) {
            storeFile.getParentFile().mkdir();
        }
        String msg = null;
        try {
            file.transferTo(storeFile);
            msg = "You successfully uploaded";
        } catch (IOException e) {
            log.info(e.getMessage());
            msg = "You failed to upload";
        }
        return msg;
    }

    @Override
    public Stream<Path> loadAll() {
        return null;
    }

    @Override
    public Path load(String filename) {
        return null;
    }

    @Override
    public Resource loadAsResource(String filename) {
        return null;
    }

    @Override
    public void deleteAll() {

    }
}
