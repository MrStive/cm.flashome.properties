package cm.flashome.properties.service;

import cm.flashome.properties.domain.demo.Demo;
import cm.flashome.properties.domain.demo.DemoFactory;
import cm.flashome.properties.domain.demo.DemoFetcher;
import cm.flashome.properties.domain.demo.DemoId;
import cm.flashome.properties.service.mapper.DemoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RequiredArgsConstructor
@Service
public class DemoService {
  private final DemoFactory demoFactory;
  private final DemoFetcher demoFetcher;
  private final DemoMapper demoMapper;

  @Transactional
  public UUID createDemo(DemoDTO data) {
    return Optional.ofNullable(data)
        .map(demoMapper::map)
        .map(demoFactory::create)
        .map(Demo::getId)
        .map(DemoId::getValue)
        .map(UUID::fromString)
        .orElseThrow();
  }

  @Transactional(readOnly = true)
  public List<DemoDTO> fetchAllDemos() {
    return demoFetcher.loadAllDemos().stream().map(demoMapper::map).toList();
  }
}
