package average.laaptu.dagger.simple

import dagger.Module
import dagger.Provides
import javax.inject.Scope

class ApiService {
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
class SimpleModule {
    @PerActivity
    @Provides
    fun getApiService(): ApiService = ApiService()
}


