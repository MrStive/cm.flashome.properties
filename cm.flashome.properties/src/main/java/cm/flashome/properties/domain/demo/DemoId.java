package cm.flashome.properties.domain.demo;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.UUID;

@Embeddable
@Getter
@Setter
public class DemoId implements Serializable {
  private String value;

  public DemoId() {
    super();
  }

  public DemoId(UUID value) {
    this.value = value.toString();
  }

  public UUID toUUID() {
    return UUID.fromString(value);
  }
}
