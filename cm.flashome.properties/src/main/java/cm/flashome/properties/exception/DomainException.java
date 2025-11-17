package cm.flashome.properties.exception;

import lombok.Getter;

@Getter
public class DomainException extends RuntimeException {
  public DomainException(String message) {
    super(message);
  }
}
