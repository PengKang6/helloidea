package com.demo.springDemo;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

@Controller("fileUploadController")
public class FileUploadController {
    @RequestMapping("/upload")
    @ResponseBody
    public String testResponseJson(String picName, MultipartFile multipartFile){
        String originalFilename = multipartFile.getOriginalFilename();
        String extendName = originalFilename.substring(originalFilename.lastIndexOf(".") + 1);
        String uuid = UUID.randomUUID().toString().replace("-", "").toUpperCase();
        String fileName = "";
        if (!StringUtils.isEmpty(picName)){
            fileName = uuid + "_" + picName + "." + extendName;
        }else {
            fileName = uuid + "_" + originalFilename;
        }
        System.out.println(fileName);
        return "success";
    }
}
