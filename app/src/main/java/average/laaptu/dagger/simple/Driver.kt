package average.laaptu.dagger.simple

import dagger.Module
import dagger.android.ContributesAndroidInjector
import javax.inject.Inject
import javax.inject.Scope

class ApiService @Inject constructor() {
    fun fetchSomeData(): String {
        println("Fetching data from web")
        return "Server Says Hello"
    }
}

@Scope
@MustBeDocumented
@Retention(AnnotationRetention.RUNTIME)
annotation class PerActivity


@Module
abstract class ActivityBindingModule {

    @ContributesAndroidInjector
    abstract fun bindSimpleActivity(): SimpleActivity
}

