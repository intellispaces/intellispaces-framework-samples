package intellispaces.samples.moduleproperties;

import intellispaces.framework.core.annotation.Channel;
import intellispaces.framework.core.annotation.Data;
import intellispaces.framework.core.annotation.Domain;

@Data
@Domain("4e7b79a6-c386-4bb7-8687-e91b15adadfd")
public interface AddressDomain {

  @Channel("bb0a84a8-6aed-4235-86b7-0303da9bd6bc")
  String city();

  @Channel("30635fb7-2ec3-4bc9-b2d6-dc957de04c15")
  String street();
}
