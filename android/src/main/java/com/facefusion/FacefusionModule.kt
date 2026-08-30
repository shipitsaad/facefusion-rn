package com.facefusion

import com.facebook.react.bridge.ReactApplicationContext

class FacefusionModule(reactContext: ReactApplicationContext) :
  NativeFacefusionSpec(reactContext) {

  override fun multiply(a: Double, b: Double): Double {
    return a * b
  }

  companion object {
    const val NAME = NativeFacefusionSpec.NAME
  }
}
