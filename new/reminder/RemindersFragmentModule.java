package hu.ekreta.ellenorzo.reminder;

import androidx.fragment.app.Fragment;
import h.p.w;
import h.p.x;
import hu.ekreta.ellenorzo.announcedTest.AnnouncedTestRepository;
import hu.ekreta.ellenorzo.di.ActivityModuleKt$createOrReUseViewModel$2;
import hu.ekreta.ellenorzo.di.FragmentScope;
import hu.ekreta.ellenorzo.homework.HomeworkRepository;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import l.a.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007J(\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007¨\u0006\u0012"}, d2 = {"Lhu/ekreta/ellenorzo/reminder/RemindersFragmentModule;", "", "()V", "ProvideViewModel", "Lhu/ekreta/ellenorzo/reminder/RemindersViewModel;", "fragment", "Lhu/ekreta/ellenorzo/reminder/RemindersFragment;", "provider", "Ljavax/inject/Provider;", "Lhu/ekreta/ellenorzo/reminder/RemindersViewModelImpl;", "provideReminderRepositories", "Ljava/util/ArrayList;", "Lhu/ekreta/ellenorzo/reminder/ReminderRepository;", "Lkotlin/collections/ArrayList;", "repo1", "Lhu/ekreta/ellenorzo/homework/HomeworkRepository;", "repo2", "Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTestRepository;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: RemindersFragmentModule.kt */
public final class RemindersFragmentModule {
    public final ArrayList<ReminderRepository> a(HomeworkRepository homeworkRepository, AnnouncedTestRepository announcedTestRepository) {
        Intrinsics.checkParameterIsNotNull(homeworkRepository, "repo1");
        Intrinsics.checkParameterIsNotNull(announcedTestRepository, "repo2");
        return CollectionsKt__CollectionsKt.arrayListOf(homeworkRepository, announcedTestRepository);
    }

    @FragmentScope
    public final RemindersViewModel a(RemindersFragment remindersFragment, a<RemindersViewModelImpl> aVar) {
        Intrinsics.checkParameterIsNotNull(remindersFragment, "fragment");
        Intrinsics.checkParameterIsNotNull(aVar, "provider");
        w a2 = g.a.a.b.a.a((Fragment) remindersFragment, (x.b) new ActivityModuleKt$createOrReUseViewModel$2(aVar)).a(RemindersViewModelImpl.class);
        Intrinsics.checkExpressionValueIsNotNull(a2, "ViewModelProviders.of(fr…iewModelImpl::class.java)");
        return (RemindersViewModel) a2;
    }
}
