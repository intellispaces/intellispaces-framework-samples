package tech.intellispaces.framework.samples.moduleproperties.model;

import tech.intellispaces.framework.core.annotation.Data;
import tech.intellispaces.framework.core.annotation.Domain;

@Data
@Domain
public interface Contact {

  int home();

  int office();
}
