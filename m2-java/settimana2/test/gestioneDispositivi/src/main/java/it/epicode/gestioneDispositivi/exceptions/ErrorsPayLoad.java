package it.epicode.gestioneDispositivi.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
@Setter
public class ErrorsPayLoad {
	public ErrorsPayLoad(String message2, LocalDateTime now) {
		// TODO Auto-generated constructor stub
	}
	private String message;
	private LocalDateTime timestamp;
}