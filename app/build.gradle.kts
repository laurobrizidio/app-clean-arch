plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-kapt")
    id("androidx.navigation.safeargs.kotlin")


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

    buildFeatures {
        viewBinding = true
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


    api(AppDependencies.kotlin)
    api(AppDependencies.androidAppCompat)
    api(AppDependencies.androidMaterial)
    api(AppDependencies.androidXCore)
    api(AppDependencies.navigationFragment)
    api(AppDependencies.navigationDynamic)
    api(AppDependencies.navigationUI)

    testImplementation(AppDependencies.testLibs.jUnit4)
    testImplementation(AppDependencies.testLibs.testExt)

    androidTestImplementation(AppDependencies.androidTestLibs.espressoCore)


}