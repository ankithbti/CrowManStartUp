package com.fitied.sinewy.game.raw.core;

public class MathHelper {

  public static float Clamp(float x, float min, float max) {
    if (x < min) {
      return min;
    }
    if (x > max) {
      return max;
    }
    return x;
  }
}
