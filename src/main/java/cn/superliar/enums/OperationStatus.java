package cn.superliar.enums;


public enum OperationStatus implements IntentStateWithDescription {

  SUCCESS("Operate success"),
  FAILURE("Operate failed"),
  TIMEOUT("Time out"),;

  private final String description;

  OperationStatus(String description) {
    this.description = description;
  }

  @Override public String description() {
    return this.description;
  }

}
