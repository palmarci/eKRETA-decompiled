package p289hu.ekreta.ellenorzo.main;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u0013\b\u0016\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t¢\u0006\u0002\u0010\nB)\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\t¢\u0006\u0002\u0010\fR\u0017\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/main/MainNavigationData;", "", "viewState", "Lhu/ekreta/ellenorzo/main/MainViewState;", "(Lhu/ekreta/ellenorzo/main/MainViewState;)V", "uri", "", "(Ljava/lang/String;)V", "javaClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "activityClass", "(Lhu/ekreta/ellenorzo/main/MainViewState;Ljava/lang/String;Ljava/lang/Class;)V", "getActivityClass", "()Ljava/lang/Class;", "getUri", "()Ljava/lang/String;", "getViewState", "()Lhu/ekreta/ellenorzo/main/MainViewState;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.main.MainNavigationData */
/* compiled from: MainNavigationData.kt */
public final class MainNavigationData {

    /* renamed from: a */
    public final MainViewState f13707a;

    /* renamed from: b */
    public final String f13708b;

    /* renamed from: c */
    public final Class<?> f13709c;

    public MainNavigationData(MainViewState mainViewState) {
        Intrinsics.checkParameterIsNotNull(mainViewState, "viewState");
        this.f13707a = mainViewState;
        this.f13708b = null;
        this.f13709c = null;
    }

    /* renamed from: a */
    public final Class<?> mo13174a() {
        return this.f13709c;
    }

    /* renamed from: b */
    public final String mo13175b() {
        return this.f13708b;
    }

    /* renamed from: c */
    public final MainViewState mo13176c() {
        return this.f13707a;
    }

    public MainNavigationData(MainViewState mainViewState, String str, Class<?> cls) {
        this.f13707a = mainViewState;
        this.f13708b = str;
        this.f13709c = cls;
    }
}
