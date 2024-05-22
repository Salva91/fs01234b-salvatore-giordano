package epicode.u5d8hw.exceptions;

import java.time.LocalDateTime;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class ErrorsPayload {
    public ErrorsPayload(String message2, LocalDateTime now) {
		// TODO Auto-generated constructor stub
	}
	private String message;
    private LocalDateTime timestamp;
}