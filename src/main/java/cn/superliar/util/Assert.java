package cn.superliar.util;


public class Assert {

  public static void defaultNotNull(Object obj) {
    final String IS_NULL = " is null";
    org.springframework.util.Assert.notNull(obj, obj.getClass().getSimpleName() + IS_NULL);
  }
}
