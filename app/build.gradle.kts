plugins {
    id("com.android.application")
    id("kotlin-android")
}

android {
    compileSdkVersion(30)
    buildToolsVersion("30.0.3")


    defaultConfig {
        applicationId = AndroidConfig.ID
        minSdkVersion(AndroidConfig.MIN_SDK_VERSION)
        targetSdkVersion(AndroidConfig.TARGET_SDK_VERSION)


        versionCode = AndroidConfig.VERSION_CODE
        versionName = AndroidConfig.VERSION_NAME

        testInstrumentationRunner = AndroidConfig.TEST_INSTRUMENTATION_RUNNER
    }

    buildTypes {

        getByName(BuildType.RELEASE) {
            isMinifyEnabled = false
            proguardFiles("proguard-android-optimize.txt", "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }
    dynamicFeatures = mutableSetOf(":feature_home")
}

dependencies {


    implementation(AppDependencies.kotlin)
    implementation(AppDependencies.androidAppCompat)
    implementation(AppDependencies.androidMaterial)
    implementation(AppDependencies.androidXCore)
    implementation(AppDependencies.navigationFragment)
    implementation(AppDependencies.navigationDynamic)
    implementation(AppDependencies.navigationUI)

    testImplementation(AppDependencies.testLibs.jUnit4)
    testImplementation(AppDependencies.testLibs.testExt)

    androidTestImplementation(AppDependencies.androidTestLibs.espressoCore)


}