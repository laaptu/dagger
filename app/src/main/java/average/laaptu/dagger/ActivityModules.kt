package average.laaptu.dagger

import average.laaptu.dagger.simple.SimpleActivity
import average.laaptu.dagger.simple.SimpleActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModules {
    @ContributesAndroidInjector(modules = [SimpleActivityModule::class])
    abstract fun bindSimpleActivity(): SimpleActivity
}