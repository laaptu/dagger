package average.laaptu.dagger

import average.laaptu.dagger.simple.AppModule
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton


@Singleton
@Component(
    modules = [AndroidInjectionModule::class,
        AppModule::class,
        ActivityModules::class,
        FragmentModules::class]
)
interface AppComponent {
    fun injectApp(app: MainApplication)
}