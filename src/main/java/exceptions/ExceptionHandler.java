package exceptions;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandler {
	@org.springframework.web.bind.annotation.ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	public Map<String, String> handleInvalidArgument(MethodArgumentNotValidException ex){
		Map<String,String> val = new HashMap<String, String>();
		ex.getBindingResult().getFieldErrors().forEach(error ->{
			val.put(error.getField(),error.getDefaultMessage());
		});
		return val;
	}

}
