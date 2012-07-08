package com.fitied.sinewy.game.raw.core;

// TODO: lots
public class TouchPanel {

  private static TouchCollection touches = new TouchCollection();

  public static TouchCollection GetState() {
    return touches;
  }
}
