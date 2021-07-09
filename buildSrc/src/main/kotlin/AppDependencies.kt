object AppDependencies {
    val kotlin = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"

    val navigationFragment =
        "androidx.navigation:navigation-fragment-ktx:${Versions.androidNavigation}"

    val androidXCore = "androidx.core:core-ktx:${Versions.androidXCore}"

    val androidAppCompat = "androidx.appcompat:appcompat:${Versions.androidAppCompat}"

    val androidMaterial = "com.google.android.material:material:${Versions.androidMaterial}"

    val navigationUI = "androidx.navigation:navigation-ui-ktx:${Versions.androidNavigation}"

    //Dynamic Features Modules Support - Navigation Components
    val navigationDynamic =
        "androidx.navigation:navigation-dynamic-features-fragment:${Versions.androidNavigation}"


    object testLibs {
        val jUnit4 = "junit:junit:${Versions.jUnit}"

        val testExt = "androidx.test.ext:junit:${Versions.testExt}"

    }

    object androidTestLibs {
        val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    }


}


object Versions {

    val espresso = "3.4.0"
    val testExt = "1.1.3"


    val jUnit = "4.+"


    val androidMaterial = "1.4.0"
    val androidAppCompat = "1.3.0"
    val kotlin = "1.5.10"

    val androidXCore = "1.6.0"
    val androidNavigation = "2.3.5"
}


