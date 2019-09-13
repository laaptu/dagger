package average.laaptu.dagger

import average.laaptu.dagger.simple.PerActivity
import average.laaptu.dagger.simple.SimpleActivity
import average.laaptu.dagger.simple.SimpleModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModules {
    @PerActivity
    @ContributesAndroidInjector(modules = [SimpleModule::class])
    abstract fun bindSimpleActivity(): SimpleActivity
}