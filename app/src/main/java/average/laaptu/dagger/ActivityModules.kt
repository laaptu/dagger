package average.laaptu.dagger

import average.laaptu.dagger.simple.*
import dagger.Module
import dagger.Subcomponent
import dagger.android.AndroidInjectionModule
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

@Module
abstract class FragmentModules {
    @PerFragment
    @ContributesAndroidInjector(modules = [ForFragmentModule::class])
    abstract fun bindsSimpleFragment(): SimpleFragment
}

