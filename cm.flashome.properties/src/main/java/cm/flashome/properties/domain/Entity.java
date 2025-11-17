package cm.flashome.properties.domain;

import java.io.Serializable;

public interface Entity<T extends Serializable> {
  T getId();

  void setId(T id);

  boolean isDeleted();

  void markAsDeleted();

  void markAsNotDeleted();
}
