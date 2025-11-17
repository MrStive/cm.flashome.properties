package cm.flashome.properties.domain.demo;

import java.util.List;

public interface DemoRepository {

  Demo save(Demo value);

  List<Demo> findAll();
}
