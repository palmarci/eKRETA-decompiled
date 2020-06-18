package hu.ekreta.ellenorzo.configSettings;

import a.h.c.l;
import java.util.ArrayList;
import java.util.List;
import k.b.u;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\u0012\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f*\u00020\u0003H\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lhu/ekreta/ellenorzo/configSettings/ConfigurationProvider;", "", "appVersionName", "", "appVersionCode", "", "(Ljava/lang/String;J)V", "getAppVersionCode", "()J", "getAppVersionName", "()Ljava/lang/String;", "getConfiguration", "Lio/reactivex/Single;", "Lhu/ekreta/ellenorzo/configSettings/Configuration;", "toAndroidVersionCodes", "", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: ConfigurationProvider.kt */
public final class ConfigurationProvider {

    /* renamed from: a  reason: collision with root package name */
    public final String f5297a;
    public final long b;

    public ConfigurationProvider(String str, long j2) {
        Intrinsics.checkParameterIsNotNull(str, "appVersionName");
        this.f5297a = str;
        this.b = j2;
    }

    public final long a() {
        return this.b;
    }

    public final String b() {
        return this.f5297a;
    }

    public final u<Configuration> c() {
        u<Configuration> a2 = u.a(new ConfigurationProvider$getConfiguration$1(this));
        Intrinsics.checkExpressionValueIsNotNull(a2, "Single.create { subscrib…}\n            }\n        }");
        return a2;
    }

    public final List<Long> a(String str) {
        Object a2 = new l().a().a(str, BuildVersionByPlatform.Companion.a());
        Intrinsics.checkExpressionValueIsNotNull(a2, "GsonBuilder().create().f…ldVersionByPlatform.type)");
        ArrayList<BuildVersionByPlatform> arrayList = new ArrayList<>();
        for (Object next : (Iterable) a2) {
            if (Intrinsics.areEqual((Object) ((BuildVersionByPlatform) next).b(), (Object) "Android")) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        for (BuildVersionByPlatform a3 : arrayList) {
            arrayList2.add(Long.valueOf(Long.parseLong(a3.a())));
        }
        return arrayList2;
    }
}
