package it.epicode.gestioneDispositivi.exceptions;

	import lombok.Getter;
	import org.springframework.validation.ObjectError;

	import java.util.List;

	@Getter
	public class BadRequestException extends RuntimeException {
		private List<ObjectError> errorsList;

		public BadRequestException(String message) {
			super(message);
		}

}
