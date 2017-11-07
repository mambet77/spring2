package ru.javabegin.training.controllers;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ru.javabegin.training.objects.FileValidator;
import ru.javabegin.training.objects.UploadedFile;

@Controller
@ResponseBody
public class FileController {

	@Autowired
	FileValidator fileValidator;
	private static final Logger logger = LoggerFactory.getLogger(FileController.class);

	@RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
	@ResponseBody
	public ModelAndView uploadFile(@ModelAttribute("uploadedFile") UploadedFile uploadeFile,
			BindingResult bindingResult) {
		String name = null;
		// FileValidator fileValidator = new FileValidator();

		MultipartFile file = uploadeFile.getFile();

		fileValidator.validate(file, bindingResult);
		
		ModelAndView modelAndView = new ModelAndView();

		if (bindingResult.hasErrors()) {

			modelAndView.setViewName("main");
		}

		else {
			// redirectAttrs.addAttribute("file", file);
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

				return modelAndView;

			} catch (Exception e) {
				return modelAndView;
			}
		}
		return modelAndView;

	}
}
