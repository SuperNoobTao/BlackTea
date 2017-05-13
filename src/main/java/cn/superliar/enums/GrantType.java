package cn.superliar.enums;


public enum GrantType implements IntentStateWithDescription {

  PASSWORD("password"),
  REFRESH_TOKEN("refresh_token"),
  AUTHORIZATION_CODE("authorization_code"),;

  private final String description;

  GrantType(String description) {
    this.description = description;
  }

  @Override public String description() {
    return this.description;
  }

}
