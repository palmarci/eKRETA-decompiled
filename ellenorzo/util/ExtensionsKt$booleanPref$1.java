package p289hu.ekreta.ellenorzo.util;

import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\"\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00022\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0002¢\u0006\u0002\u0010\bJ%\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00022\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\u000b\u001a\u00020\u0003H\u0002¨\u0006\f"}, mo17463d2 = {"hu/ekreta/ellenorzo/util/ExtensionsKt$booleanPref$1", "Lkotlin/properties/ReadWriteProperty;", "", "", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Boolean;", "setValue", "", "value", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.ExtensionsKt$booleanPref$1 */
/* compiled from: Extensions.kt */
public final class ExtensionsKt$booleanPref$1 implements ReadWriteProperty<Object, Boolean> {

    /* renamed from: c */
    public final /* synthetic */ SharedPreferences f15332c;

    /* renamed from: e */
    public final /* synthetic */ String f15333e;

    /* renamed from: f */
    public final /* synthetic */ boolean f15334f;

    public ExtensionsKt$booleanPref$1(SharedPreferences sharedPreferences, String str, boolean z) {
        this.f15332c = sharedPreferences;
        this.f15333e = str;
        this.f15334f = z;
    }

    /* renamed from: a */
    public void mo16269a(Object obj, KProperty<?> kProperty, boolean z) {
        Intrinsics.checkParameterIsNotNull(obj, "thisRef");
        Intrinsics.checkParameterIsNotNull(kProperty, "property");
        this.f15332c.edit().putBoolean(this.f15333e, z).commit();
    }

    public /* bridge */ /* synthetic */ void setValue(Object obj, KProperty kProperty, Object obj2) {
        mo16269a(obj, kProperty, ((Boolean) obj2).booleanValue());
    }

    public Boolean getValue(Object obj, KProperty<?> kProperty) {
        Intrinsics.checkParameterIsNotNull(obj, "thisRef");
        Intrinsics.checkParameterIsNotNull(kProperty, "property");
        return Boolean.valueOf(this.f15332c.getBoolean(this.f15333e, this.f15334f));
    }
}
