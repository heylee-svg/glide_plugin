import org.gradle.api.Plugin
import org.gradle.api.Project

class NextCloudPlugin implements Plugin<Project> {
    @Override
    void apply(Project target) {
        println("这是我的插件")
//        project.plugins.withId("kotlin-kapt") {
//            project.extensions.getByType(org.jetbrains.kotlin.gradle.tasks.KotlinCompile).kapt {
//                arguments {
//                    arg("AROUTER_MODULE_NAME", project.name)
//                }
//            }
//        }

        target.dependencies {
            implementation target.gradle.getRootProject().project(":base")
            implementation("com.squareup.okhttp3:okhttp:5.0.0-alpha.11")
            implementation("com.squareup.okhttp3:okhttp-sse:5.0.0-alpha.11")
            implementation("com.squareup.retrofit2:retrofit:2.9.0")
            implementation("androidx.core:core-ktx:1.13.1")
//            implementation("com.google.code.gson:gson:2.10.1")
//            implementation("com.alibaba:arouter-compiler:1.5.2")
//            implementation("com.alibaba:arouter-annotation:1.0.6")
//            implementation("com.alibaba:arouter-api:1.5.2")
//
////            implementation("androidx.core:core-ktx:1.9.0")
//
////            implementation("androidx.appcompat:appcompat:1.6.1")
////            implementation("androidx.activity:activity-ktx:1.6.1")
////            implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.5.1")
//
//
//
//            implementation("androidx.room:room-runtime:2.5.0")
//            implementation("androidx.room:room-compiler:2.5.0")
//            implementation("androidx.room:room-ktx:2.5.0")
////UI相关
            implementation("androidx.recyclerview:recyclerview:1.2.1")
////            implementation("com.google.android.material:material:1.8.0")
            implementation("com.github.bumptech.glide:glide:4.16.0")

            //UI相关


        }


    }
}