package average.laaptu.dagger

import average.laaptu.dagger.simple.SimpleActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModules {
    @ContributesAndroidInjector
    abstract fun bindSimpleActivity(): SimpleActivity
}