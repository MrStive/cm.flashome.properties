package cm.flashome.properties.config;

import cm.flashome.properties.domain.demo.DemoFactory;
import cm.flashome.properties.domain.demo.DemoFetcher;
import cm.flashome.properties.domain.demo.DemoRepository;
import cm.flashome.properties.domain.demo.impl.DemoFactoryImpl;
import cm.flashome.properties.domain.demo.impl.DemoFetcherImpl;
import cm.flashome.properties.repositories.DemoSpringRepository;
import cm.flashome.properties.repositories.impl.DemoRepositoryImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@RequiredArgsConstructor
@Configuration
public class PropertiesBeans {

  @Bean
  public DemoFactory demoFactory(DemoRepository demoRepository) {
    return new DemoFactoryImpl(demoRepository);
  }

  @Bean
  public DemoRepository demoRepository(DemoSpringRepository demoSpringRepository) {
    return new DemoRepositoryImpl(demoSpringRepository);
  }

  @Bean
  public DemoFetcher demoFetcher(DemoRepository demoRepository) {
    return new DemoFetcherImpl(demoRepository);
  }
 }
