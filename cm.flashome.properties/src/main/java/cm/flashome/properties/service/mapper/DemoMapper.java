package cm.flashome.properties.service.mapper;

import cm.flashome.properties.domain.demo.Demo;
import cm.flashome.properties.domain.demo.DemoData;
import cm.flashome.properties.domain.demo.DemoName;
import org.mapstruct.BeanMapping;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.Optional;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface DemoMapper {
  @BeanMapping(ignoreByDefault = true)
  @Mapping(target = "name")
  @Mapping(target = "id")
  DemoData map(DemoDTO demoDTO);

  @BeanMapping(ignoreByDefault = true)
  @Mapping(target = "id", source = "id.value")
  @Mapping(target = "name")
  DemoDTO map(Demo demo);

  default String map(DemoName value) {
    return Optional.ofNullable(value).map(DemoName::getValue).orElse(null);
  }
}
