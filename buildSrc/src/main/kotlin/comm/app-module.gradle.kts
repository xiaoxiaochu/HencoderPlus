package commimport Depsimport TestDepsimport Versionsimport extensions.androidimport extensions.androidTestImplementationimport extensions.implementationimport extensions.testImplementation/** * 作者：hsicen  11/3/21 10:17 * 邮箱：codinghuang@163.com * 功能： * 描述：android application modle comm configration */plugins {  id("com.android.application")  id("kotlin-android")}android {  compileSdk = Versions.compileSdk  defaultConfig {    minSdk = Versions.minSdk    targetSdk = Versions.targetSdk    versionCode = Versions.versionCode    versionName = Versions.versionName    testInstrumentationRunner = TestDeps.runner  }  buildTypes {    getByName("release") {      isMinifyEnabled = false      proguardFiles(        getDefaultProguardFile("proguard-android-optimize.txt"),        "proguard-rules.pro"      )    }  }}dependencies {  testImplementation(TestDeps.junit)  androidTestImplementation(TestDeps.junitExt)  androidTestImplementation(TestDeps.espresso)  implementation(fileTree(Deps.fileMap))  implementation(Deps.kotlinStb)  implementation(Deps.appCompat)  implementation(Deps.ktx)  implementation(Deps.constrainLayout)}