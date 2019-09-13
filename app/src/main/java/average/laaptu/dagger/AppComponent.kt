package average.laaptu.dagger

import dagger.Component
import dagger.android.AndroidInjectionModule

@Component(modules = [AndroidInjectionModule::class, ActivityModules::class])
interface AppComponent {
    fun injectApp(app: MainApplication)
}