package average.laaptu.dagger

import average.laaptu.dagger.simple.PerActivity
import average.laaptu.dagger.simple.SimpleActivity
import average.laaptu.dagger.simple.SimpleModule
import dagger.Module
import dagger.Subcomponent
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModules {

    @PerActivity
    @ContributesAndroidInjector(modules = [SimpleModule::class])
    abstract fun bindsBaseActivity(): BaseActivity

    @PerActivity
    @ContributesAndroidInjector(modules = [SimpleModule::class])
    abstract fun bindSimpleActivity(): SimpleActivity

    @PerActivity
    @ContributesAndroidInjector(modules = [SimpleModule::class])
    abstract fun bindMainActivity(): MainActivity
}

