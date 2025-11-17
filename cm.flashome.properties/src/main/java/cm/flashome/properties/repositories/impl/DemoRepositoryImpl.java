package cm.flashome.properties.repositories.impl;

import cm.flashome.properties.domain.demo.Demo;
import cm.flashome.properties.domain.demo.DemoRepository;
import cm.flashome.properties.repositories.DemoSpringRepository;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class DemoRepositoryImpl implements DemoRepository {
  private final DemoSpringRepository demoSpringRepository;

  @Override
  public Demo save(Demo value) {
    return demoSpringRepository.save(value);
  }

  @Override
  public List<Demo> findAll() {
    return new ArrayList<>(demoSpringRepository.findAll());
  }
}
