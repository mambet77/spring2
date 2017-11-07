package ru.javabegin.training.objects;

import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.web.multipart.MultipartFile;
@Service
public class FileValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void validate(Object target, Errors errors) {

		MultipartFile file= (MultipartFile)target;
		
		if(file.getSize()==0)
			errors.rejectValue("file", "uploadForm.salectFile", "pleas select a file");

	}

}
