package com.fdx.common.util;

/**
 * Thread for current developer context.
 */
public final class DeveloperContext {

  /**
   * Constructor
   */
  private DeveloperContext() {
  }

  private static final InheritableThreadLocal<String> currentDeveloper = new InheritableThreadLocal<>();

  /**
   * Set developer schema value.
   *
   * @param developerSchema value
   */
  public static void setDeveloperSchema(String developerSchema) {
    currentDeveloper.set(developerSchema);
  }

  /**
   * Get developer schema value.
   *
   * @return developerSchema value
   */
  public static String getDeveloperSchema() {
    return currentDeveloper.get();
  }

  /**
   * Clean up current developer context
   */
  public static void clear() {
    currentDeveloper.remove();
  }
}