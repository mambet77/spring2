package ru.javabegin.training.controllers;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@ResponseBody
public class FileController {

	private static final Logger logger = LoggerFactory.getLogger(FileController.class);

	@RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
	public String uploadFile(@RequestParam("file") MultipartFile file,  RedirectAttributes redirectAttrs) {
		String name = null;
		
		if (!file.isEmpty()) {
			redirectAttrs.addAttribute("file", file);
			try {
				byte[] bytes = file.getBytes();
				name = file.getOriginalFilename();
				String rootPath = System.getProperty("catalina.home");
				File dir = new File(rootPath + File.separator + "tmpFile");
				if (!dir.exists()) {
					dir.mkdirs();
				}

				File uploadedFile = new File(dir.getAbsolutePath() + File.separator + name);
				BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(uploadedFile));
				stream.write(bytes);
				stream.flush();
				stream.close();

				logger.info("uploaded:" + uploadedFile.getAbsolutePath());
				return "you successfully uploaded file =" + name;

			} catch (Exception e) {
				return "you failed to upload " + name + "=>" + e.getMessage();
			}
		} else {
			return "you failed to upload" + name + "becouse the file was empty";
		}

	}
}
