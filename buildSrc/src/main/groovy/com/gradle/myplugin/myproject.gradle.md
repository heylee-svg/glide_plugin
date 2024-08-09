
kapt {
    arguments {
        arg("AROUTER_MODULE_NAME", project.getName())
    }
}
dependencies {

//    implementation project(":core-net")
//    implementation project(":voicevision_res")
//    implementation project(":packitUI")
//    implementation project(":core-database")
    implementation project(":base")
    implementation(libs.okhttp)
    implementation(libs.okhttp.sse)
    implementation libs.retrofit


    implementation libs.gson

    implementation(libs.arouter.api)
    kapt(libs.arouter.compiler)
    implementation(libs.arouter.annotation)

    implementation libs.core.ktx
    implementation libs.androidx.fragment
    implementation libs.androidx.activity
    implementation libs.androidx.lifecycle.runtime
    implementation libs.androidx.appcompat


    implementation libs.androidx.room.runtime
    kapt libs.androidx.room.compiler
    implementation libs.androidx.room.ktx
//UI相关
    implementation libs.recycle.view
    implementation libs.google.material
    implementation(libs.glide)
}