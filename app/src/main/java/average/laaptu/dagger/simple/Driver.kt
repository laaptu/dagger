package average.laaptu.dagger.simple

import dagger.Module
import dagger.Provides
import javax.inject.Scope
import javax.inject.Singleton

class ActiveService {
    fun fetchSomeData(): String {
        println("Fetching data from web")
        return "Server Says Hello"
    }
}

class AppService {
    fun showAppService() {
        println("You are using the Dagger app")
    }
}

class AppDb {
    fun storeToAppDb() {
        println("You are storing to the app db")
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
    fun getActiveService(): ActiveService = ActiveService()
}

@Module
class AppModule {
    @Singleton
    @Provides
    fun getAppDb(): AppDb = AppDb()

    @Singleton
    @Provides
    fun getAppService(): AppService = AppService()
}


