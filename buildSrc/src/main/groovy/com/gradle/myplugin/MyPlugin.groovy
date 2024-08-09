import org.gradle.api.Plugin
import org.gradle.api.Project

    class MyPlugin implements Plugin<Project> {
        @Override
        void apply(Project target) {
            println("这是我的插件")
            target.dependencies {

//                implementation("androidx.constraintlayout:constraintlayout:2.1.4")
//                implementation target.gradle.getRootProject().project(":base")

            }

        }
    }