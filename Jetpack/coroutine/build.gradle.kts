plugins {
  id("comm.app-module")
}

android {
  defaultConfig {
    applicationId = "com.hsicen.coroutine"
  }

  kotlinOptions {
    jvmTarget = "11"
  }
}

dependencies {
  implementation(Deps.material)

  implementation(Deps.coroutinesCore)
  implementation(Deps.coroutinesAndroid)

  implementation(Deps.lifecycleRuntimeKtx)
  implementation(Deps.lifecycleViewmodelKtx)
}