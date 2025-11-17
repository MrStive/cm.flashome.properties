package cm.flashome.properties.domain.demo.impl;

import cm.flashome.properties.domain.demo.Demo;
import cm.flashome.properties.domain.demo.DemoData;
import cm.flashome.properties.domain.demo.DemoFactory;
import cm.flashome.properties.domain.demo.DemoName;
import cm.flashome.properties.domain.demo.DemoRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class DemoFactoryImpl implements DemoFactory {
  private final DemoRepository demoRepository;

  @Override
  public Demo create(DemoData demoData) {
    return demoRepository.save(Demo.builder().name(new DemoName(demoData.name())).build());
  }
}
