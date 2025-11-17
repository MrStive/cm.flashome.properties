package cm.flashome.properties.repositories;

import cm.flashome.properties.domain.demo.Demo;
import cm.flashome.properties.domain.demo.DemoId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DemoSpringRepository extends JpaRepository<Demo, DemoId> {}
