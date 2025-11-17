package cm.flashome.properties.domain.demo.impl;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class DemoFetcherImpl implements DemoFetcher {

  private final DemoRepository demoRepository;

  @Override
  public List<Demo> loadAllDemos() {
    return demoRepository.findAll();
  }
}
